/*
 */
package daos;

import java.util.List;
import modelos.Servicio;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;
import util.Util;

public class ServicioDao {
    
    public Servicio getServicio(int idServicio){
        Servicio servicio = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Servicio where idServicio = '"+idServicio+"'";
        try{
            sesion.beginTransaction();
            servicio = (Servicio) sesion.createQuery(consulta).uniqueResult();
            sesion.close();
        }catch(HibernateException ex){
            sesion.beginTransaction().rollback();
        }
        return servicio;
    }
    
    public List<Servicio> listarTodos(){
        List<Servicio> listado = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Servicio as s left join fetch s.tipoServicio";
        try{
            listado = sesion.createQuery(consulta).list();
            sesion.beginTransaction().commit();
            sesion.close();
        }catch(HibernateException ex){
            sesion.beginTransaction().rollback();
        }
        return listado;
    }
    
    public void registrarServicio(Servicio servicio){
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        try{
            sesion.save(servicio);
            sesion.beginTransaction().commit();
            sesion.close();
        }catch(HibernateException ex){
            sesion.beginTransaction().rollback();
            Util.enviarMensajeError(ex.getMessage());
            return;
        }
        Util.enviarMensajeExito("Registro Exitoso! =D");
    }
}