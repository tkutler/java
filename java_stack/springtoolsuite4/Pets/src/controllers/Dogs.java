package controllers;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import models.Dog;

/**
 * Servlet implementation class Dog
 */
@WebServlet("/Dog")
public class Dogs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @param weight 
     * @param breed 
     * @param name 
     * @see HttpServlet#HttpServlet()
     */
    public Dogs() {
        super();
        
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("dname");
		String breed = request.getParameter("dbreed");
		int weight = Integer.parseInt(request.getParameter("dweight"));
		Dog dog = new Dog (name,breed,weight);
		request.setAttribute("dog",dog);
        RequestDispatcher view = request.getRequestDispatcher("/WEB-INF/views/Dog.jsp");
        view.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
