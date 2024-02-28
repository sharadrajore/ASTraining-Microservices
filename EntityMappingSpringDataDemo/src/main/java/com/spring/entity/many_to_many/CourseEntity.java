package com.spring.entity.many_to_many;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

@Entity
@Table(name="COURSE")
public class CourseEntity {

	private long courseId;
	private String courseName;
	private Set<StudentEntity> students = new HashSet<StudentEntity>();

	public CourseEntity() {}
	
	public CourseEntity(String courseName) {
		this.courseName = courseName;
	}

	public CourseEntity(String courseName, Set<StudentEntity> students) {
		this.courseName = courseName;
		this.students = students;
	}

	@Id
	@GeneratedValue
	@Column(name="COURSE_ID")
	public long getCourseId() {
		return this.courseId;
	}

	public void setCourseId(long courseId) {
		this.courseId = courseId;
	}

	@Column(name="COURSE_NAME", nullable=false)
	public String getCourseName() {
		return this.courseName;
	}

	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}
	
	@ManyToMany(cascade = CascadeType.ALL)
	@JoinTable(name = "STUDENT_COURSE", 
				joinColumns = { @JoinColumn(name = "COURSE_ID") }, 
				inverseJoinColumns = { @JoinColumn(name = "STUDENT_ID") })
	public Set<StudentEntity> getStudents() {
		return students;
	}

	public void setStudents(Set<StudentEntity> students) {
		this.students = students;
	}

}