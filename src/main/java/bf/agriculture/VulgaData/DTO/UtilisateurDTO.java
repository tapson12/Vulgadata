package bf.agriculture.VulgaData.DTO;


public class UtilisateurDTO {
	

	 private String login;
	 
	 private String password;

	public UtilisateurDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public UtilisateurDTO(String login, String password) {
		super();
		this.login = login;
		this.password = password;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}


}
