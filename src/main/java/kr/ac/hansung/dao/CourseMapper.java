package kr.ac.hansung.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.springframework.jdbc.core.RowMapper;

import kr.ac.hansung.model.Course;
import kr.ac.hansung.model.SubjectList;

public class CourseMapper implements RowMapper<Course> {
	
	public Course mapRow(ResultSet rs, int rowNum) throws SQLException {

		Course course = new Course();
		course.setYear(rs.getInt("Year"));
		course.setSemester(rs.getInt("Semester"));
		course.setTotalGrade(rs.getInt("totalGrade"));
		
		return course;
	}

}