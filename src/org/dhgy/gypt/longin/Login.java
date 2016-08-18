package org.dhgy.gypt;




import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.dhgy.gypt.entity.UserInfo;

public class Login extends HttpServlet{
	/**
	 * 
	 */
	private static final long serialVersionUID = -6975880157354867515L;
	public Login() {
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
		
		Validate validate=new Validate();
		
		validate.setName(userName);
		
		
		List<UserInfo> list=validate.getUserInfoList();
		
		
		if(list.size()==1&& list!=null &&userName!=null&&userPassword!=null){
		
		for(UserInfo item : list){
			if(item.getUserName().equals(userName) && item.getPassword().equals(userPassword)){
				out.print("登陆成功");
				 req.setAttribute(userName, userPassword);
				 // 使用req对象获取RequestDispatcher对象
				 RequestDispatcher dispatcher = req.getRequestDispatcher("jsp/main.jsp"); 
				// 使用RequestDispatcher对象在服务器端向目的路径跳转
				 dispatcher.forward(req, resp);                                            
				 
				 
			}else{
				//out.print("alert('用户名或密码错误！')");
				resp.sendRedirect("index.jsp");
				
			}
		}
		
		
		
		//
		
		System.out.println(new String(userName.getBytes("iso-8859-1"),"utf-8")+"    "+userPassword);
	
	}else{
		
		out.print("用户名或密码错误！");
		resp.sendRedirect("index.jsp");
	}
	}
}
