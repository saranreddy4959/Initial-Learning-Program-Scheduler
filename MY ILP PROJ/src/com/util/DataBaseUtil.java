package com.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DataBaseUtil {
	
	final static String url="jdbc:oracle:thin:@inchnilpdb03.india.tcs.com:1521:javadb03";
	final static String user_name="E1187816";
	final static String password="E1187816";
	static Connection con=null;
	
	public static Connection getConnection() throws SQLException, ClassNotFoundException {
		Class.forName("oracle.jdbc.OracleDriver");
		con=DriverManager.getConnection(url, user_name, password);
		return con;
	}
	
	public static  void closeConnection(Connection con) {
		try{
			if(con!=null)
				con.close();
		}
		catch (Exception e) {
				System.out.println(e);
		}
	}
	
	
	public static  void closePreparedStatement(PreparedStatement ps) {
		try{
			if(ps!=null)
				ps.close();
		}
		catch (Exception e) {
				System.out.println(e);
		}
	}
	
	public static  void closeResultSet(ResultSet ps) {
		try{
			if(ps!=null)
				ps.close();
		}
		catch (Exception e) {
				System.out.println(e);
		}
	}
}



