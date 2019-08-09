package Toby;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Simple
 */
@WebServlet("/Simple")
public class Simple extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Simple() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		{
	        // get the value for the query parameter
	        String firstName = request.getParameter("first");
	        String lastName = request.getParameter("last");
	        String favLanguage = request.getParameter("language");
	        String homeTown = request.getParameter("home");
	        if (firstName == null) {
	        	firstName= "Unknown";
	        }
	        if (lastName == null) {
	        	lastName= "Unknown";
	        }
	        if (favLanguage == null) {
	        	favLanguage= "Unknown";
	        }
	        if (homeTown == null) {
	        	homeTown= "Unknown";
	        }
	        response.setContentType("text/html");
	        PrintWriter out = response.getWriter();
	        out.write("<h1>Welcome " + firstName + lastName + "</h1>");
	        out.write("<h1>Your favorite langauge is : " + favLanguage + "</h1>");
	        out.write("<h1>Your hometown is : " + favLanguage + "</h1>");
	        
	    }
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
