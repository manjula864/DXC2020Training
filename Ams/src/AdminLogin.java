

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class AdminLogin
 */
public class AdminLogin extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AdminLogin() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	//	response.getWriter().append("Served at: ").append(request.getContextPath());
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
			//RequestDispatcher rd=request.getRequestDispatcher("/success.html");
		    //rd.forward(request, response);
		    response.sendRedirect("http://localhost:8989/BankApp/amspage.html");
		    
		}
		else
		{
			response.getWriter().println("<font color=red>Enter valid credentials");
			RequestDispatcher rd=request.getRequestDispatcher("/userlogin.html");
			rd.include(request, response);
			
		}
	}

	}


