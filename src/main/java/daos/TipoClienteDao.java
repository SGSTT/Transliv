/*
 */
package daos;

import java.util.List;
import modelos.TipoCliente;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import util.HibernateUtil;

public class TipoClienteDao {
    public List<TipoCliente> selectedTipo(){
        List<TipoCliente> lista = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        String consulta = "FROM TipoCliente";
        try{
            lista = sesion.createQuery(consulta).list();
            sesion.beginTransaction().commit();
            sesion.close();
        }catch(HibernateException e){
            sesion.beginTransaction().rollback();
        }
        return lista;
    }
}