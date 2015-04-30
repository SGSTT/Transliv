/*
 */
package daos;

import java.util.List;
import modelos.Aerolinea;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

public class AerolineaDao {
    
    public List<Aerolinea> listarTodos(){
        List<Aerolinea> listado = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Aerolinea";
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