/*
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelos.Servicio;

@ManagedBean
@RequestScoped
public class ServicioBean {
    private Servicio selectedServicio;
    
    public ServicioBean() {
        this.selectedServicio = new Servicio();
    }
    
    public Servicio getSelectedServicio(){
        return selectedServicio;
    }
    public void setSelectedServicio(Servicio selectedServicio){
        this.selectedServicio = selectedServicio;
    }
}