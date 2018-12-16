package kr.ac.hansung.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter

public class SubjectList {

	private int year; 	
	private int semester;
	private String courseName; 
    private int courseGrade; 
	private String ClassifyGrade; 

	public SubjectList() {
	}

	public SubjectList(int year, int semester, int courseGrade) {
	}

	public SubjectList(int year, int semester, String courseName, int courseGrade, String classify) {
		
		this.year = year;
		this.semester = semester;
		this.courseName = courseName;
		this.courseGrade = courseGrade;
		this.ClassifyGrade = classify;	
	}

	public void setClassify(String string) {
		
	}
	
}