package com.hisoka.poipo.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class GetAndPost
 */
@WebServlet("/getposthisoka")
public class GetAndPost extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public GetAndPost() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String pass = request.getParameter("password");
		PrintWriter pw = response.getWriter();
		if (pass.equalsIgnoreCase("abcdef"))
		{
			pw.println("Welcome.......\n");
			String usrName = request.getParameter("userName");
			pw.println(usrName);
		}else
		{
			pw.println("How are you...??? :v");;
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String pass = request.getParameter("password");
		PrintWriter pw = response.getWriter();
		if (pass.equalsIgnoreCase("abcdef"))
		{
			pw.println("Welcome.......\n");
			String usrName = request.getParameter("userName");
			pw.println(usrName);
		}else
		{
			pw.println("How are you...??? :v");;
		}
	}

}
