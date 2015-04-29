/*
 */
package daos;

import java.util.List;
import modelos.Cliente;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;


public class ClienteDao {
    
    public List<Cliente> listarTodos(){
        List<Cliente> listado = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM Cliente c left join fetch u.TipoCliente";
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