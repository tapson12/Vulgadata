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
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

@Entity
public class Province implements Serializable {
	
	@OneToMany
	private List<Departement> departements;
	
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idRegion")
	private Region regions;

	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int idProvince;
	 @Column(nullable=false)
	 private String nomProvince;
	public Province() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Province(String nomProvince) {
		super();
		this.nomProvince = nomProvince;
	}
	public int getIdProvince() {
		return idProvince;
	}
	public void setIdProvince(int idProvince) {
		this.idProvince = idProvince;
	}
	public String getNomProvince() {
		return nomProvince;
	}
	public void setNomProvince(String nomProvince) {
		this.nomProvince = nomProvince;
	}

}
