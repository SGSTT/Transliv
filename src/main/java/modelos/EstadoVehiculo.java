package modelos;
// Generated 29-abr-2015 10:53:26 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * EstadoVehiculo generated by hbm2java
 */
@Entity
@Table(name="estado_vehiculo"
    ,catalog="sgstt"
)
public class EstadoVehiculo  implements java.io.Serializable {


     private int idestadoVehiculo;
     private String descripcion;
     private Set vehiculos = new HashSet(0);

    public EstadoVehiculo() {
    }

	
    public EstadoVehiculo(int idestadoVehiculo) {
        this.idestadoVehiculo = idestadoVehiculo;
    }
    public EstadoVehiculo(int idestadoVehiculo, String descripcion, Set vehiculos) {
       this.idestadoVehiculo = idestadoVehiculo;
       this.descripcion = descripcion;
       this.vehiculos = vehiculos;
    }
   
     @Id 

    
    @Column(name="idestado_vehiculo", unique=true, nullable=false)
    public int getIdestadoVehiculo() {
        return this.idestadoVehiculo;
    }
    
    public void setIdestadoVehiculo(int idestadoVehiculo) {
        this.idestadoVehiculo = idestadoVehiculo;
    }

    
    @Column(name="descripcion", length=45)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="estadoVehiculo")
    public Set getVehiculos() {
        return this.vehiculos;
    }
    
    public void setVehiculos(Set vehiculos) {
        this.vehiculos = vehiculos;
    }




}

