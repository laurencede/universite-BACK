package fr.laurence.universite.matiere.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import fr.laurence.universite.matiere.domain.Matieres;

public interface IMatiereRepository extends JpaRepository<Matieres, Integer>{

}
