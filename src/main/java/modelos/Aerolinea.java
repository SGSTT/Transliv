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
 * Aerolinea generated by hbm2java
 */
@Entity
@Table(name="aerolinea"
    ,catalog="sgstt"
)
public class Aerolinea  implements java.io.Serializable {


     private Integer idaerolinea;
     private String descripcion;
     private Set servicioDetalles = new HashSet(0);
     private Set vuelos = new HashSet(0);

    public Aerolinea() {
        idaerolinea = 0;
        descripcion = "";
    }

    public Aerolinea(String descripcion, Set servicioDetalles, Set vuelos) {
       this.descripcion = descripcion;
       this.servicioDetalles = servicioDetalles;
       this.vuelos = vuelos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idaerolinea", unique=true, nullable=false)
    public Integer getIdaerolinea() {
        return this.idaerolinea;
    }
    
    public void setIdaerolinea(Integer idaerolinea) {
        this.idaerolinea = idaerolinea;
    }

    
    @Column(name="descripcion", length=45)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="aerolinea")
    public Set getServicioDetalles() {
        return this.servicioDetalles;
    }
    
    public void setServicioDetalles(Set servicioDetalles) {
        this.servicioDetalles = servicioDetalles;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="aerolinea")
    public Set getVuelos() {
        return this.vuelos;
    }
    
    public void setVuelos(Set vuelos) {
        this.vuelos = vuelos;
    }




}


