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
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Vehiculo generated by hbm2java
 */
@Entity
@Table(name="vehiculo"
    ,catalog="sgstt"
)
public class Vehiculo  implements java.io.Serializable {


     private Integer idvehiculo;
     private EstadoVehiculo estadoVehiculo;
     private Marca marca;
     private TipoVehiculo tipoVehiculo;
     private String descripcion;
     private String placa;
     private Set vehiculoHasChofers = new HashSet(0);

    public Vehiculo() {
        idvehiculo =  0;
        estadoVehiculo = new EstadoVehiculo();
        marca = new Marca();
        tipoVehiculo = new TipoVehiculo();
        placa = "";
    }

	
    public Vehiculo(EstadoVehiculo estadoVehiculo, Marca marca, TipoVehiculo tipoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
        this.marca = marca;
        this.tipoVehiculo = tipoVehiculo;
    }
    public Vehiculo(EstadoVehiculo estadoVehiculo, Marca marca, TipoVehiculo tipoVehiculo, String descripcion, String placa, Set vehiculoHasChofers) {
       this.estadoVehiculo = estadoVehiculo;
       this.marca = marca;
       this.tipoVehiculo = tipoVehiculo;
       this.descripcion = descripcion;
       this.placa = placa;
       this.vehiculoHasChofers = vehiculoHasChofers;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idvehiculo", unique=true, nullable=false)
    public Integer getIdvehiculo() {
        return this.idvehiculo;
    }
    
    public void setIdvehiculo(Integer idvehiculo) {
        this.idvehiculo = idvehiculo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idestado_vehiculo", nullable=false)
    public EstadoVehiculo getEstadoVehiculo() {
        return this.estadoVehiculo;
    }
    
    public void setEstadoVehiculo(EstadoVehiculo estadoVehiculo) {
        this.estadoVehiculo = estadoVehiculo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idmarca", nullable=false)
    public Marca getMarca() {
        return this.marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idtipo vehiculo", nullable=false)
    public TipoVehiculo getTipoVehiculo() {
        return this.tipoVehiculo;
    }
    
    public void setTipoVehiculo(TipoVehiculo tipoVehiculo) {
        this.tipoVehiculo = tipoVehiculo;
    }

    
    @Column(name="descripcion", length=45)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="placa", length=45)
    public String getPlaca() {
        return this.placa;
    }
    
    public void setPlaca(String placa) {
        this.placa = placa;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="vehiculo")
    public Set getVehiculoHasChofers() {
        return this.vehiculoHasChofers;
    }
    
    public void setVehiculoHasChofers(Set vehiculoHasChofers) {
        this.vehiculoHasChofers = vehiculoHasChofers;
    }




}


