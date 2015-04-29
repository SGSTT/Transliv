package modelos;
// Generated 29-abr-2015 8:17:58 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * DetalleServicio generated by hbm2java
 */
@Entity
@Table(name="detalle_servicio"
    ,catalog="sgstt"
)
public class DetalleServicio  implements java.io.Serializable {


     private String iddetalleServicio;
     private Aerolinea aerolinea;
     private Cobro cobro;
     private EstadoServicio estadoServicio;
     private Trasladista trasladista;

    public DetalleServicio() {
    }

    public DetalleServicio(String iddetalleServicio, Aerolinea aerolinea, Cobro cobro, EstadoServicio estadoServicio, Trasladista trasladista) {
       this.iddetalleServicio = iddetalleServicio;
       this.aerolinea = aerolinea;
       this.cobro = cobro;
       this.estadoServicio = estadoServicio;
       this.trasladista = trasladista;
    }
   
     @Id 

    
    @Column(name="iddetalle_servicio", unique=true, nullable=false, length=45)
    public String getIddetalleServicio() {
        return this.iddetalleServicio;
    }
    
    public void setIddetalleServicio(String iddetalleServicio) {
        this.iddetalleServicio = iddetalleServicio;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idaerolinea", nullable=false)
    public Aerolinea getAerolinea() {
        return this.aerolinea;
    }
    
    public void setAerolinea(Aerolinea aerolinea) {
        this.aerolinea = aerolinea;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idcobro", nullable=false)
    public Cobro getCobro() {
        return this.cobro;
    }
    
    public void setCobro(Cobro cobro) {
        this.cobro = cobro;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idestado_servicio", nullable=false)
    public EstadoServicio getEstadoServicio() {
        return this.estadoServicio;
    }
    
    public void setEstadoServicio(EstadoServicio estadoServicio) {
        this.estadoServicio = estadoServicio;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idtrasladista", nullable=false)
    public Trasladista getTrasladista() {
        return this.trasladista;
    }
    
    public void setTrasladista(Trasladista trasladista) {
        this.trasladista = trasladista;
    }




}


