package com.project.professor.allocation.model;

public class course {

	private Long id;
	private Character name;

	public course() {
		super();
	}

	public course(Long id, Character name) {
		super();
		this.id = id;
		this.name = name;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public Character getName() {
		return name;
	}

	public void setName(Character name) {
		this.name = name;
	}

}
