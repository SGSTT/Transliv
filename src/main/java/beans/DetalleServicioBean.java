/*
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import modelos.Servicio;
import modelos.ServicioDetalle;

@ManagedBean
@RequestScoped
public class DetalleServicioBean {    
    Servicio servicio = new Servicio();
    private int idServicioDetalle;
    private ServicioDetalle selectedDetalle;
    
    public DetalleServicioBean() {
        selectedDetalle = new ServicioDetalle();
        idServicioDetalle = servicio.getIdservicio();
    }
    public ServicioDetalle getSelectedDetalle(){
        return selectedDetalle;
    }
    public void setSelectedDetalle(ServicioDetalle selectedDetalle){
        this.selectedDetalle = selectedDetalle;
    }
    
    public int getIdServicioDetalle(){
        return idServicioDetalle;
    }
    public void setIdServicioDetalle(int idServicioDetalle){
        this.idServicioDetalle = idServicioDetalle;
    }
    
    public void insertarDetalleServicio(ActionEvent ev){
        
    }
}