package bf.agriculture.VulgaData.service;


import bf.agriculture.VulgaData.entities.Roles;
import bf.agriculture.VulgaData.entities.Utilisateur;

public interface AcountService {
	
	public Utilisateur enregistrerUtilisateur(Utilisateur utilisateur);
	public Roles AjouterRole(Roles role);
	public void AjouterRoleUtilisateur(String username,String rolename);
	public Utilisateur findByUsername(String username);

}
