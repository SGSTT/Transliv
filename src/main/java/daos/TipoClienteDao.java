/*
 */
package daos;

import java.util.List;
import modelos.TipoCliente;

public interface TipoClienteDao {
    public List<TipoCliente> selectItems();
}