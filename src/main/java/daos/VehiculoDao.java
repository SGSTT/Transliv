/*
 */
package daos;

import java.util.List;
import modelos.Vehiculo;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

public class VehiculoDao {
    
    public Vehiculo getVehiculo(int idVehiculo){
        Vehiculo vehiculo = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Vehiculo where idVehiculo = '"+idVehiculo+"'";
        try{
            sesion.beginTransaction();
            vehiculo = (Vehiculo) sesion.createQuery(consulta).uniqueResult();
            sesion.close();
        }catch(HibernateException ex){
            sesion.beginTransaction().rollback();
        }
        return vehiculo;
    }
    
    public List<Vehiculo> listarTodos(){
        List<Vehiculo> listado = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Vehiculo";
        try{
            listado = sesion.createQuery(consulta).list();
            sesion.beginTransaction().commit();
            sesion.close();
        }catch(HibernateException ex){
            sesion.beginTransaction().rollback();
        }
        return listado;
    }
   
    public List<Vehiculo> listarVehiculosDisponibles(){
        List<Vehiculo> listado = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Vehiculo as v left join fetch v.estadoVehiculo where v.estadoVehiculo.idestadoVehiculo = 1";
        try{
            listado = sesion.createQuery(consulta).list();
            sesion.beginTransaction().commit();
            sesion.close();
        }catch(HibernateException ex){
            sesion.beginTransaction().rollback();
        }
        return listado;
    }
}