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
 * TipoIncidencia generated by hbm2java
 */
@Entity
@Table(name="tipo_incidencia"
    ,catalog="sgstt"
)
public class TipoIncidencia  implements java.io.Serializable {


     private Integer idtipoIncidencia;
     private String descripcion;
     private Set incidencias = new HashSet(0);

    public TipoIncidencia() {
        idtipoIncidencia = 0;
        descripcion = "";        
    }

    public TipoIncidencia(String descripcion, Set incidencias) {
       this.descripcion = descripcion;
       this.incidencias = incidencias;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idtipo_incidencia", unique=true, nullable=false)
    public Integer getIdtipoIncidencia() {
        return this.idtipoIncidencia;
    }
    
    public void setIdtipoIncidencia(Integer idtipoIncidencia) {
        this.idtipoIncidencia = idtipoIncidencia;
    }

    
    @Column(name="descripcion", length=45)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="tipoIncidencia")
    public Set getIncidencias() {
        return this.incidencias;
    }
    
    public void setIncidencias(Set incidencias) {
        this.incidencias = incidencias;
    }




}


