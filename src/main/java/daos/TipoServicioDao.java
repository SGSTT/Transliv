/*
 */
package daos;

import java.util.List;
import modelos.TipoServicio;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

public class TipoServicioDao {
    public List<TipoServicio> listarTodos(){
        List<TipoServicio> listado = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM TipoServicio";
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