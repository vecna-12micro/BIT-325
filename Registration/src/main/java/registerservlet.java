

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

/**
 * Servlet implementation class registerservlet
 */
@WebServlet("/registerservlet")
public class registerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.sendRedirect("register.jsp");
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
				response.setContentType("text/html");
				
				PrintWriter out=response.getWriter();
	
				try {
	        		
	        		Class.forName("com.mysql.cj.jdbc.Driver");
	        		Connection conn=DriverManager.getConnection("jdbc:mysql://localhost:3306/ntsa", "root", "");
	        		
	        		String VehicleName=request.getParameter("VM");
	        		String NumberPlate=request.getParameter("NP");
	        		String Owner=request.getParameter("ON");
	        		int Mileage=Integer.parseInt(request.getParameter("Mil"));
	        		String Chasis=request.getParameter("cc");
	        		
	        		String sql="insert into ntsadata(VM,NP,ON,Mil,cc) VALUES(?,?,?,?,?)";
	        		PreparedStatement pst=conn.prepareStatement(sql);
	        		

	        		pst.setString(1, VehicleName);
	        		pst.setString(2, NumberPlate);
	        		pst.setString(3, Owner);
	        		pst.setInt(4, Mileage);
	        		pst.setString(5, Chasis);
	        		
	        		int row=pst.executeUpdate();
	        		if (row>0)
	        		{
	        			out.print("<h3>Your Vehicle is Registered Successfully</h3>");
	        			
	        		}
	        		else {
	        			out.print("<h3>Failed</h3>");
	        			
	        		}
	        		
	        		conn.close();
	        		
	        	}
	        	catch (Exception e) {
	        		out.print("<h1> Try Again" +e.getMessage() +"</h1>");
	        		
	        	}
	        	}

	        }
		
