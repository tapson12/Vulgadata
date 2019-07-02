package bf.agriculture.VulgaData.DTO;





public class ActeursDTO {
	

	private int idPerson;
	
	 private String nomPers;
	 
	
	 private String prenomPers;
	 
	 
	 private boolean sexe ;
	 
	
	 private String email;
	 
	 
	 private String numTel;
	 
	 private ParticipationDTO participationsdto;
		
	 private RegionDTO regionsdto;
	 

	public ActeursDTO() {
		super();
		// TODO Auto-generated constructor stub
	}


	public ActeursDTO(int idPerson, String nomPers, String prenomPers, boolean sexe, String email, String numTel,
			ParticipationDTO participationsdto, RegionDTO regionsdto) {
		super();
		this.idPerson = idPerson;
		this.nomPers = nomPers;
		this.prenomPers = prenomPers;
		this.sexe = sexe;
		this.email = email;
		this.numTel = numTel;
		this.participationsdto = participationsdto;
		this.regionsdto = regionsdto;
	}


	public ActeursDTO(String nomPers, String prenomPers, boolean sexe, String email, String numTel) {
		super();
		this.nomPers = nomPers;
		this.prenomPers = prenomPers;
		this.sexe = sexe;
		this.email = email;
		this.numTel = numTel;
	}


	public int getIdPerson() {
		return idPerson;
	}


	public void setIdPerson(int idPerson) {
		this.idPerson = idPerson;
	}


	public String getNomPers() {
		return nomPers;
	}


	public void setNomPers(String nomPers) {
		this.nomPers = nomPers;
	}


	public String getPrenomPers() {
		return prenomPers;
	}


	public void setPrenomPers(String prenomPers) {
		this.prenomPers = prenomPers;
	}


	public boolean isSexe() {
		return sexe;
	}


	public void setSexe(boolean sexe) {
		this.sexe = sexe;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getNumTel() {
		return numTel;
	}


	public void setNumTel(String numTel) {
		this.numTel = numTel;
	}


	public ParticipationDTO getParticipationsdto() {
		return participationsdto;
	}


	public void setParticipationsdto(ParticipationDTO participationsdto) {
		this.participationsdto = participationsdto;
	}


	public RegionDTO getRegionsdto() {
		return regionsdto;
	}


	public void setRegionsdto(RegionDTO regionsdto) {
		this.regionsdto = regionsdto;
	}

	
	 
}
