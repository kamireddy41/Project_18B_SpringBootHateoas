package com.telusko.SpringBootHateoas.rest;

import java.util.ArrayList;
import java.util.List;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.mvc.WebMvcLinkBuilder;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.telusko.SpringBootHateoas.model.Course;

@RestController
@RequestMapping("/api")
public class CourseController
{
	@GetMapping("/getcourse/{id}")
	public ResponseEntity<Course> getCourseDetails(@PathVariable("id")Integer id)
	{
		Course course=new Course(101, "SBM", 9999.9);
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.
				methodOn(CourseController.class).getJavaCourseInfo()).withRel("getjava");
		
		course.add(link);
		
		return new ResponseEntity<Course>(course, HttpStatus.OK);
		
	}
	
	@GetMapping("/getjava")
	public List<Course> getJavaCourseInfo()
	{
		List courseList=new ArrayList<>();
		courseList.add(new Course(102, "Java", 999.9));
		
		return courseList;
		
	}
	
	@GetMapping("/getallcourses")
	public List<Course> getAllCourseInfo()
	{
		List courseList=new ArrayList<>();
		courseList.add(new Course(102, "Java", 999.9));
		courseList.add(new Course(103, "DevOps", 9999.9));
		courseList.add(new Course(104, "SBM", 999.9));
		
		return courseList;
		
	}
	
	@GetMapping("/getmulti/{id}")
	public ResponseEntity<Course> getCourseInfo(@PathVariable("id")Integer id)
	{
		Course course=new Course(108, "MultiThreading", 999.9);
		Link link = WebMvcLinkBuilder.linkTo(WebMvcLinkBuilder.
				methodOn(CourseController.class).getAllCourseInfo()).withRel("getallcourses");
		
		course.add(link);
		
		return new ResponseEntity<Course>(course, HttpStatus.OK);
		
	}

}
