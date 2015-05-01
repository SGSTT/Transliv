package modelos;
// Generated 29-abr-2015 23:38:15 by Hibernate Tools 4.3.1


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
 * Usuario generated by hbm2java
 */
@Entity
@Table(name="usuario"
    ,catalog="sgstt"
)
public class Usuario  implements java.io.Serializable {


     private Integer idusuario;
     private Perfil perfil;
     private String nick;
     private String clave;
     private String nombre;
     private String apellido;
     private byte estado;

    public Usuario() {
        idusuario = 0;
        perfil = new Perfil();
        nick = "";
        clave = "";
        nombre =  "";
        apellido = "";
        estado = 0;
    }

	
    public Usuario(Perfil perfil, String nick, String nombre, String apellido, byte estado) {
        this.perfil = perfil;
        this.nick = nick;
        this.nombre = nombre;
        this.apellido = apellido;
        this.estado = estado;
    }
    public Usuario(Perfil perfil, String nick, String clave, String nombre, String apellido, byte estado) {
       this.perfil = perfil;
       this.nick = nick;
       this.clave = clave;
       this.nombre = nombre;
       this.apellido = apellido;
       this.estado = estado;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idusuario", unique=true, nullable=false)
    public Integer getIdusuario() {
        return this.idusuario;
    }
    
    public void setIdusuario(Integer idusuario) {
        this.idusuario = idusuario;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idRol", nullable=false)
    public Perfil getPerfil() {
        return this.perfil;
    }
    
    public void setPerfil(Perfil perfil) {
        this.perfil = perfil;
    }

    
    @Column(name="nick", nullable=false, length=20)
    public String getNick() {
        return this.nick;
    }
    
    public void setNick(String nick) {
        this.nick = nick;
    }

    
    @Column(name="clave", length=16)
    public String getClave() {
        return this.clave;
    }
    
    public void setClave(String clave) {
        this.clave = clave;
    }

    
    @Column(name="nombre", nullable=false, length=60)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="apellido", nullable=false, length=80)
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    @Column(name="estado", nullable=false)
    public byte getEstado() {
        return this.estado;
    }
    
    public void setEstado(byte estado) {
        this.estado = estado;
    }




}


