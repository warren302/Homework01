package pl.coderslab.collection;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet131")
public class Servlet131 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		for (int i = 0; i <= 7; i++) {
			String link = "<a href='/Homework01/Servlet132?id="+i+"'> Link do produktu "+i+" </a>";
			response.getWriter().append(link).append("<br/>");
		}

		
		
		
	}

}
