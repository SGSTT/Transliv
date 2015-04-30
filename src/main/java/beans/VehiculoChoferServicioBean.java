/*
 */
package beans;


import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.event.ActionEvent;
import modelos.Servicio;
import util.Util;

@ManagedBean
@RequestScoped
public class VehiculoChoferServicioBean {
    Servicio ser = new Servicio();
    String idVehiculo;
    int idServicio = ser.getIdservicio();
    
    public VehiculoChoferServicioBean() {
    }
    
    public void insertarVehiculoServicio(ActionEvent ev){
        if(idVehiculo.equals("0")){
            Util.enviarMensajeError("Seleccionar un vehiculo"); return;
        }        
    }
}