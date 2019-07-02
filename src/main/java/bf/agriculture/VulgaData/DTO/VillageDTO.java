package bf.agriculture.VulgaData.DTO;





public class VillageDTO {
	
	
	private int idVillage ;
	
	private CommuneDTO communesdto;
	
	private String nom ;

	public VillageDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public VillageDTO(int idVillage, CommuneDTO communesdto, String nom) {
		super();
		this.idVillage = idVillage;
		this.communesdto = communesdto;
		this.nom = nom;
	}

	public int getIdVillage() {
		return idVillage;
	}

	public void setIdVillage(int idVillage) {
		this.idVillage = idVillage;
	}

	public CommuneDTO getCommunesdto() {
		return communesdto;
	}

	public void setCommunesdto(CommuneDTO communesdto) {
		this.communesdto = communesdto;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

	

}
