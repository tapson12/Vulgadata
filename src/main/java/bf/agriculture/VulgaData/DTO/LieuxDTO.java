package bf.agriculture.VulgaData.DTO;



import java.util.Collection;


public class LieuxDTO {
	
	private  java.util.Collection<FormationDTO> formationsdto;
	 
	private int idLieux;
	private String intituler_lieu;
	public LieuxDTO() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LieuxDTO(Collection<FormationDTO> formationsdto, int idLieux, String intituler_lieu) {
		super();
		this.formationsdto = formationsdto;
		this.idLieux = idLieux;
		this.intituler_lieu = intituler_lieu;
	}
	public java.util.Collection<FormationDTO> getFormationsdto() {
		return formationsdto;
	}
	public void setFormationsdto(java.util.Collection<FormationDTO> formationsdto) {
		this.formationsdto = formationsdto;
	}
	public int getIdLieux() {
		return idLieux;
	}
	public void setIdLieux(int idLieux) {
		this.idLieux = idLieux;
	}
	public String getIntituler_lieu() {
		return intituler_lieu;
	}
	public void setIntituler_lieu(String intituler_lieu) {
		this.intituler_lieu = intituler_lieu;
	}


}
