package modelos;
// Generated 29-abr-2015 23:38:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * TipoVehiculo generated by hbm2java
 */
@Entity
@Table(name="tipo_vehiculo"
    ,catalog="sgstt"
)
public class TipoVehiculo  implements java.io.Serializable {


     private Integer idtipoVehiculo;
     private String nombre;
     private Integer capacidad;
     private Set vehiculos = new HashSet(0);

    public TipoVehiculo() {
        idtipoVehiculo = 0;
        nombre = "";
        capacidad = 0;
    }

    public TipoVehiculo(String nombre, Integer capacidad, Set vehiculos) {
       this.nombre = nombre;
       this.capacidad = capacidad;
       this.vehiculos = vehiculos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idtipo_vehiculo", unique=true, nullable=false)
    public Integer getIdtipoVehiculo() {
        return this.idtipoVehiculo;
    }
    
    public void setIdtipoVehiculo(Integer idtipoVehiculo) {
        this.idtipoVehiculo = idtipoVehiculo;
    }

    
    @Column(name="nombre", length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="capacidad")
    public Integer getCapacidad() {
        return this.capacidad;
    }
    
    public void setCapacidad(Integer capacidad) {
        this.capacidad = capacidad;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoVehiculo")
    public Set getVehiculos() {
        return this.vehiculos;
    }
    
    public void setVehiculos(Set vehiculos) {
        this.vehiculos = vehiculos;
    }




}


