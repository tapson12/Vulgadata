package bf.agriculture.VulgaData.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;


@Entity
public class Rapports implements Serializable {
	
	@ManyToOne
	private Formation formations;
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idRapport ;
	
	@Column(nullable=false,unique=true)
	private String rapportFile;

	
	
	public Rapports() {
		super();
		// TODO Auto-generated constructor stub
	}

	

	public Rapports(String rapportFile) {
		super();
		this.rapportFile = rapportFile;
	}



	public int getIdRapport() {
		return idRapport;
	}



	public void setIdRapport(int idRapport) {
		this.idRapport = idRapport;
	}



	public String getRapportFile() {
		return rapportFile;
	}



	public void setRapportFile(String rapportFile) {
		this.rapportFile = rapportFile;
	}
	
	
	
	
	
	
	
	

}
