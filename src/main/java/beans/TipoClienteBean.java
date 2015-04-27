/*
 */
package beans;

import daos.TipoClienteDao;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import modelos.TipoCliente;

@ManagedBean
@RequestScoped
public class TipoClienteBean {
    private List<SelectItem> listTipo;
    
    public List<SelectItem> getListTipo(){
        this.listTipo = new ArrayList<>();
        TipoClienteDao tipoClienteDao = new TipoClienteDao();
        List<TipoCliente> tipos = tipoClienteDao.selectTipo();
        for(TipoCliente tipo : tipos){
            SelectItem selectItem = new SelectItem(tipo.getIdtipoCliente(), tipo.getDescripcion());
            this.listTipo.add(selectItem);
        }
        return listTipo;
    }
}