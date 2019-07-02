package bf.agriculture.VulgaData.service;

import java.io.Serializable;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.User;
//ici sa etends un utilisateur
public class JwtUserDetailsService extends User  {
	
	private String email;

	public JwtUserDetailsService(String username, String password, boolean enabled, boolean accountNonExpired,
			boolean credentialsNonExpired, boolean accountNonLocked,
			Collection<? extends GrantedAuthority> authorities) {
		super(username, password, enabled, accountNonExpired, credentialsNonExpired, accountNonLocked, authorities);
		// TODO Auto-generated constructor stub
	}

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	@Override
	public Collection<GrantedAuthority> getAuthorities() {
		// TODO Auto-generated method stub
		return super.getAuthorities();
	}

	@Override
	public String getPassword() {
		// TODO Auto-generated method stub
		return super.getPassword();
	}

	@Override
	public String getUsername() {
		// TODO Auto-generated method stub
		return super.getUsername();
	}

	@Override
	public boolean isEnabled() {
		// TODO Auto-generated method stub
		return super.isEnabled();
	}

	@Override
	public boolean isAccountNonExpired() {
		// TODO Auto-generated method stub
		return super.isAccountNonExpired();
	}

	@Override
	public boolean isAccountNonLocked() {
		// TODO Auto-generated method stub
		return super.isAccountNonLocked();
	}

	@Override
	public boolean isCredentialsNonExpired() {
		// TODO Auto-generated method stub
		return super.isCredentialsNonExpired();
	}

	@Override
	public void eraseCredentials() {
		// TODO Auto-generated method stub
		super.eraseCredentials();
	}

	@Override
	public boolean equals(Object rhs) {
		// TODO Auto-generated method stub
		return super.equals(rhs);
	}

	@Override
	public int hashCode() {
		// TODO Auto-generated method stub
		return super.hashCode();
	}

	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
	
	

}
