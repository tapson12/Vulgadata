package bf.agriculture.VulgaData.service;


import java.util.List;

import bf.agriculture.VulgaData.entities.Roles;

public interface RolesServices {
	
	public Roles saveRoles(Roles roles);
	public List<Roles> getAllRoles();
	public Roles getRoleById(int id);
	public Roles updateRole(int id,Roles role);
	public void deleteRoles(int id);
	
	

}
