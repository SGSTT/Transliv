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
    private List<SelectItem> comboTipoCliente;
    
    public TipoClienteBean() {  
    }
    
    public List<SelectItem> getListaTipoCliente(){
        this.comboTipoCliente = new ArrayList<>();
        TipoClienteDao tipoClienteDao = new TipoClienteDao();
        List<TipoCliente> tipos = tipoClienteDao.selectedTipo();
        for(TipoCliente tipo : tipos){
            SelectItem selectItem = new SelectItem(tipo.getIdTipoCliente() ,tipo.getTipoCliente());
            this.comboTipoCliente.add(selectItem);
        }
        return comboTipoCliente;
    }
}