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
 * Marca generated by hbm2java
 */
@Entity
@Table(name="marca"
    ,catalog="sgstt"
)
public class Marca  implements java.io.Serializable {


     private Integer idmarca;
     private String nombreMarca;
     private Set vehiculos = new HashSet(0);
     private Set modelos = new HashSet(0);

    public Marca() {
    }

    public Marca(String nombreMarca, Set vehiculos, Set modelos) {
       this.nombreMarca = nombreMarca;
       this.vehiculos = vehiculos;
       this.modelos = modelos;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idmarca", unique=true, nullable=false)
    public Integer getIdmarca() {
        return this.idmarca;
    }
    
    public void setIdmarca(Integer idmarca) {
        this.idmarca = idmarca;
    }

    
    @Column(name="nombreMarca", length=45)
    public String getNombreMarca() {
        return this.nombreMarca;
    }
    
    public void setNombreMarca(String nombreMarca) {
        this.nombreMarca = nombreMarca;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="marca")
    public Set getVehiculos() {
        return this.vehiculos;
    }
    
    public void setVehiculos(Set vehiculos) {
        this.vehiculos = vehiculos;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="marca")
    public Set getModelos() {
        return this.modelos;
    }
    
    public void setModelos(Set modelos) {
        this.modelos = modelos;
    }




}

