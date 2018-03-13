package fr.codeheures.test;

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpServletResponseWrapper;

@WebFilter(urlPatterns="/lifecycle")
public class MyFilter implements Filter {

	@Override
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		chain.doFilter(request, new MyFilterResponseWrapper((HttpServletResponse)response));
		
	}

	
}


class MyFilterResponseWrapper extends HttpServletResponseWrapper {

	public MyFilterResponseWrapper(HttpServletResponse response) {
		super(response);
		// TODO Auto-generated constructor stub
	}
	
	@Override
	public void setHeader(String name, String value) {
		if (!name.equalsIgnoreCase("demoheader")) super.setHeader(name, value);
	}
}