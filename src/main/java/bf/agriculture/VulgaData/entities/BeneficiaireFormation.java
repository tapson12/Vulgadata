package bf.agriculture.VulgaData.entities;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.UniqueConstraint;

import ch.qos.logback.classic.db.names.ColumnName;

@Entity
public class BeneficiaireFormation extends Acteurs implements Serializable {
    //toute classe doit etre implementée  
	
	
	private String numeroCNIB;
	
	@Column(nullable=false)
	@Temporal(TemporalType.DATE)
	 private Date dateEtabli;

	 private String matricule;
	
	 private String plaine;

	public BeneficiaireFormation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeneficiaireFormation(String numeroCNIB, Date dateEtabli, String matricule, String plaine) {
		super();
		this.numeroCNIB = numeroCNIB;
		this.dateEtabli = dateEtabli;
		this.matricule = matricule;
		this.plaine = plaine;
	}

	public String getNumeroCNIB() {
		return numeroCNIB;
	}

	public void setNumeroCNIB(String numeroCNIB) {
		this.numeroCNIB = numeroCNIB;
	}


	public String getMatricule() {
		return matricule;
	}

	public void setMatricule(String matricule) {
		this.matricule = matricule;
	}

	public String getPlaine() {
		return plaine;
	}

	public void setPlaine(String plaine) {
		this.plaine = plaine;
	}

	public Date getDateEtabli() {
		return dateEtabli;
	}

	public void setDateEtabli(Date dateEtabli) {
		this.dateEtabli = dateEtabli;
	}

	
}
