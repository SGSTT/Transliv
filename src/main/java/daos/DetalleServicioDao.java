/*
 */
package daos;

import modelos.ServicioDetalle;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

public class DetalleServicioDao {
    public boolean registrarDetalle(ServicioDetalle detalleServicio){
        boolean aux = false;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        try{
            sesion.save(detalleServicio);
            sesion.beginTransaction().commit();
            sesion.close();
            aux=true;
        }catch(HibernateException ex){
            sesion.beginTransaction().rollback();
        }
        return aux;
    }
}