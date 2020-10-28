package com.project.professor.allocation.model;
import java.sql.Time;

public class Allocation {

	private Integer id;
	private Enum DayOfWeek;
	private Time end;
	private Time start;

	public Allocation() {
		super();
	}

	public Allocation(Integer id, Enum DayOfWeek, Time end, Time start) {
		super();
		this.id = id;
		this.DayOfWeek = DayOfWeek;
		this.end = end;
		this.start = start;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Enum getDayOfWeek() {
		return DayOfWeek;
	}

	public void setDay(Enum DayOfWeek) {
		this.DayOfWeek = DayOfWeek;
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
