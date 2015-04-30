/*
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelos.Cobro;

@ManagedBean
@RequestScoped
public class CobroBean {
    private Cobro selectedCobro;
    
    public CobroBean() {
        selectedCobro = new Cobro();
    }
    
    public Cobro getSelectedCobro(){
        return selectedCobro;
    }
    public void setSelectedCobro(Cobro selectedCobro){
        this.selectedCobro = selectedCobro;
    }
    
    public void insertarCobro(Cobro cobro){
        
    }
}