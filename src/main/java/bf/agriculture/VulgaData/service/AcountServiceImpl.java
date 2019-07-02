package bf.agriculture.VulgaData.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import bf.agriculture.VulgaData.entities.Roles;
import bf.agriculture.VulgaData.entities.Utilisateur;
import bf.agriculture.VulgaData.repositories.RolesRepository;
import bf.agriculture.VulgaData.repositories.UtilisateurRepository;

@Service
@Transactional
public class AcountServiceImpl implements AcountService {
	
	@Autowired
	BCryptPasswordEncoder encodeur;
	
	

	@Autowired
	UtilisateurRepository userdao;
	
	@Autowired
	RolesRepository roledao;
	
	

	@Override
	public Utilisateur enregistrerUtilisateur(Utilisateur utilisateur) {
		// TODO Auto-generated method stub
		utilisateur.setPassword(encodeur.encode(utilisateur.getPassword()));
		return userdao.save(utilisateur);
	}

	@Override
	public Roles AjouterRole(Roles role) {
		// TODO Auto-generated method stub
		return roledao.save(role);
	}

	@Override
	public void AjouterRoleUtilisateur(String username, String rolename) {
		// TODO Auto-generated method stub
		
		Utilisateur user=userdao.findByUsername(username);
		Roles role=roledao.findByRolename(rolename);
		user.getRole().add(role);
		
	}

	@Override
	public Utilisateur findByUsername(String username) {
		// TODO Auto-generated method stub
		return userdao.findByUsername(username);
	}

}
