package test;
import java.io.*;
import java.sql.*;
import java.util.Vector;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.*;

public class Register extends HttpServlet {
	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		String next=null;
		int i=0;
		Vector<String> errors = new Vector<String>();
		
		String firstname=request.getParameter("userFirstName");
		String lastname=request.getParameter("userLastName");
		String email=request.getParameter("userEmail");
		String phone=request.getParameter("userPhone");
		String location=request.getParameter("userLocation");
		
			if (! isValidFirstName(firstname))
            errors.add("Please specify a Valid First name");
            if (! isValidLastName(lastname))
            errors.add("Please specify a valid last name");
            if (! isValidEmail(email))
            errors.add("Please specify a valid mail address");
            if (! isValidPhoneNo(phone))
            errors.add("Please specify a valid Phone Number");
            if (! isValidLocation(location))
            errors.add("Please specify a valid Location");
       
            if (errors.size() != 0) {
            	
            	String[] errorArray = (String[])errors.toArray(new String[0]);
            	request.setAttribute("errors", errorArray);
            	next="/error.html";         
		
       }//if
            else
            {	
            	try{
        			Class.forName("com.mysql.jdbc.Driver");
        			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/test1","root","");
        			PreparedStatement ps=con.prepareStatement("insert into user1 values(?,?,?,?,?)");
        		
           
        		ps.setString(1,firstname);
        		ps.setString(2,lastname);
        		ps.setString(3,email);
        		ps.setString(4,phone);
        		ps.setString(5,location);
        		i=ps.executeUpdate();
        		if(i>0)
        		{
        			next="/welcome.html";
        		}
        			ps.close();
        		}//try
              //  catch (Exception e1) {System.out.println(e1);}
                catch (SQLException e2) {e2.printStackTrace();} 
                catch (ClassNotFoundException e3) {e3.printStackTrace();} 
              
         
            }
            RequestDispatcher rd;
            rd = getServletContext().getRequestDispatcher(next);
            rd.include(request, response);   
            	
	}
		private boolean isValidFirstName(String fn)
		{
			return (fn.length() > 3 && fn.indexOf("-") == -1);
        }
        private boolean isValidLastName(String ln) {
         
         return (ln.length() > 0 && ln.indexOf("-") == -1);
                   }
         private boolean isValidEmail(String e) {
             
             return (e.indexOf("@") > 0);
                       } 
             private boolean isValidPhoneNo(String con) {
             return (con.length() ==10);
                }
             private boolean isValidLocation(String c) {
                 return (c.length()>0);
               }
}
