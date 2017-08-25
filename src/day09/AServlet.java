package day09;

import java.io.IOException;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class AServlet implements Servlet {

	@Override
	public void destroy() {
System.out.println("destroy()..");
	}

	@Override
	public ServletConfig getServletConfig() {
	System.out.println("ServletConfig()...");
		return null;
	}

	@Override
	public String getServletInfo() {
	System.out.println("getServletInfo().....");
		return null;
	}

	@Override
	public void init(ServletConfig ServletConfig) throws ServletException {
		System.out.println("init()....");

	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
	
System.out.println("service().....");
	}

}
