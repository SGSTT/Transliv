package modelos;
// Generated 29-abr-2015 23:38:15 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VehiculoHasChoferHasServicioId generated by hbm2java
 */
@Embeddable
public class VehiculoHasChoferHasServicioId  implements java.io.Serializable {


     private int idVehiculoHasChofer;
     private int idservicio;

    public VehiculoHasChoferHasServicioId() {
        idVehiculoHasChofer = 0;
        idservicio = 0;
    }

    public VehiculoHasChoferHasServicioId(int idVehiculoHasChofer, int idservicio) {
       this.idVehiculoHasChofer = idVehiculoHasChofer;
       this.idservicio = idservicio;
    }
   


    @Column(name="id_vehiculo_has_chofer", nullable=false)
    public int getIdVehiculoHasChofer() {
        return this.idVehiculoHasChofer;
    }
    
    public void setIdVehiculoHasChofer(int idVehiculoHasChofer) {
        this.idVehiculoHasChofer = idVehiculoHasChofer;
    }


    @Column(name="idservicio", nullable=false)
    public int getIdservicio() {
        return this.idservicio;
    }
    
    public void setIdservicio(int idservicio) {
        this.idservicio = idservicio;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VehiculoHasChoferHasServicioId) ) return false;
		 VehiculoHasChoferHasServicioId castOther = ( VehiculoHasChoferHasServicioId ) other; 
         
		 return (this.getIdVehiculoHasChofer()==castOther.getIdVehiculoHasChofer())
 && (this.getIdservicio()==castOther.getIdservicio());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdVehiculoHasChofer();
         result = 37 * result + this.getIdservicio();
         return result;
   }   


}


