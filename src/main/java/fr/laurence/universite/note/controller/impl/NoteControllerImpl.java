package fr.laurence.universite.note.controller.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import fr.laurence.universite.note.controller.INoteController;
import fr.laurence.universite.note.domain.Note;
import fr.laurence.universite.note.service.impl.NoteServiceImpl;


@RestController
public class NoteControllerImpl implements INoteController{

	@Autowired
	NoteServiceImpl noteService;
	
	@Override
	@GetMapping("/notes")
	public List<Note> findAll() {
		List<Note> listeNote = noteService.findAll();
		return listeNote;
	}

	@Override
	@GetMapping("/notes/{idEtudiant}/{idMatiere}")
	public Note findOne(@PathVariable Integer idEtudiant, @PathVariable Integer idMatiere) {
		Note n = noteService.findOne(idEtudiant, idMatiere);
		return n;
	}

	@Override
	@PostMapping("/notes")
	public Note save(@RequestBody Note note) {
		Note n = noteService.save(note);
		return n;
	}

}
