package bf.agriculture.VulgaData.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Acteurs implements Serializable {
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn(name="idpartici")
	private Participation participations;
	//meme si on ne precise pas le nom de la jointure JPA gere sa par defaut et crée un identifiant
	@ManyToOne
	private Region regions;
	
	@Id 
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int idPerson;
	
	 private String nomPers;
	 
	
	 private String prenomPers;
	 
	 @Column(nullable=false,unique=true)
	 private boolean sexe ;
	 
	 @Column(nullable=false)
	 private String email;
	 
	 @Column(nullable=false)
	 private String numTel;

	public Acteurs() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Acteurs(String nomPers, String prenomPers, boolean sexe, String email, String numTel) {
		super();
		this.nomPers = nomPers;
		this.prenomPers = prenomPers;
		this.sexe = sexe;
		this.email = email;
		this.numTel = numTel;
	}

	public int getIdPerson() {
		return idPerson;
	}

	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}

	public String getNomPers() {
		return nomPers;
	}

	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}

	public String getPrenomPers() {
		return prenomPers;
	}

	public void setPrenomPers(String prenomPers) {
		this.prenomPers = prenomPers;
	}

	public boolean isSexe() {
		return sexe;
	}

	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNumTel() {
		return numTel;
	}

	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}
	 

}
