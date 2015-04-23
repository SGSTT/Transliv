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
 * Modulo generated by hbm2java
 */
@Entity
@Table(name="modulo"
    ,catalog="sgstt"
)
public class Modulo  implements java.io.Serializable {


     private Integer idmodulo;
     private String nombre;
     private String url;
     private byte estado;
     private Set permisos = new HashSet(0);

    public Modulo() {
    }

	
    public Modulo(String nombre, String url, byte estado) {
        this.nombre = nombre;
        this.url = url;
        this.estado = estado;
    }
    public Modulo(String nombre, String url, byte estado, Set permisos) {
       this.nombre = nombre;
       this.url = url;
       this.estado = estado;
       this.permisos = permisos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idmodulo", unique=true, nullable=false)
    public Integer getIdmodulo() {
        return this.idmodulo;
    }
    
    public void setIdmodulo(Integer idmodulo) {
        this.idmodulo = idmodulo;
    }

    
    @Column(name="nombre", nullable=false, length=45)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="url", nullable=false, length=120)
    public String getUrl() {
        return this.url;
    }
    
    public void setUrl(String url) {
        this.url = url;
    }

    
    @Column(name="estado", nullable=false)
    public byte getEstado() {
        return this.estado;
    }
    
    public void setEstado(byte estado) {
        this.estado = estado;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="modulo")
    public Set getPermisos() {
        return this.permisos;
    }
    
    public void setPermisos(Set permisos) {
        this.permisos = permisos;
    }




}

