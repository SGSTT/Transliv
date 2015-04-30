/*
 */
package beans;

import daos.ServicioDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.event.ActionEvent;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import modelos.Servicio;

@ManagedBean
@RequestScoped
public class ServicioBean {
    String hora;
    String fecha;
    private Servicio selectedServicio;    
    private List<Servicio> servicios;
    
    public ServicioBean() {        
        this.selectedServicio = new Servicio();
        servicios = new ArrayList<>();
    }
    public List<Servicio> getServicios(){
        ServicioDao serDao = new ServicioDao();
        servicios = serDao.listarTodos();
        return servicios;
    }
    public Servicio getSelectedServicio(){
        return selectedServicio;
    }
    public void setSelectedServicio(Servicio selectedServicio){
        this.selectedServicio = selectedServicio;
    }
    
    public void insertarServicio(ActionEvent e){
        try{
            ServicioDao serDao = new ServicioDao();
            serDao.registrarServicio(selectedServicio);
        }catch(Exception ex){
            
        }
    }
}