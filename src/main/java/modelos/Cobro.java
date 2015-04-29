package modelos;
// Generated 29-abr-2015 8:17:58 by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cobro generated by hbm2java
 */
@Entity
@Table(name="cobro"
    ,catalog="sgstt"
)
public class Cobro  implements java.io.Serializable {


     private int idcobro;
     private String descuento;
     private String neto;
     private String total;
     private Set detalleServicios = new HashSet(0);

    public Cobro() {
    }

	
    public Cobro(int idcobro) {
        this.idcobro = idcobro;
    }
    public Cobro(int idcobro, String descuento, String neto, String total, Set detalleServicios) {
       this.idcobro = idcobro;
       this.descuento = descuento;
       this.neto = neto;
       this.total = total;
       this.detalleServicios = detalleServicios;
    }
   
     @Id 

    
    @Column(name="idcobro", unique=true, nullable=false)
    public int getIdcobro() {
        return this.idcobro;
    }
    
    public void setIdcobro(int idcobro) {
        this.idcobro = idcobro;
    }

    
    @Column(name="descuento", length=45)
    public String getDescuento() {
        return this.descuento;
    }
    
    public void setDescuento(String descuento) {
        this.descuento = descuento;
    }

    
    @Column(name="neto", length=45)
    public String getNeto() {
        return this.neto;
    }
    
    public void setNeto(String neto) {
        this.neto = neto;
    }

    
    @Column(name="total", length=45)
    public String getTotal() {
        return this.total;
    }
    
    public void setTotal(String total) {
        this.total = total;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cobro")
    public Set getDetalleServicios() {
        return this.detalleServicios;
    }
    
    public void setDetalleServicios(Set detalleServicios) {
        this.detalleServicios = detalleServicios;
    }




}


