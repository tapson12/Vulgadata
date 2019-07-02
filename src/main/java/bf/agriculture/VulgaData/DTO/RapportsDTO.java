package bf.agriculture.VulgaData.DTO;


public class RapportsDTO {
	
	private FormationDTO formationsdto;
	
	private int idRapport ;
	private String rapportFile;
	public RapportsDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public RapportsDTO(FormationDTO formationsdto, int idRapport, String rapportFile) {
		super();
		this.formationsdto = formationsdto;
		this.idRapport = idRapport;
		this.rapportFile = rapportFile;
	}
	public FormationDTO getFormationsdto() {
		return formationsdto;
	}
	public void setFormationsdto(FormationDTO formationsdto) {
		this.formationsdto = formationsdto;
	}
	public int getIdRapport() {
		return idRapport;
	}
	public void setIdRapport(int idRapport) {
		this.idRapport = idRapport;
	}
	public String getRapportFile() {
		return rapportFile;
	}
	public void setRapportFile(String rapportFile) {
		this.rapportFile = rapportFile;
	}
	
	

}
