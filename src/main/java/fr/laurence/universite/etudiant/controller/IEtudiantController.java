package fr.laurence.universite.etudiant.controller;

import java.util.List;

import fr.laurence.universite.etudiant.domain.Etudiants;

public interface IEtudiantController {
	
	public List<Etudiants> findAll();
	public Etudiants findOne(Integer id);
	public Etudiants save(Etudiants etudiant);
	public void delete(Integer id);
	public Etudiants update(Etudiants etudiant, Integer id);
	
}
