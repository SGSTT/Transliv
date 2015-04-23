package modelos;
// Generated 16/04/2015 11:54:20 AM by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * UsuarioId generated by hbm2java
 */
@Embeddable
public class UsuarioId  implements java.io.Serializable {


     private int idusuario;
     private int idRol;

    public UsuarioId() {
    }

    public UsuarioId(int idusuario, int idRol) {
       this.idusuario = idusuario;
       this.idRol = idRol;
    }
   


    @Column(name="idusuario", nullable=false)
    public int getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(int idusuario) {
        this.idusuario = idusuario;
    }


    @Column(name="idRol", nullable=false)
    public int getIdRol() {
        return this.idRol;
    }
    
    public void setIdRol(int idRol) {
        this.idRol = idRol;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof UsuarioId) ) return false;
		 UsuarioId castOther = ( UsuarioId ) other; 
         
		 return (this.getIdusuario()==castOther.getIdusuario())
 && (this.getIdRol()==castOther.getIdRol());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdusuario();
         result = 37 * result + this.getIdRol();
         return result;
   }   


}

