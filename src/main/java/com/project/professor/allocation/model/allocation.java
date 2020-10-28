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
	private Integer id;
	
	@Enumerated(EnumType.STRING)
	@Column(name = "day", nullable = false)
	private DayOfWeek DayOfWeek;
	
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

	public Allocation(Integer id, DayOfWeek DayOfWeek, Time end, Time start) {
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

	public void setDay(DayOfWeek DayOfWeek) {
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
