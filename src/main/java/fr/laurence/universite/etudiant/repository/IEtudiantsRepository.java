package fr.laurence.universite.etudiant.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import fr.laurence.universite.etudiant.domain.Etudiants;

@Repository
public interface IEtudiantsRepository extends JpaRepository<Etudiants, Integer>{
	
}
