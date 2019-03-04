<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%> 
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>登录界面</title>
</head>

<body  background="a.jpg" style=" background-repeat:no-repeat ;background-size:100% 100%;background-attachment: fixed;" >
    <center>
    <br><br><br><br><br><br>
    <h1 style="color:blue">注册</h1>
    <br>
    <form name="loginForm" action="login/login" method="post">   
          <table Border="0" >
                    <tr >
                        <td>账号</td>
                        <td><input type="text" name="username"></td>
                    </tr>
                    <tr>
                        <td>密码</td>
                        <td><input type="password" name="password">
                        </td>
                    </tr>
                    <tr>
                        <td>身份证号</td>
                        <td><input type="text" name="IDcard">
                        </td>
                    </tr>
                    <tr>
                        <td>性别</td>
                        <td><input type=text name="sex">
                        </td>
                    </tr>
                    <tr>
                        <td>出生日期</td>
                        <td><input type="date" name="birthday">
                        </td>
                    </tr>
               </table>
               <p class="cstyle">你有账号？<a href="login.jsp">立即登陆</a></p>
               <br>
                <input type="submit" value="注册" style="color:#000" >
    </form>
    </center>

</body>
</html>