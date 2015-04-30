/*
 */
package daos;

import java.util.List;
import modelos.Trasladista;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

public class TrasladistaDao {
    
    public List<Trasladista> listarTodos(){
        List<Trasladista> listado = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Trasladista";
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