

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AddDataServlet
 */
public class AddDataServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddDataServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	response.setContentType("text/html");
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			System.out.println("driver loaded");
			//connecting to db
			Connection c=DriverManager.getConnection("jdbc:mysql://localhost:3306/webdemo","root","12345");
			if (c==null)
					{
				System.out.println("connection failed");
					}
			else if (c!=null)
			{
		System.out.println("connection established");
			
		}
			
			String s=request.getParameter("user");
			String n=request.getParameter("name");
			
			
		
			
PreparedStatement ps=c.prepareStatement("insert into web values(?,?)");
			
			ps.setString(1, s);
			
			ps.setString(2, n);
			
	ps.executeUpdate();
			response.getWriter().println("added sucessfully");
	
	
		}catch(Exception e)
		{
			e.printStackTrace();
		}
	
	
	
	
	}

}
