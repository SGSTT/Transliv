/*
 */
package daos;

import java.util.List;
import modelos.Cliente;

public interface ClienteDao {
    public Cliente findByCliente(Cliente cliente);
    public List<Cliente> findAll();
    public List<Cliente> selectItems();
}