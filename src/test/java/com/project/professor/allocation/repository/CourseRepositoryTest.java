package com.project.professor.allocation.repository;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase.Replace;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.annotation.Rollback;
import org.springframework.test.context.TestPropertySource;

import com.project.professor.allocation.model.Course;

@DataJpaTest
@AutoConfigureTestDatabase(replace = Replace.NONE)
@Rollback(false)
@TestPropertySource(locations = "classpath:application.properties")
public class CourseRepositoryTest {

	@Autowired
	private CourseRepository courseRepository;

	@Test
	public void findAll() {
		List<Course> courses = courseRepository.findAll();
		courses.stream().forEach(System.out::println);
	}

	@Test
	public void findById() {
		Long id = 1L;

		Course course = courseRepository.findById(id).orElse(null);
		System.out.println(course);
	}

	@Test
	public void findByNameContainingIgnoreCase() {
		String name = "Course";
		List<Course> courses = courseRepository.findByNameContainingIgnoreCase(name);
		courses.stream().forEach(System.out::println);
	}

	@Test
	public void save_create() {
		Course course = new Course();
		course.setId(null);
		course.setName("historia");
		course = courseRepository.save(course);
		System.out.println(course);
	}

	@Test
	public void save_update() {
		Course course = new Course();
		course.setId(1L);
		course.setName("geografia");
		course = courseRepository.save(course);
		System.out.println(course);
	}

	@Test
	public void deleteById() {
		Long id = 1L;
		courseRepository.deleteById(id);
	}

	@Test
	public void deleteAll() {
		courseRepository.deleteAllInBatch();
	}
}