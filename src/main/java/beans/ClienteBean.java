/*
 */
package beans;

import daos.ClienteDao;
import daos.ClienteDaoI;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import modelos.Cliente;

@ManagedBean
@RequestScoped
public class ClienteBean implements Serializable{
    private List<SelectItem> selectCliente;
    private List<Cliente> clientes;
    private Cliente selectedCliente;
    private List<SelectItem> listClientes;
    
    public ClienteBean() {
        this.clientes = new ArrayList<>();
        this.selectedCliente = new Cliente();
    }    
    public List<Cliente> getClientes(){
        ClienteDao clienteDao = new ClienteDaoI();
        this.clientes = clienteDao.findAll();
        return clientes;
    }
    public Cliente getSelectedCliente() {
        return selectedCliente;
    }
    public void setSelectedCliente(Cliente selectedCliente) {
        this.selectedCliente = selectedCliente;
    }
    public List<SelectItem> getListClientes(){
        this.listClientes = new ArrayList();
        ClienteDao clienteDao = new ClienteDaoI();
        List<Cliente> clientess = clienteDao.findAll();
        for(Cliente cliente : clientess){
            SelectItem selectItem = new SelectItem(cliente.getIdcliente(), cliente.getNombres());
            this.listClientes.add(selectItem);
        }
        return listClientes;
    }
}