package kr.ac.hansung.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import kr.ac.hansung.model.Course;
import kr.ac.hansung.model.SubjectList;
import kr.ac.hansung.service.CourseService;

@Controller()
@RequestMapping("/Course")
public class CourseController {

	private CourseService courseService;

	@Autowired
	public void setOffersService(CourseService courseService) {
		this.courseService = courseService;
	}

	@RequestMapping(value = "/SearchSemester")
	public String SearchSemester(Model model) {
		List<Course> semester = courseService.getSearchSemester();
		model.addAttribute("semester", semester);

		return "SearchSemester";
	}


	@RequestMapping(value = "/SearchSubject", method = RequestMethod.GET)
	public String SearchSubject(Model model) {
		List<String> subject = courseService.getSearchSubject();
		int[] classifyGrade = courseService.getSearchTotalGrade(subject);

		int totalGrade = 0;
		for (int i = 0; i < classifyGrade.length; i++)
			totalGrade += classifyGrade[i];

		model.addAttribute("classifyGrade", classifyGrade);
		model.addAttribute("subject", subject);
		model.addAttribute("totalGrade", totalGrade);

		return "SearchSubject";
	}


	@RequestMapping(value = "/AppliedCourse", method = RequestMethod.GET)
	public String AppliedCourse(Model model) {
		List<Course> course = courseService.getAppliedCourse();
		model.addAttribute("course", course);
		return "AppliedCourse";
	}

}
