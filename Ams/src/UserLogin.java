

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserLogin
 */
public class UserLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public UserLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("welcome!!");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().println("welcome!!");
		String s=request.getParameter("user");
		String p=request.getParameter("pass");
		
		if(s.contentEquals("java") && p.equals("java"))
		{
			//response.getWriter().println("welcome!!"+s);
			response.sendRedirect("http://localhost:8989/Ams/success.html");
			//response.getWriter().println("login successful");
		}
		else
		{
			//response.getWriter().println("login unsucessful");
			response.sendRedirect("http://localhost:8989/Ams/fail.html");
			
		}
	}

}
