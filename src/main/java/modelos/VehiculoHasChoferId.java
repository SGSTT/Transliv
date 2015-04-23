package modelos;
// Generated 16/04/2015 11:54:20 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * VehiculoHasChoferId generated by hbm2java
 */
@Embeddable
public class VehiculoHasChoferId  implements java.io.Serializable {


     private int dvehiculo;
     private int idchofer;

    public VehiculoHasChoferId() {
    }

    public VehiculoHasChoferId(int dvehiculo, int idchofer) {
       this.dvehiculo = dvehiculo;
       this.idchofer = idchofer;
    }
   


    @Column(name="dvehiculo", nullable=false)
    public int getDvehiculo() {
        return this.dvehiculo;
    }
    
    public void setDvehiculo(int dvehiculo) {
        this.dvehiculo = dvehiculo;
    }


    @Column(name="idchofer", nullable=false)
    public int getIdchofer() {
        return this.idchofer;
    }
    
    public void setIdchofer(int idchofer) {
        this.idchofer = idchofer;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof VehiculoHasChoferId) ) return false;
		 VehiculoHasChoferId castOther = ( VehiculoHasChoferId ) other; 
         
		 return (this.getDvehiculo()==castOther.getDvehiculo())
 && (this.getIdchofer()==castOther.getIdchofer());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getDvehiculo();
         result = 37 * result + this.getIdchofer();
         return result;
   }   


}

