package com.controller;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.bean.Schedule;
import com.service.Service;

/**
 * Servlet implementation class ConnectionController
 */
@WebServlet("/ConnectionController")
public class ConnectionController extends HttpServlet {
	private static final long serialVersionUID = 1L;

    /**
     * Default constructor. 
     */
    public ConnectionController() {
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	//protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		//String action=request.getParameter("action");
		//System.out.println(action);
		
		//String action1=request.getParameter("searchlg");
	//	System.out.println(action1);
		
		//String action2=request.getParameter("searchcourse");
	//	System.out.println(action2);
		
	//if(action1.equals("searchlg")){
			
			Service service=new Service();
			String day=request.getParameter("date");
			String month=request.getParameter("month");
			String year=request.getParameter("year");
			
			String date=(String)(day+"/"+month+"/"+year);
			//String date1=date.substring(0, 10);
			
			String batch=request.getParameter("batch");
			
			String lg=request.getParameter("lg");
			
			String course=request.getParameter("course"); 
			
			System.out.println(date);
			System.out.println(batch);
			System.out.println(lg);
			
			ArrayList<Schedule> list=new ArrayList<Schedule>() ;
			
			try {
				list=service.getDetails(date,batch,lg);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			System.out.println(list);
			for(Schedule s:list){
				
			}
			request.setAttribute("list",list );
			RequestDispatcher rd=request.getRequestDispatcher("Schedule.jsp");
			rd.forward(request, response);
			
		}
		
		
}

//}
