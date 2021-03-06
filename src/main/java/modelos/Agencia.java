package modelos;
// Generated 29-abr-2015 23:38:15 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Agencia generated by hbm2java
 */
@Entity
@Table(name="agencia"
    ,catalog="sgstt"
)
public class Agencia  implements java.io.Serializable {


     private int idagencia;
     private Cliente cliente;

    public Agencia() {
        idagencia = 0;
        cliente = new Cliente();
    }

    public Agencia(int idagencia, Cliente cliente) {
       this.idagencia = idagencia;
       this.cliente = cliente;
    }
   
     @Id 

    
    @Column(name="idagencia", unique=true, nullable=false)
    public int getIdagencia() {
        return this.idagencia;
    }
    
    public void setIdagencia(int idagencia) {
        this.idagencia = idagencia;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Cliente_idCliente", nullable=false)
    public Cliente getCliente() {
        return this.cliente;
    }
    
    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }




}


