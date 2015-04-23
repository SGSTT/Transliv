package modelos;
// Generated 16/04/2015 11:54:20 AM by Hibernate Tools 4.3.1


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
     private String tipoServicio;
     private Set servicios = new HashSet(0);

    public TipoServicio() {
    }

	
    public TipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }
    public TipoServicio(String tipoServicio, Set servicios) {
       this.tipoServicio = tipoServicio;
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

    
    @Column(name="tipo_servicio", nullable=false, length=45)
    public String getTipoServicio() {
        return this.tipoServicio;
    }
    
    public void setTipoServicio(String tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoServicio")
    public Set getServicios() {
        return this.servicios;
    }
    
    public void setServicios(Set servicios) {
        this.servicios = servicios;
    }




}


