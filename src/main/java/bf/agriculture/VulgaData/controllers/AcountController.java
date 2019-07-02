package bf.agriculture.VulgaData.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import bf.agriculture.VulgaData.entities.Utilisateur;
import bf.agriculture.VulgaData.service.AcountService;

@RestController
@RequestMapping("/api/v1")
public class AcountController {
	
	@Autowired
	private AcountService service;
	
	@PostMapping("/user")
	public Utilisateur saveUser(@RequestBody Utilisateur user)
	{
		return service.enregistrerUtilisateur(user);
	}
	

}
