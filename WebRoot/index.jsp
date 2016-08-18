<%@ page language="java" import="java.util.*" pageEncoding="utf-8"%>
<%
String path = request.getContextPath();
String basePath = request.getScheme()+"://"+request.getServerName()+":"+request.getServerPort()+path+"/";
%>

<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN">
<html>
  <head>
    <base href="<%=basePath%>">
    
    <title>登录</title>
	<meta http-equiv="pragma" content="no-cache">
	<meta http-equiv="cache-control" content="no-cache">
	<meta http-equiv="expires" content="0">    
	<meta http-equiv="keywords" content="keyword1,keyword2,keyword3">
	<meta http-equiv="description" content="This is my page">
	<script>

 function check(){ 
 if(frm.userName.value == "")
	{
		alert("请填写用户名！");
		
		
		frm.userName.focus();
		 return false;
	}
	else if(frm.userPassword.value == "")
	{
		alert("请填写密码！");
		
		
		frm.userPassword.focus();
		return false;
	}
 }   
function keyEnter()
{
	if ( event.keyCode == 13 )
	{
		check();
	}
}
	</script>
	
	
  </head>
  
  <body >
  <table align="center" width="350" border="0"  cellpadding="0"
							cellspacing="0">
    	<form  name="frm" style="text-align:center"  method="post"  onsubmit="return check()" action="login">
    			用户名：<input type="text" name="userName"  ><br>
    			密码 ：<input type="password" name="userPassword"><br>
    			<input type="submit"  value="登陆" ><br>
    	</form>
    </table>
  </body>
</html>

