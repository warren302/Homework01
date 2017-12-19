package pl.coderslab.collection;

import java.io.IOException;
import java.util.Arrays;
import java.util.Random;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet14")
public class Servlet14 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Random random = new Random();
		int[] tab1 = new int[10];
		int[] tab2 = new int[10];
		for (int i = 0; i <tab1.length; i++) {
			tab1[i] = random.nextInt(10);
			tab2[i] = tab1[i];
		}
		Arrays.sort(tab2);
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");
		
		response.getWriter().append("wartosci w kolejnosci: ").append(Arrays.toString(tab1)).append("<br/>");
		response.getWriter().append("wartosci posortowane: ").append(Arrays.toString(tab2)).append("<br/>");
	}

}
