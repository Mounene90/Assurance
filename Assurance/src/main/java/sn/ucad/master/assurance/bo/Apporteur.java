package sn.ucad.master.assurance.bo;

import java.util.Collection;
import java.util.List;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name="apporteur")
public class Apporteur implements java.io.Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	@Id
	@Column(name="Code_App", unique=true ,nullable=false, length=30)
	private String codeApp;
	@Column(name="Nom_App",nullable=false, length=30)
	private String nomApp;
	@Column(name="Prenom_App", nullable=false, length=30)
	private String prenomApp;
	@Column(name="Adresse_App", length=30)
	private String adresseApp;
	@Column(name="Telephone_App",nullable=false, length=30)
	private int telephoneApp;
	 @Column(name="Mail_App", length=30)
	private String mailApp;
	@OneToMany(fetch=FetchType.LAZY, mappedBy="apporteur")
    /*private List<Contrat> contrats;*/
	private Collection<Contrat> contrats ;
	
	public Apporteur() {
		
	}
	
	public Apporteur(String codeApp, String nomApp, String prenomApp, String adresseApp, int telephoneApp,
			String mailApp, Collection<Contrat> contrats) {
		super();
		this.codeApp = codeApp;
		this.nomApp = nomApp;
		this.prenomApp = prenomApp;
		this.adresseApp = adresseApp;
		this.telephoneApp = telephoneApp;
		this.mailApp = mailApp;
		this.contrats = contrats;
	}

	public Apporteur(String codeApp, String nomApp, String prenomApp, String adresseApp, int telephoneApp,
			String mailApp, List<Contrat> contrats) {
		super();
		this.codeApp = codeApp;
		this.nomApp = nomApp;
		this.prenomApp = prenomApp;
		this.adresseApp = adresseApp;
		this.telephoneApp = telephoneApp;
		this.mailApp = mailApp;
		this.contrats = contrats;
	}

	public Apporteur(String codeApp, String nomApp, String prenomApp, String adresseApp, int telephoneApp,
			String mailApp) {
		super();
		this.codeApp = codeApp;
		this.nomApp = nomApp;
		this.prenomApp = prenomApp;
		this.adresseApp = adresseApp;
		this.telephoneApp = telephoneApp;
		this.mailApp = mailApp;
	}

	public String getCodeApp() {
		return codeApp;
	}

	public void setCodeApp(String codeApp) {
		this.codeApp = codeApp;
	}

	public String getNomApp() {
		return nomApp;
	}

	public void setNomApp(String nomApp) {
		this.nomApp = nomApp;
	}

	public String getPrenomApp() {
		return prenomApp;
	}

	public void setPrenomApp(String prenomApp) {
		this.prenomApp = prenomApp;
	}

	public String getAdresseApp() {
		return adresseApp;
	}

	public void setAdresseApp(String adresseApp) {
		this.adresseApp = adresseApp;
	}

	public int getTelephoneApp() {
		return telephoneApp;
	}

	public void setTelephoneApp(int telephoneApp) {
		this.telephoneApp = telephoneApp;
	}

	public String getMailApp() {
		return mailApp;
	}

	public void setMailApp(String mailApp) {
		this.mailApp = mailApp;
	}

	public Collection<Contrat> getContrats() {
		return contrats;
	}

	public void setContrats(Collection<Contrat> contrats) {
		this.contrats = contrats;
	}

	/*public List<Contrat> getContrats() {
		return contrats;
	}

	public void setContrats(List<Contrat> contrats) {
		this.contrats = contrats;
	}*/

	

	
	

}
