package bf.agriculture.VulgaData.entities;

import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.hibernate.mapping.Set;

import ch.qos.logback.core.joran.action.ParamAction;

@Entity
public class Formation implements Serializable {
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idpartici")
	private Participation participations;
	@ManyToOne(fetch=FetchType.LAZY)
	@JoinColumn(name="idLieu")
	private Lieux lieux  ;
	
	@OneToMany(mappedBy="formations")  
	private Collection<Rapports>rapports;
	
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn(name="id_formation")
	private TypeFormation typeformations;
	//faire la jointure car par defaut spring n'arrive pas a faire la jonture
	@ManyToMany
	@JoinTable(name="FORMATION_PARTENAIRES",joinColumns= {@JoinColumn(name="FORMATION_ID")},inverseJoinColumns={@JoinColumn(name="PARTENAIRE_ID")})
	private List<Partenaire> Partenaires;
	
	@ManyToOne (fetch=FetchType.LAZY)
	@JoinColumn(name="idThemForma")
	private Theme_formation themeformations;
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO)
	private int id_forma;
	
	 
	 
	 @Column(nullable=false)
	 @Temporal(TemporalType.DATE)
	 private Date dateDebForma;
	 
	 @Column(nullable=false)
	 @Temporal(TemporalType.DATE)
	 private Date dateFinForma;
	 
	 
	 private long couts;
	 
	 
	 private String rapporteurs;
	 
	 
	 private int nbHomme ;
	 
	 
	 private int nbFemme;
	 
	 
	 private String commentaires;
    
	public Formation() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Formation(Date dateDebForma, Date dateFinForma, long couts, String rapporteurs, int nbHomme,
			int nbFemme, String commentaires) {
		super();
		
		this.dateDebForma = dateDebForma;
		this.dateFinForma = dateFinForma;
		this.couts = couts;
		this.rapporteurs = rapporteurs;
		this.nbHomme = nbHomme;
		this.nbFemme = nbFemme;
		this.commentaires = commentaires;
	}

	public int getId_forma() {
		return id_forma;
	}

	public void setId_forma(int id_forma) {
		this.id_forma = id_forma;
	}

	
	public Date getDateDebForma() {
		return dateDebForma;
	}

	public void setDateDebForma(Date dateDebForma) {
		this.dateDebForma = dateDebForma;
	}

	public Date getDateFinForma() {
		return dateFinForma;
	}

	public void setDateFinForma(Date dateFinForma) {
		this.dateFinForma = dateFinForma;
	}

	public long getCouts() {
		return couts;
	}

	public void setCouts(long couts) {
		this.couts = couts;
	}

	public String getRapporteurs() {
		return rapporteurs;
	}

	public void setRapporteurs(String rapporteurs) {
		this.rapporteurs = rapporteurs;
	}

	public int getNbHomme() {
		return nbHomme;
	}

	public void setNbHomme(int nbHomme) {
		this.nbHomme = nbHomme;
	}

	public int getNbFemme() {
		return nbFemme;
	}

	public void setNbFemme(int nbFemme) {
		this.nbFemme = nbFemme;
	}

	public String getCommentaires() {
		return commentaires;
	}

	public void setCommentaires(String commentaires) {
		this.commentaires = commentaires;
	}
	 
	 
	 
	 
	 
	

}
