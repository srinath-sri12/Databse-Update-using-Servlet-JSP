import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/UpdateProject")
public class UpdateProject extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
   

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	
       
	     /*   if(upproject.length()>0)
	        	  System.out.println(upproject);
	        else
	        	System.out.println("NO");
	        if(name.length()>0)
	        	  System.out.println(name);
	        else
	        	System.out.println("NO");
	      
	        if(roll.length()>0)
	        	  System.out.println(roll);
	        else
	        	System.out.println("NO");
	        
	        if(dept.equals("select"))
	        	  System.out.println("No");
	        else
	        	System.out.println(dept);*/
       try{  
    	   String upproject =request.getParameter("updateprojectname");
      	 String name =request.getParameter("name");
      	 String roll = request.getParameter("roll");
  	        String dept = request.getParameter("dept");
  	        String projectname=request.getParameter("project");
  	        String eventname= request.getParameter("eventname");
  	        String presentedplace= request.getParameter("place");
  	        String eventdate= request.getParameter("date");
  	        String prize= request.getParameter("prize");
  	        
        	Class.forName("com.mysql.jdbc.Driver");  
			Connection conn=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/ser","root","root");    			
			
			 if(name.length()>0)
			 {
				 String j1="UPDATE projectdetails SET Student_Name=? WHERE Project_Name=?";
			PreparedStatement st=conn.prepareStatement(j1);
			st.setString(1,name);
			st.setString(2,upproject);
			st.executeUpdate();
			 }
	 		
			 if(roll.length()>0)
			 {String j1="UPDATE projectdetails SET Roll_Number=? WHERE Project_Name=?";
			PreparedStatement st=conn.prepareStatement(j1);
			st.setString(1,roll);
			st.setString(2,upproject);
			st.executeUpdate();
			 }
			 if(!dept.equals("select"))
			 {
				 String j1="UPDATE projectdetails SET Department=? WHERE Project_Name=?";
					PreparedStatement st=conn.prepareStatement(j1);
					st.setString(1,dept);
					st.setString(2,upproject);
					st.executeUpdate();
			 }
			 if(projectname.length()>0)
			 {
				 String j1="UPDATE projectdetails SET Project_Name=? WHERE Project_Name=?";
					PreparedStatement st=conn.prepareStatement(j1);
					st.setString(1,projectname);
					st.setString(2,upproject);
					st.executeUpdate();
			 }
			 if(eventname.length()>0)
			 {
				 String j1="UPDATE projectdetails SET Event_Name=? WHERE Project_Name=?";
					PreparedStatement st=conn.prepareStatement(j1);
					st.setString(1,eventname);
					st.setString(2,upproject);
					st.executeUpdate();
			 }
			 if(presentedplace.length()>0)
			 {
				 String j1="UPDATE projectdetails SET Presented_Place=? WHERE Project_Name=?";
					PreparedStatement st=conn.prepareStatement(j1);
					st.setString(1,presentedplace);
					st.setString(2,upproject);
					st.executeUpdate();
			 }
			 if(eventdate.length()>0)
			 {
				 String j1="UPDATE projectdetails SET Event_Date=? WHERE Project_Name=?";
					PreparedStatement st=conn.prepareStatement(j1);
					st.setString(1,eventdate);
					st.setString(2,upproject);
					st.executeUpdate();
			 }
			 if(!prize.equals("select"))
			 {
				 String j1="UPDATE projectdetails SET Prize_Won=? WHERE Project_Name=?";
					PreparedStatement st=conn.prepareStatement(j1);
					st.setString(1,prize);
					st.setString(2,upproject);
					st.executeUpdate();
			 }
	      
	     
			
			
			conn.close();  
			
			response.sendRedirect("update_project.jsp");
			//System.out.println("Successfully Updated!");
		}catch(Exception e){ 
			
			System.out.println(e);}  


		
		
	}
        
        
        
      

 }
