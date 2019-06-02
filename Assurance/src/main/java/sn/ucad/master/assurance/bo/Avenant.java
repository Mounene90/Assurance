package sn.ucad.master.assurance.bo;
// Generated 27 mars 2019 17:47:55 by Hibernate Tools 4.3.1


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

/**
 * Avenant generated by hbm2java
 */
@Entity
@Table(name="avenant")
public class Avenant  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int idAvenant;
     private Contrat contrat;
     private TypeAvenant typeAvenant;

    public Avenant() {
    }

	
    public Avenant(int idAvenant) {
        this.idAvenant = idAvenant;
    }
    public Avenant(int idAvenant, Contrat contrat, TypeAvenant typeAvenant) {
       this.idAvenant = idAvenant;
       this.contrat = contrat;
       this.typeAvenant = typeAvenant;
    }
   
     @Id 

     @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name="Id_Avenant", unique=true, nullable=false)
    public int getIdAvenant() {
        return this.idAvenant;
    }
    
    public void setIdAvenant(int idAvenant) {
        this.idAvenant = idAvenant;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id_contrat")
    public Contrat getContrat() {
        return this.contrat;
    }
    
    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }

@ManyToOne(fetch=FetchType.LAZY)
    @JoinColumn(name="Id_Type")
    public TypeAvenant getTypeAvenant() {
        return this.typeAvenant;
    }
    
    public void setTypeAvenant(TypeAvenant typeAvenant) {
        this.typeAvenant = typeAvenant;
    }




}


