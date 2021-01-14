import java.io.IOException;
import java.sql.*;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
@WebServlet("/DeleteExtra")
public class DeleteExtra extends HttpServlet {
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
    	   String delextra =request.getParameter("deleteextraname");
      	
        	Class.forName("com.mysql.jdbc.Driver");  
			Connection conn=DriverManager.getConnection(  
					"jdbc:mysql://localhost:3306/ser","root","root");    			
			
	     
			 String j1="DELETE from extradetails WHERE Extra_Curricular=?";
				PreparedStatement st=conn.prepareStatement(j1);
				st.setString(1,delextra);
				
				st.executeUpdate();
			
			conn.close();  
			
			response.sendRedirect("delete_extra.jsp");
			//System.out.println("Successfully Updated!");
		}catch(Exception e){ 
			
			System.out.println(e);}  


		
		
	}
        
        
        
      

 }
