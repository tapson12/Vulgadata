package bf.agriculture.VulgaData.entities;

import java.io.Serializable;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

@Entity
public class Roles implements Serializable {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private int id;
	private String rolename;
	
	public Roles() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Roles(String rolename) {
		super();
		this.rolename = rolename;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getRolename() {
		return rolename;
	}

	public void setRolename(String rolename) {
		this.rolename = rolename;
	}
	
	
	

}
