package com.ibrahimyengue.hibernateOneToOne.repository;

import com.ibrahimyengue.hibernateOneToOne.domain.Notes;
import org.springframework.data.jpa.repository.JpaRepository;

public interface NoteRepository extends JpaRepository<Notes, Long> {
}
