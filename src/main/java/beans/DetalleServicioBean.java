/*
 */
package beans;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelos.Servicio;

@ManagedBean
@RequestScoped
public class DetalleServicioBean {
    Servicio servicio = new Servicio();
    private int idServicioDetalle;
    
    public DetalleServicioBean() {
        idServicioDetalle = servicio.getIdservicio();
    }
    
    public int getIdServicioDetalle(){
        return idServicioDetalle;
    }
    public void setIdServicioDetalle(int idServicioDetalle){
        this.idServicioDetalle = idServicioDetalle;
    }
}