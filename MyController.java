package com.Springrest.springrest.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.Springrest.springrest.entities.Course;
import com.Springrest.springrest.services.Courseservice;

//first person sabse pahile request aayegi
@RestController
public class MyController {
	
	
@Autowired
	private Courseservice courseService;
	
	@GetMapping("/courses")
	//get the courses
	public List<Course> getCourses()
	{
		return this.courseService.getCourses();
	}
	
	//get course 
	@GetMapping("/courses/{courseId}")
	public Course getCourse(@PathVariable String courseId)
	{
		return this.courseService.getCourse(Long.parseLong(courseId));
	}
	
	
	//add course
	@PostMapping("/courses")
	public Course addCourse(@RequestBody Course course)
	{
		return this.addCourse(course);
	}
}
