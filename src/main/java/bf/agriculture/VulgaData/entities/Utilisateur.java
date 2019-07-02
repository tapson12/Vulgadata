package bf.agriculture.VulgaData.entities;

import java.util.List;

import javax.persistence.Column;
import javax.persistence.Entity;import javax.persistence.FetchType;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Utilisateur extends Acteurs  {
	
	
	@Column(nullable=false,unique=true)
	private String username;
	
	@Column(nullable=false)
	 private String password;
	
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Roles> role;

	public Utilisateur() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Utilisateur(String nomPers, String prenomPers, boolean sexe, String email, String numTel) {
		super(nomPers, prenomPers, sexe, email, numTel);
		// TODO Auto-generated constructor stub
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<Roles> getRole() {
		return role;
	}

	public void setRole(List<Roles> role) {
		this.role = role;
	}
	
	

	

}
