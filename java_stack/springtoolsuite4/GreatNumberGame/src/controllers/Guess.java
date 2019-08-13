package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class Guess
 */
@WebServlet("/Guess")
public class Guess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Guess() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int guess = Integer.parseInt(request.getParameter("guess"));
		HttpSession session = request.getSession();
		session.setAttribute("guessOne", guess);
		int userGuess = (Integer) session.getAttribute("guessOne");
		int answer = (Integer) session.getAttribute("answer");

		if (userGuess > answer) {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/high.jsp");
	        view.forward(request, response);
		}
		if (userGuess < answer) {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/low.jsp");
	        view.forward(request, response);
		}
		else {
			RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/correct.jsp");
	        view.forward(request, response);
		}
		
		
		
		
	}

}
