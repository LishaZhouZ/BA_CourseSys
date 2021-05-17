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
            <a href="${ctx}/Teacher1.action"><i class="icon icon-file"></i> <span>我的课程</span></a>
            <ul>
                <li><a href="${ctx}/Teacher1.action">课程一览</a></li>
                <li><a href="${ctx}/CourCreate1.action">新建课程</a></li>
            </ul>
        </li>
        <li><a href="${ctx}/MyTAcc1.action"><i class="icon icon-user"></i> <span>我的账户</span></a></li>
        <li><a href="${ctx}/Teacher1.action"><i class="icon icon-home"></i> <span>回到首页</span></a></li>
        <li><a href="${ctx}/index"><i class="icon icon-share-alt"></i> <span>登出</span></a></li>
    </ul>

</div>


<div id="content">
    <div id="content-header">
        <h1>学生选课系统</h1>
    </div>
    <div id="breadcrumb">
    <a class='current'>首页</a>
    <a class='current'>修改课程</a>
    </div>
    <div class="container-fluid" style="padding: 5px 0px 20px 300px;">
        <div class="row-fluid">
            <div class="span8" style="text-align:center;">
                <div class="widget-box">
                    <div class="widget-title">
								<span class="icon">
									<i class="icon-align-justify"></i>
								</span>
                        <h5>修改课程信息</h5>
                    </div>
                    <div class="widget-content nopadding">
                        <form action="changeComfirm.action" method="post" class="form-horizontal">
                        <div class="control-group">
                            <label class="control-label">课程ID</label>
                            <div class="controls">
                                <span name="cno">${changedC.cno}</span>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">课程名</label>
                            <div class="controls">
                                <span name="cname">${changedC.cname}</span>
                            </div>
                        </div>
                        <div class="control-group">
                            <label class="control-label">学分数</label>
                            <div class="controls">
                                <select id="credit" name="credit">
                                    <option value="1">0.5</option>
                                    <option value="2">1.0</option>
                                    <option value="3">1.5</option>
                                    <option value="4">2.0</option>
                                    <option value="5">2.5</option>
                                    <option value="6">3.0</option>
                                    <option value="7">3.5</option>
                                    <option value="8">4.0</option>
                                    <option value="9">4.5</option>
                                    <option value="10">5.0</option>
                                    <option value="11">5.5</option>
                                </select>
                            </div>
                        </div>
						<div class="control-group">
                                  <label class="control-label">课程开始日期</label>
                                    <div class="controls">
                                    <input type="text" name="cstart" data-date="2012-02-12" data-date-format="yyyy-mm-dd" value="2012-02-12" class="datepicker" />
                                    </div>
                         </div>
                        <div class="form-actions">
                            <button type="submit" class="btn btn-primary">修改</button>
                        </div>
                        </form>
                    </div>
                </div>
            </div>
        </div>
    </div>

</div>
<script type="text/javascript">
function checkModel() { 
    var a=${changedC.cno}
    document.getElementById("credit").value=(2*a); 
}
</script>
<script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.ui.custom.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap-colorpicker.js"/>"></script>
<script src="<c:url value="/resources/js/bootstrap-datepicker.js"/>"></script>
<script src="<c:url value="/resources/js/jquery.uniform.js"/>"></script>
<script src="<c:url value="/resources/js/select2.min.js"/>"></script>
<script src="<c:url value="/resources/js/unicorn.js"/>"></script>
<script src="<c:url value="/resources/js/unicorn.form_common.js"/>"></script>
</body>
</html>