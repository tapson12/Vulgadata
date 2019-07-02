package bf.agriculture.VulgaData.DTO;

import java.util.List;

public class CommuneDTO {

	private List<VillageDTO> villagesdto;
	
	private DepartementDTO departementsdto;
	
	private int idCom;

	 private String nomCom;

	public CommuneDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public CommuneDTO(List<VillageDTO> villagesdto, DepartementDTO departementsdto, int idCom, String nomCom) {
		super();
		this.villagesdto = villagesdto;
		this.departementsdto = departementsdto;
		this.idCom = idCom;
		this.nomCom = nomCom;
	}

	public List<VillageDTO> getVillagesdto() {
		return villagesdto;
	}

	public void setVillagesdto(List<VillageDTO> villagesdto) {
		this.villagesdto = villagesdto;
	}

	public DepartementDTO getDepartementsdto() {
		return departementsdto;
	}

	public void setDepartementsdto(DepartementDTO departementsdto) {
		this.departementsdto = departementsdto;
	}

	public int getIdCom() {
		return idCom;
	}

	public void setIdCom(int idCom) {
		this.idCom = idCom;
	}

	public String getNomCom() {
		return nomCom;
	}

	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}
	 
	
}
