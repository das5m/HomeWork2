package kr.ac.hansung.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import kr.ac.hansung.dao.CourseDAO;
import kr.ac.hansung.model.Course;
import kr.ac.hansung.model.SubjectList;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Service
public class CourseService {

	private CourseDAO courseDao;

	@Autowired 
	public void setCourseDao(CourseDAO courseDao) {
		this.courseDao = courseDao;
	}

	
	public List<Course> getSearchSemester() {
		
		List<Course> course = getSearchSemester();

		for (Course sl : course) {
			int totalGrade = courseDao.getSearchSemester(sl.getYear(), sl.getSemester());
			sl.setTotalGrade(totalGrade);
		}

		return course;
	}


	
	public List<SubjectList> getCoursesBySemesterDetail(int year, int semester) {
		List<SubjectList> subjectlist = courseDao.getCourse(year, semester);
		return subjectlist;
	}


	@SuppressWarnings("unused")
	private List<Course> getSemestersLists() {
		List<Course> course = courseDao.getSearchSemesterDetail();
		return course;
	}

	public List<Course> getRequestCourses() {
		// TODO Auto-generated method stub
		return null;
	}


}