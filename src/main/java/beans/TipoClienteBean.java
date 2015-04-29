/*
 */
package beans;

import daos.TipoClienteDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import modelos.TipoCliente;

@ManagedBean
@RequestScoped
public class TipoClienteBean {
    private List<SelectItem> listaTipoCliente;
    
    public TipoClienteBean() {  
    }
    
    public List<SelectItem> getListaTipoCliente(){
        this.listaTipoCliente = new ArrayList<>();
        TipoClienteDao tipoClienteDao = new TipoClienteDao();
        List<TipoCliente> tipos = tipoClienteDao.selectedTipo();
        for(TipoCliente tipo : tipos){
            SelectItem selectItem = new SelectItem(tipo.getIdTipoCliente() ,tipo.getTipoCliente());
            this.listaTipoCliente.add(selectItem);
        }
        return listaTipoCliente;
    }
}