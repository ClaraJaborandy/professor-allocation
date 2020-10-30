package com.project.professor.allocation.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.professor.allocation.model.Professor;

public interface ProfessorRepository extends JpaRepository<Professor, Long> {

	List<Professor> findByNameContainingIgnoreCase(String name);

}
