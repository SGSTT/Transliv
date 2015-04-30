package modelos;
// Generated 29-abr-2015 23:38:15 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * VehiculoHasChofer generated by hbm2java
 */
@Entity
@Table(name="vehiculo_has_chofer"
    ,catalog="sgstt"
)
public class VehiculoHasChofer  implements java.io.Serializable {


     private int idVehiculoHasChofer;
     private Chofer chofer;
     private Vehiculo vehiculo;
     private Set vehiculoHasChoferHasServicios = new HashSet(0);

    public VehiculoHasChofer() {
    }

	
    public VehiculoHasChofer(int idVehiculoHasChofer, Chofer chofer, Vehiculo vehiculo) {
        this.idVehiculoHasChofer = idVehiculoHasChofer;
        this.chofer = chofer;
        this.vehiculo = vehiculo;
    }
    public VehiculoHasChofer(int idVehiculoHasChofer, Chofer chofer, Vehiculo vehiculo, Set vehiculoHasChoferHasServicios) {
       this.idVehiculoHasChofer = idVehiculoHasChofer;
       this.chofer = chofer;
       this.vehiculo = vehiculo;
       this.vehiculoHasChoferHasServicios = vehiculoHasChoferHasServicios;
    }
   
     @Id 

    
    @Column(name="id_vehiculo_has_chofer", unique=true, nullable=false)
    public int getIdVehiculoHasChofer() {
        return this.idVehiculoHasChofer;
    }
    
    public void setIdVehiculoHasChofer(int idVehiculoHasChofer) {
        this.idVehiculoHasChofer = idVehiculoHasChofer;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idchofer", nullable=false)
    public Chofer getChofer() {
        return this.chofer;
    }
    
    public void setChofer(Chofer chofer) {
        this.chofer = chofer;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idvehiculo", nullable=false)
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vehiculoHasChofer")
    public Set getVehiculoHasChoferHasServicios() {
        return this.vehiculoHasChoferHasServicios;
    }
    
    public void setVehiculoHasChoferHasServicios(Set vehiculoHasChoferHasServicios) {
        this.vehiculoHasChoferHasServicios = vehiculoHasChoferHasServicios;
    }




}


