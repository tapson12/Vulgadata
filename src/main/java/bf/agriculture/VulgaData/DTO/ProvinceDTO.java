package bf.agriculture.VulgaData.DTO;

import java.util.List;



public class ProvinceDTO {
	
	private List<DepartementDTO> departementsdto;

	private RegionDTO regionsdto;
	
	private int idProvince;

	 private String nomProvince;

	public ProvinceDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public ProvinceDTO(List<DepartementDTO> departementsdto, RegionDTO regionsdto, int idProvince, String nomProvince) {
		super();
		this.departementsdto = departementsdto;
		this.regionsdto = regionsdto;
		this.idProvince = idProvince;
		this.nomProvince = nomProvince;
	}

	public List<DepartementDTO> getDepartementsdto() {
		return departementsdto;
	}

	public void setDepartementsdto(List<DepartementDTO> departementsdto) {
		this.departementsdto = departementsdto;
	}

	public RegionDTO getRegionsdto() {
		return regionsdto;
	}

	public void setRegionsdto(RegionDTO regionsdto) {
		this.regionsdto = regionsdto;
	}

	public int getIdProvince() {
		return idProvince;
	}

	public void setIdProvince(int idProvince) {
		this.idProvince = idProvince;
	}

	public String getNomProvince() {
		return nomProvince;
	}

	public void setNomProvince(String nomProvince) {
		this.nomProvince = nomProvince;
	}
	 
	 
	

}
