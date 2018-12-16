package kr.ac.hansung.dao;

import java.util.List;

import javax.activation.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import kr.ac.hansung.model.Course;
import kr.ac.hansung.model.SubjectList;
import lombok.Getter;
import lombok.Setter;
@Getter
@Setter
@Repository
public class CourseDAO {
	private JdbcTemplate jdbcTemplateObject;

	@Autowired
	public void setDataSource(DataSource dataSource) {
		this.jdbcTemplateObject = new JdbcTemplate((javax.sql.DataSource) dataSource);
	}

	public int getSearchSemester(int year, int semester) {
		// TODO Auto-generated method stub
		return 0;
	}

	public List<Course> getSearchSemesterDetail() {
		// TODO Auto-generated method stub
		return null;
	}

	public List<SubjectList> getCourse(int year, int semester) {
		// TODO Auto-generated method stub
		return null;
	}
}
