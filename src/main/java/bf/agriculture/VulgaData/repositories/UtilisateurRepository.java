package bf.agriculture.VulgaData.repositories;


import org.springframework.data.repository.CrudRepository;


import bf.agriculture.VulgaData.entities.Utilisateur;


public interface UtilisateurRepository  extends CrudRepository<Utilisateur, Integer>{

public Utilisateur findByUsername(String username);

}
