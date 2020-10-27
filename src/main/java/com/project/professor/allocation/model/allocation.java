package com.project.professor.allocation.model;
import java.sql.Time;

public class allocation {

	private Integer id;
	private Character day;
	private Time end;
	private Time start;

	public allocation() {
		super();
	}

	public allocation(Integer id, Character day, Time end, Time start) {
		super();
		this.id = id;
		this.day = day;
		this.end = end;
		this.start = start;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Character getDay() {
		return day;
	}

	public void setDay(Character day) {
		this.day = day;
	}

	public Time getEnd() {
		return end;
	}

	public void setEnd(Time end) {
		this.end = end;
	}

	public Time getStart() {
		return start;
	}

	public void setStart(Time start) {
		this.start = start;
	}

}
