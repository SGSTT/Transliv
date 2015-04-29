package modelos;
// Generated 29-abr-2015 8:17:58 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 * PermisoId generated by hbm2java
 */
@Embeddable
public class PermisoId  implements java.io.Serializable {


     private int idpermiso;
     private int perfilIdperfil;
     private int moduloIdmodulo;

    public PermisoId() {
    }

    public PermisoId(int idpermiso, int perfilIdperfil, int moduloIdmodulo) {
       this.idpermiso = idpermiso;
       this.perfilIdperfil = perfilIdperfil;
       this.moduloIdmodulo = moduloIdmodulo;
    }
   


    @Column(name="idpermiso", nullable=false)
    public int getIdpermiso() {
        return this.idpermiso;
    }
    
    public void setIdpermiso(int idpermiso) {
        this.idpermiso = idpermiso;
    }


    @Column(name="perfil_idperfil", nullable=false)
    public int getPerfilIdperfil() {
        return this.perfilIdperfil;
    }
    
    public void setPerfilIdperfil(int perfilIdperfil) {
        this.perfilIdperfil = perfilIdperfil;
    }


    @Column(name="modulo_idmodulo", nullable=false)
    public int getModuloIdmodulo() {
        return this.moduloIdmodulo;
    }
    
    public void setModuloIdmodulo(int moduloIdmodulo) {
        this.moduloIdmodulo = moduloIdmodulo;
    }


   public boolean equals(Object other) {
         if ( (this == other ) ) return true;
		 if ( (other == null ) ) return false;
		 if ( !(other instanceof PermisoId) ) return false;
		 PermisoId castOther = ( PermisoId ) other; 
         
		 return (this.getIdpermiso()==castOther.getIdpermiso())
 && (this.getPerfilIdperfil()==castOther.getPerfilIdperfil())
 && (this.getModuloIdmodulo()==castOther.getModuloIdmodulo());
   }
   
   public int hashCode() {
         int result = 17;
         
         result = 37 * result + this.getIdpermiso();
         result = 37 * result + this.getPerfilIdperfil();
         result = 37 * result + this.getModuloIdmodulo();
         return result;
   }   


}


