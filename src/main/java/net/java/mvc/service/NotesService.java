package net.java.mvc.service;

import java.util.List;

import org.springframework.stereotype.Service;

import net.java.mvc.model.Notes;

public interface NotesService {

	List<Notes> getAllNotes();

	void saveNotes(Notes m_note);

	Notes getNotesById(long id);

	void deleteNoteById(long id);

}
