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
public class Commune implements Serializable {

	@OneToMany(mappedBy="communes")
	private List<Village> villages;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idDepart")
	private Departement departements;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int idCom;
	 @Column(nullable=false)
	 private String nomCom;
	 //pour avoir la liste des villages de la commune
	// private List<Village>villages;
	 
	public Commune() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Commune(String nomCom) {
		super();
		this.nomCom = nomCom;
	}
	public int getIdCom() {
		return idCom;
	}
	public void setIdCom(int idCom) {
		this.idCom = idCom;
	}
	public String getNomCom() {
		return nomCom;
	}
	public void setNomCom(String nomCom) {
		this.nomCom = nomCom;
	}
	
}
