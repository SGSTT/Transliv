package modelos;
// Generated 29-abr-2015 8:17:58 by Hibernate Tools 4.3.1


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
 * EstadoServicio generated by hbm2java
 */
@Entity
@Table(name="estado_servicio"
    ,catalog="sgstt"
)
public class EstadoServicio  implements java.io.Serializable {


     private Integer idestadoServicio;
     private String descripcion;
     private Set detalleServicios = new HashSet(0);

    public EstadoServicio() {
    }

    public EstadoServicio(String descripcion, Set detalleServicios) {
       this.descripcion = descripcion;
       this.detalleServicios = detalleServicios;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idestado_servicio", unique=true, nullable=false)
    public Integer getIdestadoServicio() {
        return this.idestadoServicio;
    }
    
    public void setIdestadoServicio(Integer idestadoServicio) {
        this.idestadoServicio = idestadoServicio;
    }

    
    @Column(name="descripcion", length=30)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="estadoServicio")
    public Set getDetalleServicios() {
        return this.detalleServicios;
    }
    
    public void setDetalleServicios(Set detalleServicios) {
        this.detalleServicios = detalleServicios;
    }




}


