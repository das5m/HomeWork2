package kr.ac.hansung.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import kr.ac.hansung.model.Course;
import kr.ac.hansung.service.CourseService;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@Controller()
@RequestMapping("/Apply")
public class  ApplyController  {

	private CourseService courseService;

	@Autowired
	public void setCourseService(CourseService courseService) {
		this.courseService = courseService;
	}

	@RequestMapping(value = "/RequestCourse", method = RequestMethod.GET)
	public String RequestCourse (Model model) {
		List<Course> nextSemesterCourse = courseService.getRequestCourses();
		model.addAttribute("nextSemesterCourse", nextSemesterCourse);
		return "getRequestableCoursesForm";
	}



}
