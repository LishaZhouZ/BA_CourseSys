<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

<!DOCTYPE html>
<html>
  <head>
        <title>学生选课系统</title>
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-responsive.min.css"/>" />
        <link rel="stylesheet" href="<c:url value="/resources/css/unicorn.login.css"/>" />
        <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
  </head>
  
  <body>
        <div id="logo">
            <img src="<c:url value="/resources/img/logo.png"/>" alt="" />
        </div>
        <div id="loginbox">
           <form id="loginform" class="form-vertical" action="login" method="post">
				<p>请输入账号和密码</p>
   				 <div class="control-group">
                    <div class="controls">
                        <div class="input-prepend">
                            <span class="add-on"><i class="icon-user"></i></span><input name="Name" type="text" placeholder="User ID" />
                   		 </div>
                	</div>
                	</div>
                	<div class="control-group">
                    <div class="controls">
                        <div class="input-prepend">
                            <span class="add-on"><i class="icon-lock"></i></span><input type="password" name="Password" placeholder="Password" />
                        </div>
                    </div>
                	</div>
                	<div class="form-actions">
                    <span class="pull-left"><a href="#" class="flip-link" id="to-recover">忘记密码?</a></span>
                    <span class="pull-right"><input type="submit" class="btn btn-inverse" value="登陆" /></span>
                	</div>
            </form>
            <form id="recoverform" action="#" class="form-vertical" >
				<p>请输入邮箱并按照所收到邮件指示操作</p>
				<div class="control-group">
                    <div class="controls">
                        <div class="input-prepend">
                            <span class="add-on"><i class="icon-envelope"></i></span><input type="text" placeholder="E-mail address" />
                        </div>
                    </div>
                </div>
                <div class="form-actions">
                    <span class="pull-left"><a href="#" class="flip-link" id="to-login">&lt; 返回登陆页面</a></span>
                    <span class="pull-right"><input type="submit" class="btn btn-inverse" value="发送" /></span>
                </div>
            </form>
        </div>
        
        <script src="<c:url value="/resources/js/jquery.min.js"/>"> </script>
        <script src="<c:url value="/resources/js/unicorn.login.js"/>"> </script>
        <script src="<c:url value="/resources/js/unicorn.interface.js"/>"></script>
  </body>
</html>
