package com.mindstorm.hellogradle;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class HelloGradleServlet extends HttpServlet {
	
	
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		System.out.println("3");
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
