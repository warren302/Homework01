package pl.coderslab.collection;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/Servlet12")
public class Servlet12 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		response.setContentType("text/html");
		response.setCharacterEncoding("UTF-8");

//		createFile();
		String path = getServletContext().getRealPath("/oop.txt");
		
		
		List<String> list = loadFromFile(path.toString());
		if (list != null) {
		for (String s : list) {
				response.getWriter().append(s).append("<br/>");
			}
		} else {
			response.getWriter().append("lista nie została załadowana").append("<br/>");
		}
		
		
	}

	
	
	public void createFile() {

		try {
			FileWriter fileW = new FileWriter("costam.txt");
			fileW.close();
			System.out.println("stworzylem plik");
		} catch (IOException e) {
			System.out.println("problemy z plikiem");
			e.printStackTrace();
		}
		
		
	}
	
	
	public List<String> loadFromFile(String fileName) {
		Path path = Paths.get(fileName);
		File file = new File(path.toString());
		try {
			Scanner scanner = new Scanner(file);
			List<String> list = new ArrayList<>();
			while (scanner.hasNextLine()) {
				list.add(scanner.nextLine());
			}
			return list;
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.out.println("Bledy I/O");
		}
		return null;
	}
}
