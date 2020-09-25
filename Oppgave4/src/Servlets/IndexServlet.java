package Servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	@Override
	public void init() throws ServletException {
		System.out.println("init() kjøres ...");
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response) 
			throws ServletException, IOException {
		System.out.println("doGet() kjøres ...");


	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String fornavn = request.getParameter("fornavn");// Fornavnet som brukeren tastet inn.
		String etternavn = request.getParameter("etternavn");// Etternavnet som brukeren tastet inn.
		String timestamp = request.getParameter("timestamp");// Dato og klokken akkurat NÅ. Fint formatert.


		response.setContentType("text/html; charset=ISO-8859-1");
		PrintWriter out = response.getWriter();
		out.println("<!DOCTYPE html>");
		out.println("<html>");
		out.println("<head>");
		out.println("<meta charset=\"ISO-8859-1\">");
		out.println("<title>Kvittering</title>");
		out.println("</head>");
		out.println("<body>");
		out.println("<p>Hei, " + fornavn + " " + etternavn +"</p>");
		out.println("<p>Din registrering er mottatt " + timestamp + "</p>");
		out.println("</body>");
		out.println("</html>");

		doGet(request,response);
	}

}


