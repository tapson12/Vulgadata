package bf.agriculture.VulgaData.DTO;

import java.util.List;

public class RegionDTO {
	
	private List<ActeursDTO> acteursdto;
	//@ManyToMany
	//private java.util.Collection<Acteurs> acteurs;
	
	private java.util.List<ProvinceDTO> provincesdto; 
	
	private int idRegon;
	
	 private String nomRegion;

	public RegionDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RegionDTO(List<ActeursDTO> acteursdto, List<ProvinceDTO> provincesdto, int idRegon, String nomRegion) {
		super();
		this.acteursdto = acteursdto;
		this.provincesdto = provincesdto;
		this.idRegon = idRegon;
		this.nomRegion = nomRegion;
	}

	public List<ActeursDTO> getActeursdto() {
		return acteursdto;
	}

	public void setActeursdto(List<ActeursDTO> acteursdto) {
		this.acteursdto = acteursdto;
	}

	public java.util.List<ProvinceDTO> getProvincesdto() {
		return provincesdto;
	}

	public void setProvincesdto(java.util.List<ProvinceDTO> provincesdto) {
		this.provincesdto = provincesdto;
	}

	public int getIdRegon() {
		return idRegon;
	}

	public void setIdRegon(int idRegon) {
		this.idRegon = idRegon;
	}

	public String getNomRegion() {
		return nomRegion;
	}

	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}

}
