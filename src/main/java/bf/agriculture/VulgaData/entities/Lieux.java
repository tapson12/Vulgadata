package bf.agriculture.VulgaData.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.UniqueConstraint;

import org.hibernate.mapping.Collection;

@Entity
public class Lieux implements Serializable {
	@OneToMany
	private  java.util.Collection<Formation> formations;
	 
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int idLieux;
	
	@Column(nullable=false)
	 private String intituler_lieu;

	public Lieux() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Lieux(String intituler_lieu) {
		super();
		this.intituler_lieu = intituler_lieu;
	}

	public int getIdLieux() {
		return idLieux;
	}

	public void setIdLieux(int idLieux) {
		this.idLieux = idLieux;
	}

	public String getIntituler_lieu() {
		return intituler_lieu;
	}

	public void setIntituler_lieu(String intituler_lieu) {
		this.intituler_lieu = intituler_lieu;
	}

	
	
	 
	 
	 
}
