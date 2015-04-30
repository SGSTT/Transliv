/*
 */
package daos;

import java.util.List;
import modelos.Chofer;
import modelos.Servicio;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

public class ChoferDao {
    
    public List<Chofer> listarTodos(){
        List<Chofer> listado = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Chofer";
        try{
            listado = sesion.createQuery(consulta).list();
            sesion.beginTransaction().commit();
            sesion.close();
        }catch(HibernateException ex){
            sesion.beginTransaction().rollback();            
        }
        return listado;
    }
    
    public Chofer getChofer(int idChofer){
        Chofer chofer = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Chofer where idChofer = '"+idChofer+"'";
        try{
            sesion.beginTransaction();
            chofer = (Chofer) sesion.createQuery(consulta).uniqueResult();
            sesion.close();
        }catch(HibernateException ex){
            sesion.beginTransaction().rollback();
        }
        return chofer;
    }
}