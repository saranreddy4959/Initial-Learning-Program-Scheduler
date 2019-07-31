package com.bean;

public class BatchSchedule {
	private String batch;
	private String lg;
	private int noOfDays;
	public BatchSchedule(String batch, String lg, int noOfDays) {
		super();
		this.batch = batch;
		this.lg = lg;
		this.noOfDays = noOfDays;
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
	public int getNoOfDays() {
		return noOfDays;
	}
	public void setNoOfDays(int noOfDays) {
		this.noOfDays = noOfDays;
	}
	

}
