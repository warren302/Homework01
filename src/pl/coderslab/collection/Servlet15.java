package pl.coderslab.collection;

import java.io.IOException;
import java.util.Arrays;
import java.util.Enumeration;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet15")
public class Servlet15 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		
		Map<String, String> map = new HashMap<String, String>();

	    Enumeration headerNames = request.getHeaderNames();
	    while (headerNames.hasMoreElements()) {
	        String key = (String) headerNames.nextElement();
	        String value = request.getHeader(key);
	        map.put(key, value);
	    }		
		
		for (String s : map.keySet()) {
			response.getWriter().append(s).append(" : ");
			response.getWriter().append(map.get(s)).append("<br/>");
		}
		
		
	}

	


    
}
	

