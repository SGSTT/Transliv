package modelos;
// Generated 16/04/2015 11:54:20 AM by Hibernate Tools 4.3.1


import java.util.HashSet;
import java.util.Set;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import static javax.persistence.GenerationType.IDENTITY;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;

/**
 * Cliente generated by hbm2java
 */
@Entity
@Table(name="cliente"
    ,catalog="sgstt"
)
public class Cliente  implements java.io.Serializable {


     private Integer idcliente;
     private TipoCliente tipoCliente;
     private String nombres;
     private String apellidos;
     private int dni;
     private Set servicios = new HashSet(0);

    public Cliente() {
    }

	
    public Cliente(TipoCliente tipoCliente, String nombres, String apellidos, int dni) {
        this.tipoCliente = tipoCliente;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.dni = dni;
    }
    public Cliente(TipoCliente tipoCliente, String nombres, String apellidos, int dni, Set servicios) {
       this.tipoCliente = tipoCliente;
       this.nombres = nombres;
       this.apellidos = apellidos;
       this.dni = dni;
       this.servicios = servicios;
    }
   
     @Id @GeneratedValue(strategy=IDENTITY)

    
    @Column(name="idcliente", unique=true, nullable=false)
    public Integer getIdcliente() {
        return this.idcliente;
    }
    
    public void setIdcliente(Integer idcliente) {
        this.idcliente = idcliente;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="idtipo_cliente", nullable=false)
    public TipoCliente getTipoCliente() {
        return this.tipoCliente;
    }
    
    public void setTipoCliente(TipoCliente tipoCliente) {
        this.tipoCliente = tipoCliente;
    }

    
    @Column(name="nombres", nullable=false, length=45)
    public String getNombres() {
        return this.nombres;
    }
    
    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    
    @Column(name="apellidos", nullable=false, length=45)
    public String getApellidos() {
        return this.apellidos;
    }
    
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    
    @Column(name="dni", nullable=false)
    public int getDni() {
        return this.dni;
    }
    
    public void setDni(int dni) {
        this.dni = dni;
    }

@OneToMany(fetch=FetchType.LAZY, mappedBy="cliente")
    public Set getServicios() {
        return this.servicios;
    }
    
    public void setServicios(Set servicios) {
        this.servicios = servicios;
    }




}


