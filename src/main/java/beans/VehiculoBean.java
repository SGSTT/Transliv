/*
 */
package beans;

import daos.VehiculoDao;
import java.util.ArrayList;
import java.util.List;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.RequestScoped;
import javax.faces.model.SelectItem;
import modelos.Vehiculo;

@ManagedBean
@RequestScoped
public class VehiculoBean {
    private List<SelectItem> comboVehiculo;
    private Vehiculo selectedVehiculo;
    
    public VehiculoBean() {
        selectedVehiculo = new Vehiculo();
    }
    
    public Vehiculo getSelectedVehiculo(){
        return selectedVehiculo;
    }
    public void setSelectedVehiculo(Vehiculo selectedVehiculo){
        this.selectedVehiculo = selectedVehiculo;
    }
    public List<SelectItem> getComboVehiculo(){
        comboVehiculo = new ArrayList<>();
        VehiculoDao veDao = new VehiculoDao();
        List<Vehiculo> listaVehiculos = veDao.listarVehiculosDisponibles();
        for(Vehiculo vehiculo : listaVehiculos){
            SelectItem selectItem = new SelectItem(vehiculo.getIdvehiculo(), vehiculo.getPlaca());
            comboVehiculo.add(selectItem);
        }
        return comboVehiculo;
    }
}