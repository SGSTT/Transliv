/*
 */
package daos;

import modelos.Cobro;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

public class CobroDao {
    
    public boolean insertarCobro(Cobro cobro){
        boolean aux = false;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        try{
            sesion.save(cobro);
            sesion.beginTransaction().commit();
            sesion.close();
            aux = true;
        }catch(HibernateException ex){
            sesion.beginTransaction().rollback();
        }
        return aux;
    }
}