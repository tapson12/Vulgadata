package bf.agriculture.VulgaData.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
public class Theme_formation implements Serializable {
	    @OneToMany(mappedBy="themeformations")
	    private List<Formation> formations;
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		private int id_themForma;
	    
	    @Column(nullable=false)
		 private String nomTheme;

		public Theme_formation() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Theme_formation(String nomTheme) {
			super();
			this.nomTheme = nomTheme;
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
