/*
 */
package beans;

import daos.ChoferDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import modelos.Chofer;

@ManagedBean
@RequestScoped
public class ChoferBean {
    private List<SelectItem> comboChofer;
        
    public ChoferBean() {
    }
    
    public List<SelectItem> getComboChofer(){
        comboChofer = new ArrayList();
        ChoferDao choDao = new ChoferDao();
        List<Chofer> listaChoferes = choDao.listarTodos();
        for(Chofer chofer: listaChoferes){
            SelectItem selectItem = new SelectItem(chofer.getIdchofer(), chofer.getNombre());
            comboChofer.add(selectItem);
        }
        return comboChofer;
    }
}