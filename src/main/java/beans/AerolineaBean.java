/*
 */
package beans;

import daos.AerolineaDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import modelos.Aerolinea;

@ManagedBean
@RequestScoped
public class AerolineaBean {
    private List<SelectItem> comboAerolinea;
    
    public AerolineaBean() {
    }
    
    public List<SelectItem> getComboAerolinea(){
        comboAerolinea = new ArrayList();
        AerolineaDao aeDao = new AerolineaDao();
        List<Aerolinea> listaAerolineas = aeDao.listarTodos();
        for(Aerolinea aerolinea: listaAerolineas){
            SelectItem selectItem = new SelectItem(aerolinea.getIdaerolinea(), aerolinea.getDescripcion());
            comboAerolinea.add(selectItem);
        }
        return comboAerolinea;
    }
}