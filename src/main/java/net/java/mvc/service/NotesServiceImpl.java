package net.java.mvc.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import net.java.mvc.model.Notes;
import net.java.mvc.repository.NotesRepository;

@Service
public class NotesServiceImpl implements NotesService {

	@Autowired
	private NotesRepository m_notesRepository;

	@Override
	public List<Notes> getAllNotes() {

		return m_notesRepository.findAll();
	}

	@Override
	public void saveNotes(Notes m_note) {

		this.m_notesRepository.save(m_note);

	}

	@Override
	public Notes getNotesById(long id) {
		Optional<Notes> optional = m_notesRepository.findById(id);

		Notes m_note = null;
		if (optional.isPresent()) {
			m_note = optional.get();
		} else {
			throw new RuntimeException("Note with Id NOT FOUND :: " + id);
		}
		return m_note;

	}

	@Override
	public void deleteNoteById(long id) {

		this.m_notesRepository.deleteById(id);

	}

}
