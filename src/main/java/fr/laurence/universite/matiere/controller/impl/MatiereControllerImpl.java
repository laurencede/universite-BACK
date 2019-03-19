package fr.laurence.universite.matiere.controller.impl;

import java.util.List;

import org.hibernate.annotations.UpdateTimestamp;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.laurence.universite.matiere.controller.IMatiereController;
import fr.laurence.universite.matiere.domain.Matieres;
import fr.laurence.universite.matiere.service.impl.MatiereServiceImpl;

@RestController
public class MatiereControllerImpl implements IMatiereController{

	Logger log = LoggerFactory.getLogger(MatiereControllerImpl.class);
	
	@Autowired
	MatiereServiceImpl matiereService;

	@Override
	@GetMapping("/matieres")
	public List<Matieres> findAll() {
		List<Matieres> liste = matiereService.findAll(); 
		return liste;
	}

	@Override
	@GetMapping("/matieres/{id}")
	public Matieres findOne(@PathVariable Integer id) {
		Matieres m = matiereService.getOneMatiere(id);
		return m;
	}

	@Override
	@PostMapping("/matieres")
	public Matieres save(@RequestBody Matieres matiere) {
		Matieres m = matiereService.save(matiere);
		return m;
	}

	@Override
	@DeleteMapping("/matieres/{id}")
	public void delete(@PathVariable Integer id) {
		matiereService.supprimer(id);		
	}

	@Override
	@PutMapping("/matieres/{id}")
	public Matieres update(@RequestBody Matieres matiere, @PathVariable Integer id) {
		matiere.setId(id);
		Matieres m = matiereService.saveModif(matiere);
		return m;
	}
	
	
	
	
}
