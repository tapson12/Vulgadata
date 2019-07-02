package bf.agriculture.VulgaData.DTO;

import java.util.Collection;
import java.util.List;


public class ParticipationDTO {
	
	
	private int id;
	private String typePartici;
	private Collection<FormationDTO> formations;
	
    private List<ActeursDTO> acteurs;

	public ParticipationDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ParticipationDTO(int id, String typePartici, Collection<FormationDTO> formations, List<ActeursDTO> acteurs) {
		super();
		this.id = id;
		this.typePartici = typePartici;
		this.formations = formations;
		this.acteurs = acteurs;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTypePartici() {
		return typePartici;
	}

	public void setTypePartici(String typePartici) {
		this.typePartici = typePartici;
	}

	public Collection<FormationDTO> getFormations() {
		return formations;
	}

	public void setFormations(Collection<FormationDTO> formations) {
		this.formations = formations;
	}

	public List<ActeursDTO> getActeurs() {
		return acteurs;
	}

	public void setActeurs(List<ActeursDTO> acteurs) {
		this.acteurs = acteurs;
	}
    
    
   

}
