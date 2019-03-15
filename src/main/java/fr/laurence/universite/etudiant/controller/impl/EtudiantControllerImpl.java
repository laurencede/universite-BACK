package fr.laurence.universite.etudiant.controller.impl;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.laurence.universite.etudiant.controller.IEtudiantController;
import fr.laurence.universite.etudiant.domain.Etudiants;
import fr.laurence.universite.etudiant.service.impl.EtudiantsServiceImpl;

@RestController
public class EtudiantControllerImpl implements IEtudiantController{

	Logger log = LoggerFactory.getLogger(EtudiantControllerImpl.class);
	
	@Autowired
	EtudiantsServiceImpl etudiantService;
	
	@Override
	@GetMapping("/etudiants")
	public List<Etudiants> findAll() {
		List<Etudiants> liste = etudiantService.findAll();
		return liste;
	}

	@Override
	@GetMapping("/etudiants/{id}")
	public Etudiants findOne(@PathVariable Integer id) {
		Etudiants etudiant = etudiantService.getOneEtudiants(id);
		return etudiant;
	}

	@Override
	@PostMapping("/etudiants")
	public Etudiants save(@RequestBody Etudiants etudiant) {
		Etudiants et = etudiantService.ajouterEtudiant(etudiant);
		return et;
	}

}
