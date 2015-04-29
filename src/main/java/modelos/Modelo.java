package modelos;
// Generated 29-abr-2015 8:17:58 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Modelo generated by hbm2java
 */
@Entity
@Table(name="modelo"
    ,catalog="sgstt"
)
public class Modelo  implements java.io.Serializable {


     private Integer idmodelo;
     private Marca marca;
     private String nombreModelo;

    public Modelo() {
    }

	
    public Modelo(Marca marca) {
        this.marca = marca;
    }
    public Modelo(Marca marca, String nombreModelo) {
       this.marca = marca;
       this.nombreModelo = nombreModelo;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idmodelo", unique=true, nullable=false)
    public Integer getIdmodelo() {
        return this.idmodelo;
    }
    
    public void setIdmodelo(Integer idmodelo) {
        this.idmodelo = idmodelo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="marca_idmarca", nullable=false)
    public Marca getMarca() {
        return this.marca;
    }
    
    public void setMarca(Marca marca) {
        this.marca = marca;
    }

    
    @Column(name="nombreModelo", length=45)
    public String getNombreModelo() {
        return this.nombreModelo;
    }
    
    public void setNombreModelo(String nombreModelo) {
        this.nombreModelo = nombreModelo;
    }




}


