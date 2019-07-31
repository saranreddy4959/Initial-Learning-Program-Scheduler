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
 * Servlet implementation class Controller1
 */
@WebServlet("/Controller1")
public class Controller1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Controller1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		
		String action=request.getParameter("controller1");
		//System.out.println(action);
		
		//if(action.equals("searchlg")){
			
			Service service=new Service();
			String day=request.getParameter("date");
			String month=request.getParameter("month");
			String year=request.getParameter("year");
			
			String date=(String)(day+month+year);
			
			String course=request.getParameter("course");
			
			//String lg=request.getParameter("lg");
			
			System.out.println(date);
			System.out.println(course);
			
    ArrayList<Schedule> list=null;
			
			try {
				list=service.getCourseDetails(date,course);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			System.out.println(list);
			request.setAttribute("list",list );
			
			RequestDispatcher rd=request.getRequestDispatcher("list.jsp");
			rd.forward(request, response);
		
		
	}

}
