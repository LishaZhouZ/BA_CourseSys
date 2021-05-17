<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>教师用户</title>
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
        <li class="btn btn-inverse"><a title="" href="../pages/login.html"><i class="icon icon-share-alt"></i> <span class="text">登出</span></a></li>
    </ul>
</div>

<div id="sidebar">

    <a href="#" class="visible-phone"><i class="icon icon-th-list"></i> Common Elements</a>
<ul>
        <li class="active submenu open">
            <a href="Teacher1.action"><i class="icon icon-file"></i> <span>我的课程</span></a>
            <ul>
                <li><a href="Teacher1.action">课程一览</a></li>
                <li><a href="CourCreate1.action">新建课程</a></li>
            </ul>
        </li>
        <li><a href="MyTAcc1.action"><i class="icon icon-user"></i> <span>我的账户</span></a></li>
        <li><a href="Teacher1.action"><i class="icon icon-home"></i> <span>回到首页</span></a></li>
        <li><a href="${ctx}/index"><i class="icon icon-share-alt"></i> <span>登出</span></a></li>
    </ul>

</div>

<div id="content">
    <div id="content-header">
        <h1>学生选课系统</h1>
    </div>

    <div id="breadcrumb">
    <a href="#" class="current"><i class="icon-home"></i>首页</a>
    <a class="current">我的账户</a>
    </div>

    <div class="container-fluid"style="padding: 5px 0px 20px 300px;">
        <div class="row-fluid">
            <div class="span8" style="text-align:center;">
                <div class="widget-box">
                    <div class="widget-title">
									<span class="icon">
										<i class="icon-align-justify"></i>
									</span>
                        <h5>账户信息</h5>
                    </div>
                    <div class="widget-content nopadding">
                        <form class="form-horizontal" method="post" action="TchangeP.action" name="password_validate" id="password_validate" novalidate="novalidate" >
                        <div class="control-group">
                            <label class="control-label">ID</label>
                            <div class="controls">
                            <span>${teacher.id}</span>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label">用户名</label>
                            <div class="controls">
                                <span>${teacher.name}</span>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">权限</label>
                            <div class="controls">
                                <span>教师</span>
                            </div>
                        </div>

                        <div class="control-group">
                            <label class="control-label">新密码</label>
                            <div class="controls">
                                <input type="password" name="pwd" id="pwd" />
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">确认密码</label>
                            <div class="controls">
                                <input type="password" name="pwd2" id="pwd2" />
                            </div>
                        </div>
                        <div class="form-actions">
                            <input type="submit" value="确认修改" class="btn btn-primary" />
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>
</div>

<script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.ui.custom.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap-colorpicker.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap-datepicker.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.uniform.js"/>"></script>
<script src="<c:url value="/resources/js/select2.min.js"/>"></script>
<script src="<c:url value="/resources/js/unicorn.js"/>"></script>
<script src="<c:url value="/resources/js/unicorn.form_common.js"/>"></script>
<script src="<c:url value="/resources/js/unicorn.form_validation.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.validate.js"/>"></script>

</body>
</html>
