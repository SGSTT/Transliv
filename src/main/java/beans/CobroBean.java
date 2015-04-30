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
    private int idTipoMoneda;
     
    public CobroBean() {
        selectedCobro = new Cobro();
        idTipoMoneda = 0;
    }
    
    public int getIdTipoMoneda(){
        return idTipoMoneda;
    }
    public void setIdTipoMoneda(int idTipoMoneda){
        this.idTipoMoneda = idTipoMoneda;
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