/*
 */
package beans;

import daos.TrasladistaDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import modelos.Trasladista;

@ManagedBean
@RequestScoped
public class TrasladistaBean {
    private List<SelectItem> comboTrasladista;
    
    public TrasladistaBean() {
    }
    
    public List<SelectItem> getComboTrasladista(){
        comboTrasladista = new ArrayList<>();
        TrasladistaDao trDao = new TrasladistaDao();
        List<Trasladista> listaTrasladistas = trDao.listarTodos();
        for(Trasladista trasladista : listaTrasladistas){
            SelectItem selectItem = new SelectItem(trasladista.getIdtrasladista(), trasladista.getNombre());
            comboTrasladista.add(selectItem);
        }
        return comboTrasladista;
    }
}