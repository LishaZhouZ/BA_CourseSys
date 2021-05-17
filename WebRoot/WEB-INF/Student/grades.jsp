<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>学生用户</title>
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
            <a href="Teacher.html"><i class="icon icon-file"></i> <span>我的课程</span></a>
            <ul>
                <li><a href="Student.html">课程一览</a></li>
                <li><a href="CourSelect.html">选课功能</a></li>
            </ul>
        </li>
        <li><a href="grades.html"><i class="icon icon-user"></i> <span>成绩查询</span></a></li>
        <li><a href="schedule.html"><i class="icon icon-user"></i> <span>课表生成</span></a></li>
        <li><a href="MyAcc.html"><i class="icon icon-user"></i> <span>我的账户</span></a></li>
        <li><a href="Student.html"><i class="icon icon-home"></i> <span>回到首页</span></a></li>
        <li><a href="../pages/login.html"><i class="icon icon-share-alt"></i> <span>登出</span></a></li>
    </ul>

</div>


<div id="content">
    <div id="content-header">
        <h1>学生选课系统</h1>
    </div>
    <div id="breadcrumb">
    </div>

    <div class="container-fluid">
        <div class="row-fluid">
            <div class="span12">
                <div class="widget-box">
                    <div class="widget-title">

                        <h5>课程成绩</h5>
                    </div>
                    <div class="widget-content nopadding">
                        <table class="table table-bordered data-table">
                            <thead>
                            <tr>
                                <th>课程ID</th>
                                <th>课程名</th>
                                <th>学分</th>
                                <th>成绩</th>
                            </tr>
                            </thead>
                            <tbody>
                            <tr class="gradeX">
                                <td>Trident</td>
                                <td>Trident</td>
                                <td>Win 95+</td>
                                <td class="center">4</td>
                            </tr>
                            <tr class="gradeC">
                                <td>Trident</td>
                                <td>Internet
                                    Explorer 5.0</td>
                                <td>Win 95+</td>
                                <td class="center">5</td>
                            </tr>
                            <tr class="gradeA">
                                <td>Trident</td>
                                <td>Internet
                                    Explorer 5.5</td>
                                <td>Win 95+</td>
                                <td class="center">5.5</td>
                            </tr>
                            <tr class="gradeA">
                                <td>Trident</td>
                                <td>Internet
                                    Explorer 6</td>
                                <td>Win 98+</td>
                                <td class="center">6</td>
                            </tr>

                            </tbody>
                        </table>
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
<script src="<c:url value="/resources/js/jquery.dataTables.min.js"/>"></script>
<script src="<c:url value="/resources/js/unicorn.tables.js"/>"></script>
<script src="<c:url value="/resources/js/breadTrail.js"/>"></script>
</body>
</html>