/*
 */
package daos;

import java.util.List;
import modelos.TipoCliente;
import org.hibernate.classic.Session;
import util.HibernateUtil;

public class TipoClienteDaoI implements TipoClienteDao{
    @Override
    public List<TipoCliente> selectItems() {
        List<TipoCliente> listado = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        String sql = "FROM TipoCliente";
        try{
            listado = sesion.createQuery(sql).list();
            sesion.beginTransaction().commit();
            sesion.close();
        }catch(Exception e){
            sesion.beginTransaction().rollback();
        }
        return listado;
    }
}