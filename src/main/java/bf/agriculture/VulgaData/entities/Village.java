package bf.agriculture.VulgaData.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

@Entity
public class Village  implements Serializable{
	
 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idVillage ;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idCom")
	private Commune communes;
	
	@Column(nullable=false)
	private String nom ;
	

	public Village() {
		super();
		// TODO Auto-generated constructor stub
	}

	
	public Village(String nom) {
		super();
		this.nom = nom;
	}

	public int getIdVillage() {
		return idVillage;
	}

	public void setIdVillage(int idVillage) {
		this.idVillage = idVillage;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}
	

	
	
}
