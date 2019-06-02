package sn.ucad.master.assurance.bo;
// Generated 27 mars 2019 17:47:55 by Hibernate Tools 4.3.1


import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.DiscriminatorType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.Table;

/**
 * Service generated by hbm2java
 */
@Entity
@Table(name="service")
@Inheritance(strategy=InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name="TYPE_SERVICE",discriminatorType=DiscriminatorType.STRING,length=30)
public abstract class Service implements Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 @Id 
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="Id_service", unique=true, nullable=false)
	 private int idService;
	 @Column(name="Reference_service", unique=true, nullable=false)
	 private String referenceservice;
	 /*@Column(name="Type_service", length=60)
     private String typeService;*/
	/* @OneToMany(fetch=FetchType.LAZY, mappedBy="service")
     private Collection<Habitation> habitations;
	 @OneToMany(fetch=FetchType.LAZY, mappedBy="service")
     private Collection<Vehicule> vehicules;
	 @OneToMany(fetch=FetchType.LAZY, mappedBy="service")
     private Collection<Contrat> contrats;
	 @OneToMany(fetch=FetchType.LAZY, mappedBy="service")
     private Collection<Pret> prets;*/

    public Service() {
    }

	
    public Service(int idService) {
        this.idService = idService;
    }
    public int getIdService() {
        return this.idService;
    }


	public Service(int idService, String referenceservice) {
		super();
		this.idService = idService;
		this.referenceservice = referenceservice;
	}


	public String getReferenceservice() {
		return referenceservice;
	}


	public void setReferenceservice(String referenceservice) {
		this.referenceservice = referenceservice;
	}

}


