package fr.codeheures.test;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class login
 */
@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		//Get old parameters
		String login = request.getParameter("txtLogin");
		if (login == null) login = "";
		
		//set session attributes
		HttpSession session = request.getSession();
		session.setAttribute("login", login);
		
		//Redirect to jsp view
		request.getRequestDispatcher("Login.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//Get parameters
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		
		//Get session
		HttpSession session = request.getSession();
		
		//Test login
		if (login.trim().equals("bond") && password.trim().equals("007")) {
			session.setAttribute("login", login);
			session.setAttribute("isConnected", true);
			request.getRequestDispatcher("Connected.jsp").forward(request, response);
		} else {
			session.setAttribute("isConnected", false);
			doGet(request, response);
		}
	}

}
