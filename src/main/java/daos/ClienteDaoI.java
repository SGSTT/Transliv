/*
*/
package daos;

import java.util.List;
import modelos.Cliente;
import org.hibernate.Session;
import util.HibernateUtil;

public class ClienteDaoI implements ClienteDao{
    @Override
    public Cliente findByCliente(Cliente cliente) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public List<Cliente> findAll() {
        List<Cliente> listado = null;
        Session sesion = HibernateUtil.getSessionFactory().openSession();
        String consulta="FROM Cliente ";
        return null;
    }

    @Override
    public List<Cliente> selectItems() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
