import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/UpdatePaper")
public class UpdatePaper extends HttpServlet {
    private static final long serialVersionUID = 1L;
 
   

    protected void doPost(HttpServletRequest request, HttpServletResponse response)
    throws ServletException, IOException {
    	
       
	     /*   if(uppaper.length()>0)
	        	  System.out.println(uppaper);
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
    	   String uppaper =request.getParameter("updatepaername");
      	 String name =request.getParameter("name");
      	 String roll = request.getParameter("roll");
  	        String dept = request.getParameter("dept");
  	        String papername=request.getParameter("paper");
  	        String eventname= request.getParameter("eventname");
  	        String presentedplace= request.getParameter("place");
  	        String eventdate= request.getParameter("date");
  	        String prize= request.getParameter("prize");
  	        
        	Class.forName("com.mysql.jdbc.Driver");  
			Connection conn=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/ser","root","root");    			
			
			 if(name.length()>0)
			 {
				 String j1="UPDATE paperdetails SET Student_Name=? WHERE Paper_Name=?";
			PreparedStatement st=conn.prepareStatement(j1);
			st.setString(1,name);
			st.setString(2,uppaper);
			st.executeUpdate();
			 }
	 		
			 if(roll.length()>0)
			 {String j1="UPDATE paperdetails SET Roll_Number=? WHERE Paper_Name=?";
			PreparedStatement st=conn.prepareStatement(j1);
			st.setString(1,roll);
			st.setString(2,uppaper);
			st.executeUpdate();
			 }
			 if(!dept.equals("select"))
			 {
				 String j1="UPDATE paperdetails SET Department=? WHERE Paper_Name=?";
					PreparedStatement st=conn.prepareStatement(j1);
					st.setString(1,dept);
					st.setString(2,uppaper);
					st.executeUpdate();
			 }
			 if(papername.length()>0)
			 {
				 String j1="UPDATE paperdetails SET Paper_Name=? WHERE Paper_Name=?";
					PreparedStatement st=conn.prepareStatement(j1);
					st.setString(1,papername);
					st.setString(2,uppaper);
					st.executeUpdate();
			 }
			 if(eventname.length()>0)
			 {
				 String j1="UPDATE paperdetails SET Event_Name=? WHERE Paper_Name=?";
					PreparedStatement st=conn.prepareStatement(j1);
					st.setString(1,eventname);
					st.setString(2,uppaper);
					st.executeUpdate();
			 }
			 if(presentedplace.length()>0)
			 {
				 String j1="UPDATE paperdetails SET Presented_Place=? WHERE Paper_Name=?";
					PreparedStatement st=conn.prepareStatement(j1);
					st.setString(1,presentedplace);
					st.setString(2,uppaper);
					st.executeUpdate();
			 }
			 if(eventdate.length()>0)
			 {
				 String j1="UPDATE paperdetails SET Event_Date=? WHERE Paper_Name=?";
					PreparedStatement st=conn.prepareStatement(j1);
					st.setString(1,eventdate);
					st.setString(2,uppaper);
					st.executeUpdate();
			 }
			 if(!prize.equals("select"))
			 {
				 String j1="UPDATE paperdetails SET Prize_Won=? WHERE Paper_Name=?";
					PreparedStatement st=conn.prepareStatement(j1);
					st.setString(1,prize);
					st.setString(2,uppaper);
					st.executeUpdate();
			 }
	      
	     
			
			
			conn.close();  
			
			response.sendRedirect("update_paper.jsp");
			//System.out.println("Successfully Updated!");
		}catch(Exception e){ 
			
			System.out.println(e);}  


		
		
	}
        
        
        
      

 }
