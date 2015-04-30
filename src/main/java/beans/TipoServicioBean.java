/*
 */
package beans;

import daos.TipoServicioDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import modelos.TipoServicio;

@ManagedBean
@RequestScoped
public class TipoServicioBean {
    private List<SelectItem> comboTipoServicio;
    private TipoServicio selectedTipoServicio;
    
    public TipoServicioBean() {
        selectedTipoServicio = new TipoServicio();
    }
    
    public TipoServicio getSelectedTipoServicio(){
        return selectedTipoServicio;
    }
    public void setSelectedTipoServicio(TipoServicio selectedTipoServicio){
        this.selectedTipoServicio = selectedTipoServicio;
    }
    
    public List<SelectItem> getComboTipoServicio(){
        comboTipoServicio = new ArrayList<>();
        TipoServicioDao tDao = new TipoServicioDao();
        List<TipoServicio> listaTipo = tDao.listarTodos();
        for(TipoServicio tipo : listaTipo){
            SelectItem selectItem = new SelectItem(tipo.getIdtipoServicio(), tipo.getDescripcion());
            comboTipoServicio.add(selectItem);
        }
        return comboTipoServicio;
    }
}