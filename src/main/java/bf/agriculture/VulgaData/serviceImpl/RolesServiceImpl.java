package bf.agriculture.VulgaData.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import bf.agriculture.VulgaData.entities.Roles;
import bf.agriculture.VulgaData.repositories.RolesRepository;
import bf.agriculture.VulgaData.service.RolesServices;

public class RolesServiceImpl implements RolesServices {
	
	@Autowired
	RolesRepository dao;

	@Override
	public Roles saveRoles(Roles role) {
		// TODO Auto-generated method stub
		try {
			dao.save(role);
			return role;
			
		} catch (Exception e) {
			// TODO: handle exception
			
			return null;
		}
		
	}

	@Override
	public List<Roles> getAllRoles() {
		// TODO Auto-generated method stub
		return (List<Roles>) dao.findAll();
	}

	@Override
	public Roles getRoleById(int id) {
		// TODO Auto-generated method stub
		return dao.findById(id).get();
	}

	@Override
	public Roles updateRole(int id, Roles role) {
		// TODO Auto-generated method stub
		Roles roles=dao.findById(id).get();
		if (roles!=null) {
			
			roles.setRolename(role.getRolename());
			
			dao.save(roles);
			
			return roles;
		}
		return null;
	}

	@Override
	public void deleteRoles(int id) {
		// TODO Auto-generated method stub
		Roles role=dao.findById(id).get();
		dao.delete(role);
		
	}

}
