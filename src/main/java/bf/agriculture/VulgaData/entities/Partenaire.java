package bf.agriculture.VulgaData.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
public class Partenaire implements Serializable {
	    @ManyToMany
	    private List<Formation> formations;
	    @Id
	    @GeneratedValue(strategy=GenerationType.AUTO)
		private int id_Part;
		private String nomPart;
	    
	    
		 private String typesPart;

		public Partenaire() {
			super();
			// TODO Auto-generated constructor stub
		}

		public Partenaire(String nomPart, String typesPart) {
			super();
			this.nomPart = nomPart;
			this.typesPart = typesPart;
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
