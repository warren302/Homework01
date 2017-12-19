package pl.coderslab.collection;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet132")
public class Servlet132 extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String products[] = {
			    "Asus Transformr;2999.99",
			    "iPhone 6';3499.18",
			    "Converse Sneakers;125.00",
			    "LG OLED55B6P OLED TV;6493.91",
			    "Samsung HT-J4100;800.99",
			    "Alpine Swiss Dress Belt;99.08",
			    "60 Watt LED;1.50",
			    "Arduino Nano;3.26",
			};
		
		int index = Integer.parseInt(request.getParameter("id"));
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

		
		if (index < products.length) {
			products[index].substring(0, products[index].indexOf(";"));
			response.getWriter().append(products[index].substring(0, products[index].indexOf(";")))
								.append(" - ").append(products[index].substring(products[index].indexOf(";")+1, products[index].length()))
								.append("<br/>");
		} else {
			response.getWriter().append("roduct not found").append("<br/>");
			
		}
	}

}
