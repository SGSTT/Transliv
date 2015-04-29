package modelos;
// Generated 29-abr-2015 10:53:26 by Hibernate Tools 4.3.1


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
 * TipoServicio generated by hbm2java
 */
@Entity
@Table(name="tipo_servicio"
    ,catalog="sgstt"
)
public class TipoServicio  implements java.io.Serializable {


     private Integer idtipoServicio;
     private String descripcion;
     private Set servicios = new HashSet(0);

    public TipoServicio() {
    }

    public TipoServicio(String descripcion, Set servicios) {
       this.descripcion = descripcion;
       this.servicios = servicios;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idtipo_servicio", unique=true, nullable=false)
    public Integer getIdtipoServicio() {
        return this.idtipoServicio;
    }
    
    public void setIdtipoServicio(Integer idtipoServicio) {
        this.idtipoServicio = idtipoServicio;
    }

    
    @Column(name="descripcion", length=45)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoServicio")
    public Set getServicios() {
        return this.servicios;
    }
    
    public void setServicios(Set servicios) {
        this.servicios = servicios;
    }




}


