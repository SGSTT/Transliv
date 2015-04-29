/*
 */
package beans;

import daos.ClienteDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import modelos.Cliente;

@ManagedBean
@RequestScoped
public class ClienteBean {
    private Cliente selectedCliente;
    private List<Cliente> clientes;
    private List<SelectItem> comboCliente;
    
    public ClienteBean() {
        selectedCliente = new Cliente();
        clientes = new ArrayList<>();
    }
    
    public Cliente getSelectedCliente(){
        return selectedCliente;
    }
    public void setSelectedCliente(Cliente selectedCliente){
        this.selectedCliente = selectedCliente;
    }
    public List<Cliente> getClientes(){
        ClienteDao clDao = new ClienteDao();
        clientes = clDao.listarTodos();
        return clientes;
    }
    public List<SelectItem> getComboCliente(){
        comboCliente = new ArrayList();
        ClienteDao clDao = new ClienteDao();
        List<Cliente> listaClientes = clDao.listarTodos();
        for(Cliente cliente: listaClientes){
            SelectItem selectItem = new SelectItem(cliente.getIdCliente(), cliente.getNombre());
            comboCliente.add(selectItem);
        }
        return comboCliente;
    }
}