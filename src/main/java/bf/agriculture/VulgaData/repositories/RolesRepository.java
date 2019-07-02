package bf.agriculture.VulgaData.repositories;

import org.springframework.data.repository.CrudRepository;

import bf.agriculture.VulgaData.entities.Roles;

public interface RolesRepository extends CrudRepository<Roles, Integer> {
	
	public Roles findByRolename(String rolename);

}
