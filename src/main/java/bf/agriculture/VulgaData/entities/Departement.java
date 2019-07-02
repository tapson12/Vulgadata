package bf.agriculture.VulgaData.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Departement implements Serializable {
	

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int idDepart;
	 @Column(nullable=false)
	 private String nomDepart;
		@ManyToOne (fetch=FetchType.LAZY)
		@JoinColumn(name="idProvince")
		private Province provinces;
		
		@OneToMany(mappedBy="departements")
		private List<Commune> communes;
	 
	public Departement() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Departement(String nomDepart) {
		super();
		this.nomDepart = nomDepart;
	}
	public int getIdDepart() {
		return idDepart;
	}
	public void setIdDepart(int idDepart) {
		this.idDepart = idDepart;
	}
	public String getNomDepart() {
		return nomDepart;
	}
	public void setNomDepart(String nomDepart) {
		this.nomDepart = nomDepart;
	}
	 
	

}
