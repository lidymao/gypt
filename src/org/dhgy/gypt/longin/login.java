package org.dhgy.gypt.longin;


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class longin extends HttpServlet{
	public longin() {
		// TODO Auto-generated constructor stub
		super();
	}
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		this.doPost(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp)
			throws ServletException, IOException {
		String userName=req.getParameter("userName");
		String userPassword=req.getParameter("userPassword");
		resp.setContentType("text/html;charset=GBK");
		PrintWriter out=resp.getWriter();
		//out.print("Name"+userName+"<br>"+"Password"+userPassword);
		//out.print(new String("".getBytes("iso-8859-1"),"utf-8"));
		out.print("登陆成功");
		System.out.println(new String(userName.getBytes("iso-8859-1"),"utf-8")+"    "+userPassword);
	
	}
}
