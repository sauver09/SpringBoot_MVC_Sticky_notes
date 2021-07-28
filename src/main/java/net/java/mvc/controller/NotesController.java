package net.java.mvc.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import net.java.mvc.model.Notes;
import net.java.mvc.service.NotesService;

@Controller
public class NotesController {

	@Autowired
	private NotesService m_NotesService;

	@GetMapping("/")
	public String viewHomePage(Model model) {
		model.addAttribute("ListOfNotes", m_NotesService.getAllNotes());

		return "index";
	}

	@GetMapping("/addStickyNote")
	public String addStickyNote(Model model) {
		Notes m_note = new Notes();
		model.addAttribute("m_note", m_note);

		return "newStickyNote";

	}

	@PostMapping("/saveNote")
	String saveNote(@ModelAttribute("m_note") Notes m_notes) {
		m_NotesService.saveNotes(m_notes);
		return "redirect:/";

	}

	@GetMapping("/showFormForUpdate/{id}")
	String showFormForUpdate(@PathVariable(value = "id") long id, Model model) {
		Notes m_note = m_NotesService.getNotesById(id);

		model.addAttribute("m_note", m_note);

		return "update_note";

	}

	@GetMapping("deleteNote/{id}")
	String deleteNote(@PathVariable(value = "id") long id) {
		Notes m_note = m_NotesService.getNotesById(id);
		this.m_NotesService.deleteNoteById(id);
		return "redirect:/";
	}

}
