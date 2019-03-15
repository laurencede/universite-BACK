package fr.laurence.universite.etudiant.controller;

import java.util.List;

import fr.laurence.universite.etudiant.domain.Etudiants;

public interface IEtudiantController {
	
	public List<Etudiants> findAll();
	public Etudiants findOne(Integer id);
	public Etudiants save(Etudiants etudiant);
	
}
