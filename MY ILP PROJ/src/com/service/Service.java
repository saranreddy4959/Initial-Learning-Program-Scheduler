package com.service;

import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Schedule;
import com.dao.MyIlpScheduleDAO;

public class Service {
	
	MyIlpScheduleDAO ilpschedule=new MyIlpScheduleDAO();
	
	public ArrayList<Schedule> getDetails(String date,String batch,String lg) throws ClassNotFoundException, SQLException{
		
		
		return ilpschedule.getDetails(date,batch,lg);
		//return getDetails(date,batch,lg);
	}
	
	
	
	
	
	public ArrayList<Schedule> getCourseDetails(String date, String course) throws ClassNotFoundException, SQLException {
		
	//	MyIlpScheduleDAO ilpschedule=new MyIlpScheduleDAO();
	
		
		return ilpschedule.getCourseDetails(date,course);
	}
	

}
