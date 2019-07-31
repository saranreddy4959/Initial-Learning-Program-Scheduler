package com.bean;

import java.util.Date;

public class Schedule {
	private String batch;
	private String lg;
	private String sch_date;
	private String slot;
	private String course_id;
	private String course_name;
	private String faculty;
	public Schedule(String batch, String lg, String sch_date, String slot,
			String course_id, String course_name, String faculty) {
		super();
		this.batch = batch;
		this.lg = lg;
		this.sch_date = sch_date;
		this.slot = slot;
		this.course_id = course_id;
		this.course_name = course_name;
		this.faculty = faculty;
	}
	public String getBatch() {
		return batch;
	}
	public void setBatch(String batch) {
		this.batch = batch;
	}
	public String getLg() {
		return lg;
	}
	public void setLg(String lg) {
		this.lg = lg;
	}
	public String getSch_date() {
		return sch_date;
	}
	public void setSch_date(String sch_date) {
		this.sch_date = sch_date;
	}
	public String getSlot() {
		return slot;
	}
	public void setSlot(String slot) {
		this.slot = slot;
	}
	public String getCourse_id() {
		return course_id;
	}
	public void setCourse_id(String course_id) {
		this.course_id = course_id;
	}
	public String getCourse_name() {
		return course_name;
	}
	public void setCourse_name(String course_name) {
		this.course_name = course_name;
	}
	public String getFaculty() {
		return faculty;
	}
	public void setFaculty(String faculty) {
		this.faculty = faculty;
	}
	
	
public	Schedule(){
		
	}
	

}
