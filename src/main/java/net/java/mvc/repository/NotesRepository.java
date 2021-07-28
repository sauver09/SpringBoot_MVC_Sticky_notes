package net.java.mvc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import net.java.mvc.model.Notes;

@Repository
public interface NotesRepository extends JpaRepository< Notes,Long> {

}
