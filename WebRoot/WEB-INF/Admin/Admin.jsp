<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>管理员</title>
    <meta charset="UTF-8" />
    <meta name="viewport" content="width=device-width, initial-scale=1.0" />
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-responsive.min.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/css/colorpicker.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/css/datepicker.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/css/uniform.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/css/select2.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/css/unicorn.main.css"/>" />
    <link rel="stylesheet" href="<c:url value="/resources/css/unicorn.grey.css"/>" class="skin-color" />
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>

</head>
<body>
<div id="header">
    <h1>Unicorn Admin</h1>
</div>

<div id="user-nav" class="navbar navbar-inverse">
    <ul class="nav btn-group">
        <li class="btn btn-inverse"><a title="" href="<c:url value="/pages/login.jsp"/>"> <i class="icon icon-share-alt"></i> <span class="text">登出</span></a></li>
    </ul>
</div>

<div id="sidebar">

    <a href="#" class="visible-phone"><i class="icon icon-th-list"></i> Common Elements</a>
    <ul>
        <li class="active submenu open">
            <a href="${ctx}/Alogin.action"><i class="icon icon-file"></i> <span>账户管理功能</span></a>
            <ul>
                <li class="active"><a href="${ctx}/Alogin.action">账户一览</a></li>
                <li><a href="${ctx}/AccCreate.action">创建账户</a></li>
            </ul>
        </li>
        <li><a href="${ctx}/MyAAcc.action"><i class="icon icon-user"></i> <span>我的账户</span></a></li>
        <li><a href="${ctx}/Alogin.action"><i class="icon icon-home"></i> <span>回到首页</span></a></li>
        <li><a href="${ctx}/index"><i class="icon icon-share-alt"></i> <span>登出</span></a></li>
    </ul>

</div>



<div id="content">
    <div id="content-header">
        <h1>学生选课系统</h1>
    </div>
    <div id="breadcrumb">
  	<a href="#" class="current"><i class="icon-home"></i>首页</a>
    </div>
    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span12">
        </div>	
        		
					<div class="widget-box">
							<div class="widget-title">
							
								<h5>账户信息</h5>
							</div>
							<div class="widget-content nopadding">
								<table class="table table-bordered data-table">
									<thead>
									<tr>
									 <th>ID</th>
                   					 <th>用户名</th>
                    				 <th>密码</th>
                   					 <th>权限</th>
                   					 <th>操作</th>
									</tr>
									</thead>
									<tbody >
									<c:forEach items="${listuser}" var="users">  
                <tr class="gradeX" >
                    <td style="text-align:center;">${users.uid}</td>
                    <td style="text-align:center;">${users.name}</td>
                    <td style="text-align:center;">${users.password}</td>
                    <td style="text-align:center;">${users.privilege}</td>
                    <td style="text-align:center;">
                      <a href="${users.uid}/changePriv.action">修改权限</a>
                     &nbsp;&nbsp;&nbsp; <a href="${users.uid}/resetPass.action">重置密码</a>
                     &nbsp;&nbsp;&nbsp; <a href="${users.uid}/deleteAcc.action">删除用户</a>
                    </td>
                </tr>
                 </c:forEach>
									</tbody>
									</table>  
							</div>
						</div>
					</div>
				</div>
				
    </div>
<script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.ui.custom.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.uniform.js"/>"></script>
<script src="<c:url value="/resources/js/select2.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.dataTables.min.js"/>"></script>
<script src="<c:url value="/resources/js/unicorn.js"/>"></script>
<script src="<c:url value="/resources/js/unicorn.tables.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap-colorpicker.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap-datepicker.js"/>"></script>
</body>
</html>
