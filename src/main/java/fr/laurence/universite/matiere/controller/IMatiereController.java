package fr.laurence.universite.matiere.controller;

import java.util.List;

import fr.laurence.universite.matiere.domain.Matieres;

public interface IMatiereController {

	public List<Matieres> findAll();
	public Matieres findOne(Integer id);
	public Matieres save(Matieres matiere);
}
