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
            <a href="Admin.html"><i class="icon icon-file"></i> <span>账户管理功能</span></a>
            <ul>
                <li><a href="Teacher1.action">课程一览</a></li>
                <li ><a href="CourCreate1.action">新建课程</a></li>
                <li class="active"><a href="CourDel1.action">删除课程</a></li>
                <li ><a href="CourChange1.action">修改课程</a></li>
            </ul>
        </li>
        <li><a href="MyAcc.html"><i class="icon icon-user"></i> <span>我的账户</span></a></li>
        <li><a href="Teacher.html"><i class="icon icon-home"></i> <span>回到首页</span></a></li>
        <li><a href="../pages/login.html"><i class="icon icon-share-alt"></i> <span>登出</span></a></li>
    </ul>

</div>


<div id="content">
    <div id="content-header">
        <h1>学生选课系统</h1>
    </div>
    <div id="breadcrumb">
    </div>

    <div class="widget-box">
        <div class="widget-title">
            <span class="icon">
                <input type="checkbox" id="title-checkbox" name="title-checkbox" />
            </span>
            <h5>课程删除</h5>
        </div>
        <form class="widget-content nopadding">
            <form action="#" method="get" class="form-horizontal" >
            <table class="table table-bordered table-striped with-check">
                <thead>
                <tr>
                    <th><i class="icon-resize-vertical"></i></th>
                    <th>ID</th>
                    <th>用户名</th>
                    <th>密码</th>
                    <th>权限</th>
                </tr>
                </thead>
                <tbody>
                <tr>
                    <td><input type="checkbox" /></td>
                    <td>Row 1</td>
                    <td>Row 2</td>
                    <td>Row 3</td>
                    <td>Row 4</td>
                </tr>
                <tr>
                    <td><input type="checkbox" /></td>
                    <td>aaa</td>
                    <td>bbb</td>
                    <td>ccc</td>
                    <td>ccc</td>
                </tr>
                <tr>
                    <td><input type="checkbox" /></td>
                    <td>Row</td>
                    <td>Row 2</td>
                    <td>Row 3</td>
                    <td>Row 4</td>
                </tr>
                </tbody>
            </table>
            <div class="form-actions">
                <button type="submit" class="btn btn-primary">删除选中选项</button>
            </div>
        </form>
        </form>
      
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
<script src="<c:url value="/resources/js/breadTrail.js"/>"></script>
</body>
</html>
