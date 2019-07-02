package bf.agriculture.VulgaData.DTO;

import java.util.List;


public class TypeFormationDTO {
	

	   private List<FormationDTO>formationsdto;
	   
		private int id_formation;
		
		 private String intitule_formationType;

		public TypeFormationDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public TypeFormationDTO(List<FormationDTO> formationsdto, int id_formation, String intitule_formationType) {
			super();
			this.formationsdto = formationsdto;
			this.id_formation = id_formation;
			this.intitule_formationType = intitule_formationType;
		}

		public List<FormationDTO> getFormationsdto() {
			return formationsdto;
		}

		public void setFormationsdto(List<FormationDTO> formationsdto) {
			this.formationsdto = formationsdto;
		}

		public int getId_formation() {
			return id_formation;
		}

		public void setId_formation(int id_formation) {
			this.id_formation = id_formation;
		}

		public String getIntitule_formationType() {
			return intitule_formationType;
		}

		public void setIntitule_formationType(String intitule_formationType) {
			this.intitule_formationType = intitule_formationType;
		}


}
