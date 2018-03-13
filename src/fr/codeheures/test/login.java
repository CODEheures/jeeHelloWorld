package fr.codeheures.test;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

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
		String login = request.getParameter("txtLogin");
		
		if (login == null) login = "";
		
		response.setContentType("text/html");
		try (PrintWriter out = response.getWriter()) {
			out.println("<html>");
			out.println("<head>");
			out.println("	<title>Veuillez vous identifier</title>");
			out.println("	<link rel='stylesheet' type='text/css' href='styles.css'>");
			out.println("</head>");
			out.println("<body>");
			out.println("	<h1>Veuillez vous identifier</h1>");
			out.println("	<h2>" + new Date() + "</h2>");
			out.println("	<form method='post' />");
			out.println("		<label for='txtLogin'>Login</label>");
			out.println("		<input type='text' name='txtLogin' id='txtLogin' value='"+ login +"'/><br />");
			out.println("		<label for='txtPassword'>Password</label>");
			out.println("		<input type='password' name='txtPassword'id='txtPassword'/><br /><br />");
			out.println("		<input type='submit' value='Soumettre' />");
			out.println("	</form>");
			out.println("</body>");
			out.println("</html>");
			
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String login = request.getParameter("txtLogin");
		String password = request.getParameter("txtPassword");
		
		if (login.trim().equals("bond") && password.trim().equals("007")) {
			response.setContentType("text/html");
			try (PrintWriter out = response.getWriter()) {
				out.println("Bienvenue M." + login);
			}
		} else {
			doGet(request, response);
		}
	}

}
