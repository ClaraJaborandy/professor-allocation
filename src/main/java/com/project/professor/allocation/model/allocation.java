package com.project.professor.allocation.model;
import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.Table;


@Entity
@Table(name = "Allocation")
public class Allocation {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "day", nullable = false)
	private java.time.DayOfWeek DayOfWeek;
	
	@Column(name = "end", nullable = false, columnDefinition = "TIME")
	private Time end;
	
	@Column(name = "start", nullable = false, columnDefinition = "TIME")
	private Time start;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	private Professor professor;
	
	@ManyToOne(fetch = FetchType.EAGER, optional = false)
	private Course course;

	public Allocation() {
		super();
	}

	public Allocation(Integer id, java.time.DayOfWeek DayOfWeek, Time end, Time start) {
		super();
		this.id = id;
		this.DayOfWeek = DayOfWeek;
		this.end = end;
		this.start = start;
	}

	public long getId() {
		return id;
	}

	public void setId(long l) {
		this.id = l;
	}

	public java.time.DayOfWeek getDayOfWeek() {
		return DayOfWeek;
	}

	public void setDay(java.time.DayOfWeek sunday) {
		this.DayOfWeek = sunday;
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

	public void setProfessor(Professor professor2) {
		// TODO Auto-generated method stub
		
	}

	public void setCourse(Course course2) {
		// TODO Auto-generated method stub
		
	}

	public void setDay1(java.time.DayOfWeek monday) {
		// TODO Auto-generated method stub
		
	}

	public void setId(Object object) {
		// TODO Auto-generated method stub
		
	}

}
