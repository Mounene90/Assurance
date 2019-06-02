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
 * Detail generated by hbm2java
 */
@Entity
@Table(name="detail")
public class Detail  implements java.io.Serializable {


     /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	 @Id 
     @GeneratedValue(strategy=GenerationType.IDENTITY)
     @Column(name="Id_detail", unique=true, nullable=false)
	 private int idDetail;
	 @ManyToOne(fetch=FetchType.LAZY)
	 @JoinColumn(name="Id_contrat")
     private Contrat contrat;
	 @ManyToOne(fetch=FetchType.LAZY)
	    @JoinColumn(name="Id_garantie")
     private Garantie garantie;
	 @Column(name="Prime_brute_prorata")
     private Integer primeBruteProrata;
	 @Column(name="Mtn_limite")
     private Integer mtnLimite;
	 @Column(name="Mtn_franchise")
     private Integer mtnFranchise;

    public Detail() {
    }

	
    public Detail(int idDetail) {
        this.idDetail = idDetail;
    }
    public Detail(int idDetail, Contrat contrat, Garantie garantie, Integer primeBruteProrata, Integer mtnLimite, Integer mtnFranchise) {
       this.idDetail = idDetail;
       this.contrat = contrat;
       this.garantie = garantie;
       this.primeBruteProrata = primeBruteProrata;
       this.mtnLimite = mtnLimite;
       this.mtnFranchise = mtnFranchise;
    }
   
     
    public int getIdDetail() {
        return this.idDetail;
    }
    
    public void setIdDetail(int idDetail) {
        this.idDetail = idDetail;
    }


    public Contrat getContrat() {
        return this.contrat;
    }
    
    public void setContrat(Contrat contrat) {
        this.contrat = contrat;
    }


    public Garantie getGarantie() {
        return this.garantie;
    }
    
    public void setGarantie(Garantie garantie) {
        this.garantie = garantie;
    }
    
    public Integer getPrimeBruteProrata() {
        return this.primeBruteProrata;
    }
    
    public void setPrimeBruteProrata(Integer primeBruteProrata) {
        this.primeBruteProrata = primeBruteProrata;
    }

    
    
    public Integer getMtnLimite() {
        return this.mtnLimite;
    }
    
    public void setMtnLimite(Integer mtnLimite) {
        this.mtnLimite = mtnLimite;
    }

    
    
    public Integer getMtnFranchise() {
        return this.mtnFranchise;
    }
    
    public void setMtnFranchise(Integer mtnFranchise) {
        this.mtnFranchise = mtnFranchise;
    }




}


