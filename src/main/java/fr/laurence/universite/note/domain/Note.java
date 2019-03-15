package fr.laurence.universite.note.domain;

import java.io.Serializable;

import javax.persistence.Column;

import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import fr.laurence.universite.etudiant.domain.Etudiants;
import fr.laurence.universite.matiere.domain.Matieres;

@Entity
@Table(name="T_NOTE")
public class Note implements Serializable {
	
	@EmbeddedId
	private NotePK notePK;
	
	
	@Column(name="NOTE")
	private Double note;
	
	@ManyToOne
	@JoinColumn(name="ID_ETUDIANT", insertable=false, updatable=false)
	private Etudiants etudiant; 
	
	@ManyToOne
	@JoinColumn(name="ID_MATIERE", insertable=false, updatable=false)
	private Matieres matiere;


	public Double getNote() {
		return note;
	}

	public void setNote(Double note) {
		this.note = note;
	}

	public Etudiants getEtudiant() {
		return etudiant;
	}

	public void setEtudiant(Etudiants etudiant) {
		this.etudiant = etudiant;
	}

	public Matieres getMatiere() {
		return matiere;
	}

	public void setMatiere(Matieres matiere) {
		this.matiere = matiere;
	}

	public NotePK getNotePK() {
		return notePK;
	}

	public void setNotePK(NotePK notePK) {
		this.notePK = notePK;
	}
	
}
