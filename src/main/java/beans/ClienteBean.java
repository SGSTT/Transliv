/*
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelos.Cliente;

@ManagedBean
@RequestScoped
public class ClienteBean {
    private Cliente selectedCliente;
    
    public ClienteBean() {
        selectedCliente = new Cliente();        
    }
    
    public Cliente getSelectedCliente(){
        return selectedCliente;
    }
    public void setSelectedCliente(Cliente selectedCliente){
        this.selectedCliente = selectedCliente;
    }      
}