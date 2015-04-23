/*
 */
package beans;

import daos.TipoClienteDao;
import daos.TipoClienteDaoI;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import modelos.TipoCliente;

@ManagedBean
@RequestScoped
public class TipoClienteBean {
    private List<SelectItem> listTipoCliente;
    
    public List<SelectItem> getListTipoCliente(){
        this.listTipoCliente = new ArrayList<>();
        TipoClienteDao tipoClienteDao = new TipoClienteDaoI();
        List<TipoCliente> tipos = tipoClienteDao.selectItems();
        for(TipoCliente tipo : tipos){
            SelectItem selectItem = new SelectItem(tipo.getIdtipoCliente(), tipo.getDescripcion());
            this.listTipoCliente.add(selectItem);
        }
        return listTipoCliente;
    }
}