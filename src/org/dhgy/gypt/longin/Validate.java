package org.dhgy.gypt;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import org.dhgy.gypt.entity.UserInfo;

public class Validate {
	
	private	String name;

	 public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	// 获取用户信息表
	public List<UserInfo> getUserInfoList(){
		

		
		//查询sql语句
		String sql="select user_id,user_name,user_password from user_info where user_name='"+name+"'";
		//数据库连接工具类
		DBUtil util=new DBUtil();
		//获得链接
		Connection conn=util.openConnection();
				
		try {
			//获得预定义语句
			//Statement 用于执行静态 SQL 语句并返回它所生成结果的对象。
			//在默认情况下，同一时间每个 Statement 对象在只能打开一个 ResultSet 对象
				Statement pstmt=conn.createStatement();
			//ResultSet，数据库结果集的数据表，通常通过执行查询数据库的语句生成。
			//executeQuery()方法会把数据库响应的查询结果存放在ResultSet类对象中供我们使用	
				ResultSet rs=pstmt.executeQuery(sql);
			//判断
			List<UserInfo> list=new ArrayList<UserInfo>();
			while(rs.next()){
				//获得用户信息	
				int  userid=rs.getInt(1);
				String userName=rs.getString(2);
				String password=rs.getString(3);
				
				UserInfo user=new UserInfo();
				user.setUserId(userid);
				user.setUserName(userName);
				user.setPassword(password);
				

				list.add(user);
			
			}
			return list;
			
			
			
			
			
			
			
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}finally {  
	            util.closeConn(conn);  
	        }  
	        return null;  
		
		
		 
	}
	 
	
	
	
}
