package bf.agriculture.VulgaData.DTO;

import java.util.List;


public class Theme_formationDTO {

	    private List<FormationDTO> formationsdto;
	   
		private int id_themForma;
	    
		 private String nomTheme;

		public Theme_formationDTO() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Theme_formationDTO(List<FormationDTO> formationsdto, int id_themForma, String nomTheme) {
			super();
			this.formationsdto = formationsdto;
			this.id_themForma = id_themForma;
			this.nomTheme = nomTheme;
		}

		public List<FormationDTO> getFormationsdto() {
			return formationsdto;
		}

		public void setFormationsdto(List<FormationDTO> formationsdto) {
			this.formationsdto = formationsdto;
		}

		public int getId_themForma() {
			return id_themForma;
		}

		public void setId_themForma(int id_themForma) {
			this.id_themForma = id_themForma;
		}

		public String getNomTheme() {
			return nomTheme;
		}

		public void setNomTheme(String nomTheme) {
			this.nomTheme = nomTheme;
		}
	

}
