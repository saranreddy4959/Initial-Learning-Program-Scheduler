package com.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.bean.Schedule;
import com.util.DataBaseUtil;

public class MyIlpScheduleDAO {
	DataBaseUtil DbUtil=new DataBaseUtil();
	//Schedule s=new Schedule();
	
	public ArrayList<Schedule> getDetails(String date,String batch,String lg) throws ClassNotFoundException, SQLException{
		
		ArrayList<Schedule> listSchedule=new ArrayList<Schedule>();
		
		Connection con=null;
		ResultSet rs=null;
		
		con=DbUtil.getConnection();
		
		PreparedStatement pst=con.prepareStatement("select BATCH, LG,SCH_DATE, SLOT,COURSE_ID, COURSE_NAME,FACULTY from Schedule where SCH_DATE=? and BATCH=? and LG=?");
		
		pst.setString(1,date );
		pst.setString(2,batch );
		pst.setString(3,lg);
		
		rs=pst.executeQuery();
		
		while(rs.next()){
			
		
			
			 String Batch=rs.getString(1);
			 String Lg=rs.getString(2);
			 String sch_date=rs.getString(3);
			 String slot=rs.getString(4);
			 String course_id=rs.getString(5);
			 String course_name=rs.getString(6);
			 String faculty=rs.getString(7);
			 
			 
			// System.out.println(batch+""+Lg);
				Schedule schedule=new Schedule(Batch,Lg,sch_date,slot,course_id,course_name,faculty);
				
				listSchedule.add(schedule);
		//		 System.out.println(Batch+""+Lg);
			
				
			//	System.out.println(schedule.getBatch()+" "+schedule.getCourse_id()+" "+schedule.getCourse_name()+" "+schedule.getFaculty()+" "+schedule.getLg()+" "+schedule.getSch_date());
		
		
		
//	}
		
		
		
		}
		for(Schedule s:listSchedule)
		System.out.println(s.getCourse_name()+"  "+s.getSch_date()+"  "+s.getSlot()+"  "+s.getFaculty());
		return listSchedule;
		
	}
	
	
	public ArrayList<Schedule> getCourseDetails(String date, String course) throws SQLException, ClassNotFoundException {
		
ArrayList<Schedule> listSchedule=new ArrayList<Schedule>();
		
		Connection con=null;
		ResultSet rs=null;
		
		con=DbUtil.getConnection();
		
		PreparedStatement pst=con.prepareStatement("select BATCH, LG,SCH_DATE, SLOT,COURSE_ID, COURSE_NAME,FACULTY from Schedule where SCH_DATE=? and  COURSE_ID=?");
		
		pst.setString(1,date );
		pst.setString(2,course );
		
		
		
		rs=pst.executeQuery();
		
		while(rs.next()){
			

			 String Batch=rs.getString(1);
			 System.out.println(Batch);
			 String Lg=rs.getString(2);
			 System.out.println(Lg);
			 String sch_date=rs.getString(3);
			 String slot=rs.getString(4);
			 String course_id=rs.getString(5);
			 String course_name=rs.getString(6);
			 String faculty=rs.getString(7);
			
			 Schedule schedule=new Schedule(Batch,Lg,sch_date,slot,course_id,course_name,faculty);
			 listSchedule.add(schedule);
		}
		
		System.out.println(listSchedule);
		
		
		
		
		return listSchedule;
	
		
		
	}
	
	
	
	

}
