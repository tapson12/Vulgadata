package bf.agriculture.VulgaData.entities;

import java.io.Serializable;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
public class TypeFormation implements Serializable {
   @OneToMany(mappedBy="typeformations")
   private List<Formation>formations;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id_formation;
    
    @Column(nullable=false)
	 private String intitule_formationType;

	public TypeFormation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeFormation(String intitule_formationType) {
		super();
		this.intitule_formationType = intitule_formationType;
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
