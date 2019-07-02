package bf.agriculture.VulgaData.DTO;

import java.util.List;

public class PartenaireDTO {
	
	
	    private List<FormationDTO> formationsdto;
	  
		private int id_Part;
		private String nomPart;
	    
	    
		 private String typesPart;


		public PartenaireDTO() {
			super();
			// TODO Auto-generated constructor stub
		}


		public PartenaireDTO(List<FormationDTO> formationsdto, int id_Part, String nomPart, String typesPart) {
			super();
			this.formationsdto = formationsdto;
			this.id_Part = id_Part;
			this.nomPart = nomPart;
			this.typesPart = typesPart;
		}


		public List<FormationDTO> getFormationsdto() {
			return formationsdto;
		}


		public void setFormationsdto(List<FormationDTO> formationsdto) {
			this.formationsdto = formationsdto;
		}


		public int getId_Part() {
			return id_Part;
		}


		public void setId_Part(int id_Part) {
			this.id_Part = id_Part;
		}


		public String getNomPart() {
			return nomPart;
		}


		public void setNomPart(String nomPart) {
			this.nomPart = nomPart;
		}


		public String getTypesPart() {
			return typesPart;
		}


		public void setTypesPart(String typesPart) {
			this.typesPart = typesPart;
		}


}
