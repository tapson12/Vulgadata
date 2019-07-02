package bf.agriculture.VulgaData.DTO;

import java.util.Collection;
import java.util.Date;
import java.util.List;



public class FormationDTO {
	
	
	private LieuxDTO lieuxdto  ;
	

	private Collection<RapportsDTO>rapportsdto;
	
	private TypeFormationDTO typeformationsdto;
	
	private List<PartenaireDTO> Partenairesdto;
	
	private Theme_formationDTO themeformationsdto;
	
	private int id_forma;
	
	private Date dateDebForma;


	private Date dateFinForma;
	 
	 
	 private long couts;
	 
	 
	 private String rapporteurs;
	 
	 
	 private int nbHomme ;
	 
	 
	 private int nbFemme;
	 
	 
	 private String commentaires;
	 public FormationDTO() {
			super();
			// TODO Auto-generated constructor stub
			}
	public FormationDTO(LieuxDTO lieuxdto, Collection<RapportsDTO> rapportsdto, TypeFormationDTO typeformationsdto,
			List<PartenaireDTO> partenairesdto, Theme_formationDTO themeformationsdto, int id_forma, Date dateDebForma,
			Date dateFinForma, long couts, String rapporteurs, int nbHomme, int nbFemme, String commentaires) {
		super();
		this.lieuxdto = lieuxdto;
		this.rapportsdto = rapportsdto;
		this.typeformationsdto = typeformationsdto;
		Partenairesdto = partenairesdto;
		this.themeformationsdto = themeformationsdto;
		this.id_forma = id_forma;
		this.dateDebForma = dateDebForma;
		this.dateFinForma = dateFinForma;
		this.couts = couts;
		this.rapporteurs = rapporteurs;
		this.nbHomme = nbHomme;
		this.nbFemme = nbFemme;
		this.commentaires = commentaires;
	}
	public LieuxDTO getLieuxdto() {
		return lieuxdto;
	}
	public void setLieuxdto(LieuxDTO lieuxdto) {
		this.lieuxdto = lieuxdto;
	}
	public Collection<RapportsDTO> getRapportsdto() {
		return rapportsdto;
	}
	public void setRapportsdto(Collection<RapportsDTO> rapportsdto) {
		this.rapportsdto = rapportsdto;
	}
	public TypeFormationDTO getTypeformationsdto() {
		return typeformationsdto;
	}
	public void setTypeformationsdto(TypeFormationDTO typeformationsdto) {
		this.typeformationsdto = typeformationsdto;
	}
	public List<PartenaireDTO> getPartenairesdto() {
		return Partenairesdto;
	}
	public void setPartenairesdto(List<PartenaireDTO> partenairesdto) {
		Partenairesdto = partenairesdto;
	}
	public Theme_formationDTO getThemeformationsdto() {
		return themeformationsdto;
	}
	public void setThemeformationsdto(Theme_formationDTO themeformationsdto) {
		this.themeformationsdto = themeformationsdto;
	}
	public int getId_forma() {
		return id_forma;
	}
	public void setId_forma(int id_forma) {
		this.id_forma = id_forma;
	}
	public Date getDateDebForma() {
		return dateDebForma;
	}
	public void setDateDebForma(Date dateDebForma) {
		this.dateDebForma = dateDebForma;
	}
	public Date getDateFinForma() {
		return dateFinForma;
	}
	public void setDateFinForma(Date dateFinForma) {
		this.dateFinForma = dateFinForma;
	}
	public long getCouts() {
		return couts;
	}
	public void setCouts(long couts) {
		this.couts = couts;
	}
	public String getRapporteurs() {
		return rapporteurs;
	}
	public void setRapporteurs(String rapporteurs) {
		this.rapporteurs = rapporteurs;
	}
	public int getNbHomme() {
		return nbHomme;
	}
	public void setNbHomme(int nbHomme) {
		this.nbHomme = nbHomme;
	}
	public int getNbFemme() {
		return nbFemme;
	}
	public void setNbFemme(int nbFemme) {
		this.nbFemme = nbFemme;
	}
	public String getCommentaires() {
		return commentaires;
	}
	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	

}
