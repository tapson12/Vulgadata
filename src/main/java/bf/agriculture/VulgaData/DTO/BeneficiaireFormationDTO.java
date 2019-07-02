package bf.agriculture.VulgaData.DTO;

import java.util.Date;



public class BeneficiaireFormationDTO {
	
	

	private String numeroCNIB;

	 private Date dateEtabli;

	 private String matricule;
	
	 private String plaine;

	public BeneficiaireFormationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public BeneficiaireFormationDTO(String numeroCNIB, Date dateEtabli, String matricule, String plaine) {
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

	public Date getDateEtabli() {
		return dateEtabli;
	}

	public void setDateEtabli(Date dateEtabli) {
		this.dateEtabli = dateEtabli;
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

}
