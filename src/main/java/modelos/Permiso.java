package modelos;
// Generated 29-abr-2015 23:38:15 by Hibernate Tools 4.3.1


import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Permiso generated by hbm2java
 */
@Entity
@Table(name="permiso"
    ,catalog="sgstt"
)
public class Permiso  implements java.io.Serializable {


     private PermisoId id;
     private Modulo modulo;
     private Perfil perfil;

    public Permiso() {
    }

    public Permiso(PermisoId id, Modulo modulo, Perfil perfil) {
       this.id = id;
       this.modulo = modulo;
       this.perfil = perfil;
    }
   
     @EmbeddedId

    
    @AttributeOverrides( {
        @AttributeOverride(name="idpermiso", column=@Column(name="idpermiso", nullable=false) ), 
        @AttributeOverride(name="perfilIdperfil", column=@Column(name="perfil_idperfil", nullable=false) ), 
        @AttributeOverride(name="moduloIdmodulo", column=@Column(name="modulo_idmodulo", nullable=false) ) } )
    public PermisoId getId() {
        return this.id;
    }
    
    public void setId(PermisoId id) {
        this.id = id;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="modulo_idmodulo", nullable=false, insertable=false, updatable=false)
    public Modulo getModulo() {
        return this.modulo;
    }
    
    public void setModulo(Modulo modulo) {
        this.modulo = modulo;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="perfil_idperfil", nullable=false, insertable=false, updatable=false)
    public Perfil getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }




}


