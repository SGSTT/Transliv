package modelos;
// Generated 28-abr-2015 13:55:09 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * VehiculoHasServicio generated by hbm2java
 */
@Entity
@Table(name="vehiculo_has_servicio"
    ,catalog="sgstt"
)
public class VehiculoHasServicio  implements java.io.Serializable {


     private VehiculoHasServicioId id;
     private Servicio servicio;
     private Vehiculo vehiculo;
     private String observaciones;

    public VehiculoHasServicio() {
    }

	
    public VehiculoHasServicio(VehiculoHasServicioId id, Servicio servicio, Vehiculo vehiculo) {
        this.id = id;
        this.servicio = servicio;
        this.vehiculo = vehiculo;
    }
    public VehiculoHasServicio(VehiculoHasServicioId id, Servicio servicio, Vehiculo vehiculo, String observaciones) {
       this.id = id;
       this.servicio = servicio;
       this.vehiculo = vehiculo;
       this.observaciones = observaciones;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="vehiculoIdvehiculo", column=@Column(name="vehiculo_idvehiculo", nullable=false) ), 
        @AttributeOverride(name="servicioIdservicio", column=@Column(name="servicio_idservicio", nullable=false) ) } )
    public VehiculoHasServicioId getId() {
        return this.id;
    }
    
    public void setId(VehiculoHasServicioId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="servicio_idservicio", nullable=false, insertable=false, updatable=false)
    public Servicio getServicio() {
        return this.servicio;
    }
    
    public void setServicio(Servicio servicio) {
        this.servicio = servicio;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="vehiculo_idvehiculo", nullable=false, insertable=false, updatable=false)
    public Vehiculo getVehiculo() {
        return this.vehiculo;
    }
    
    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    
    @Column(name="Observaciones", length=65535)
    public String getObservaciones() {
        return this.observaciones;
    }
    
    public void setObservaciones(String observaciones) {
        this.observaciones = observaciones;
    }




}


