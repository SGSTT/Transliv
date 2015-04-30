package modelos;
// Generated 29-abr-2015 23:38:15 by Hibernate Tools 4.3.1


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
 * Trasladista generated by hbm2java
 */
@Entity
@Table(name="trasladista"
    ,catalog="sgstt"
)
public class Trasladista  implements java.io.Serializable {


     private Integer idtrasladista;
     private String nombre;
     private String apellido;
     private String dni;
     private String direccion;
     private String correo;
     private String telefono;
     private String celular;
     private Byte estado;
     private Integer codUbigeo;
     private Set servicioDetalles = new HashSet(0);

    public Trasladista() {
    }

    public Trasladista(String nombre, String apellido, String dni, String direccion, String correo, String telefono, String celular, Byte estado, Integer codUbigeo, Set servicioDetalles) {
       this.nombre = nombre;
       this.apellido = apellido;
       this.dni = dni;
       this.direccion = direccion;
       this.correo = correo;
       this.telefono = telefono;
       this.celular = celular;
       this.estado = estado;
       this.codUbigeo = codUbigeo;
       this.servicioDetalles = servicioDetalles;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idtrasladista", unique=true, nullable=false)
    public Integer getIdtrasladista() {
        return this.idtrasladista;
    }
    
    public void setIdtrasladista(Integer idtrasladista) {
        this.idtrasladista = idtrasladista;
    }

    
    @Column(name="nombre", length=60)
    public String getNombre() {
        return this.nombre;
    }
    
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    
    @Column(name="apellido", length=80)
    public String getApellido() {
        return this.apellido;
    }
    
    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    
    @Column(name="dni", length=8)
    public String getDni() {
        return this.dni;
    }
    
    public void setDni(String dni) {
        this.dni = dni;
    }

    
    @Column(name="direccion", length=200)
    public String getDireccion() {
        return this.direccion;
    }
    
    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    
    @Column(name="correo", length=100)
    public String getCorreo() {
        return this.correo;
    }
    
    public void setCorreo(String correo) {
        this.correo = correo;
    }

    
    @Column(name="telefono", length=9)
    public String getTelefono() {
        return this.telefono;
    }
    
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    
    @Column(name="celular", length=11)
    public String getCelular() {
        return this.celular;
    }
    
    public void setCelular(String celular) {
        this.celular = celular;
    }

    
    @Column(name="estado")
    public Byte getEstado() {
        return this.estado;
    }
    
    public void setEstado(Byte estado) {
        this.estado = estado;
    }

    
    @Column(name="codUbigeo")
    public Integer getCodUbigeo() {
        return this.codUbigeo;
    }
    
    public void setCodUbigeo(Integer codUbigeo) {
        this.codUbigeo = codUbigeo;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="trasladista")
    public Set getServicioDetalles() {
        return this.servicioDetalles;
    }
    
    public void setServicioDetalles(Set servicioDetalles) {
        this.servicioDetalles = servicioDetalles;
    }




}


