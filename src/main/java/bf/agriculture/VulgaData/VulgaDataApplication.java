package bf.agriculture.VulgaData;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import bf.agriculture.VulgaData.entities.Roles;
import bf.agriculture.VulgaData.entities.Utilisateur;
import bf.agriculture.VulgaData.service.AcountService;

@SpringBootApplication
public class VulgaDataApplication implements CommandLineRunner {

	@Autowired
	private AcountService acountService;
	
	public static void main(String[] args) {
		SpringApplication.run(VulgaDataApplication.class, args);
	}
	//nous encodons le modelmapper qui est un interface
	@Bean
	public ModelMapper modelMapper()
	{
		return new ModelMapper();
	}
	
	@Bean
	public BCryptPasswordEncoder bBCPE()
	{
		return new BCryptPasswordEncoder();
	}
	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		
		acountService.AjouterRole(new Roles("ADMIN"));
		
	}
	
	
 
}
