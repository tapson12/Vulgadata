package bf.agriculture.VulgaData.service;

import bf.agriculture.VulgaData.entities.Utilisateur;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.*;
class UserDetailService implements UserDetailsService   {

	@Autowired
	private AcountService acounservice;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		// TODO Auto-generated method stub
		
		Utilisateur user=acounservice.findByUsername(username);
		
		if (user==null) throw new UsernameNotFoundException(username);
		
		Collection<GrantedAuthority> authorities=new ArrayList<>();
		
		user.getRole().forEach(r->{
			
			authorities.add(new SimpleGrantedAuthority(r.getRolename()));
		});
		return new User(user.getUsername(), user.getPassword(), authorities);
	}

	

}
