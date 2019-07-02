package bf.agriculture.VulgaData.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToMany;

@Entity
public class Participation implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	@OneToMany(mappedBy="participations")
	private Collection<Formation> formations;
	@OneToMany(mappedBy="participations")
	private List<Acteurs> acteurs;
   private String typePartici;

	public Participation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Participation(String typePartici) {
		super();
		this.typePartici = typePartici;
	}

	public String getTypePartici() {
		return typePartici;
	}

	public void setTypePartici(String typePartici) {
		this.typePartici = typePartici;
	}
	 
	 
}
