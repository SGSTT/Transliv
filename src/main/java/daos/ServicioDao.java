/*
 */
package daos;

import modelos.Servicio;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

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
    
    public boolean registrarServicio(Servicio servicio){
        boolean aux = false;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        try{
            sesion.save(servicio);
            sesion.beginTransaction().commit();
            sesion.close();
            aux = true;
        }catch(HibernateException ex){
            sesion.beginTransaction().rollback();
        }
        return aux;
    }
}