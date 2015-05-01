package modelos;
// Generated 29-abr-2015 23:38:15 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * Tarifa generated by hbm2java
 */
@Entity
@Table(name="tarifa"
    ,catalog="sgstt"
)
public class Tarifa  implements java.io.Serializable {


     private int idTarifa;
     private int idServicio;
     private int idTipoVehiculo;
     private String horas;
     private String descripcion;
     private String precio;

    public Tarifa() {
        idTarifa = 0;
        idServicio = 0;
        idTipoVehiculo = 0;
        horas = "";
        descripcion = "";
        precio = "";
                
    }

	
    public Tarifa(int idTarifa, int idServicio, int idTipoVehiculo) {
        this.idTarifa = idTarifa;
        this.idServicio = idServicio;
        this.idTipoVehiculo = idTipoVehiculo;
    }
    public Tarifa(int idTarifa, int idServicio, int idTipoVehiculo, String horas, String descripcion, String precio) {
       this.idTarifa = idTarifa;
       this.idServicio = idServicio;
       this.idTipoVehiculo = idTipoVehiculo;
       this.horas = horas;
       this.descripcion = descripcion;
       this.precio = precio;
    }
   
     @Id 

    
    @Column(name="idTarifa", unique=true, nullable=false)
    public int getIdTarifa() {
        return this.idTarifa;
    }
    
    public void setIdTarifa(int idTarifa) {
        this.idTarifa = idTarifa;
    }

    
    @Column(name="idServicio", nullable=false)
    public int getIdServicio() {
        return this.idServicio;
    }
    
    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    
    @Column(name="idTipoVehiculo", nullable=false)
    public int getIdTipoVehiculo() {
        return this.idTipoVehiculo;
    }
    
    public void setIdTipoVehiculo(int idTipoVehiculo) {
        this.idTipoVehiculo = idTipoVehiculo;
    }

    
    @Column(name="horas", length=45)
    public String getHoras() {
        return this.horas;
    }
    
    public void setHoras(String horas) {
        this.horas = horas;
    }

    
    @Column(name="descripcion", length=45)
    public String getDescripcion() {
        return this.descripcion;
    }
    
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    
    @Column(name="precio", length=45)
    public String getPrecio() {
        return this.precio;
    }
    
    public void setPrecio(String precio) {
        this.precio = precio;
    }




}


