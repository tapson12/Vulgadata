package bf.agriculture.VulgaData.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;

import org.hibernate.mapping.Collection;

import antlr.collections.List;

@Entity
public class Region implements Serializable {
	
	
	@OneToMany(mappedBy="regions")
	private java.util.List<Acteurs> acteurs;
	//@ManyToMany
	//private java.util.Collection<Acteurs> acteurs;
	@OneToMany (mappedBy="departements")
	private java.util.List<Province> provinces; 
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int idRegon;
	 @Column(nullable=false)
	 private String nomRegion;
	public Region() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Region(String nomRegion) {
		super();
		this.nomRegion = nomRegion;
	}
	public int getIdRegon() {
		return idRegon;
	}
	public void setIdRegon(int idRegon) {
		this.idRegon = idRegon;
	}
	public String getNomRegion() {
		return nomRegion;
	}
	public void setNomRegion(String nomRegion) {
		this.nomRegion = nomRegion;
	}
	 

}
