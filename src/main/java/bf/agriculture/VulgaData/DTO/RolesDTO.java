package bf.agriculture.VulgaData.DTO;

public class RolesDTO {
	
	private int id;
	private String rolename;
	
	public RolesDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public RolesDTO(int id, String rolename) {
		super();
		this.id = id;
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
