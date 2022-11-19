package com.example.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class JDBCUtil {
	public static Connection getConnection(){  
	    Connection con=null;  
	    try{  
	        Class.forName("com.mysql.jdbc.Driver");  
	        con= DriverManager.getConnection("jdbc:mysql://walab.handong.edu:3306/p3_21900411","p3_21900411","ul2ucie1uL");
	    }catch(Exception e){
	    	System.out.println(e);
	    }  
	    return con;  
	}  

	// unit test
//	public static void main(String ars[]) {
//		Connection conn = getConnection();
//		if(conn != null)
//			System.out.println("DB 연결됨!");
//		else
//			System.out.println("DB 연결중 오류 !");
//	}
}