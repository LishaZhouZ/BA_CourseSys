<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" trimDirectiveWhitespaces="true"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="ctx" value="${pageContext.request.contextPath}" />

     <!DOCTYPE html>
<html lang="en">
	<head>
		<title>错误</title>
		<meta charset="UTF-8" />
        <meta name="viewport" content="width=device-width, initial-scale=1.0" />
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap.min.css"/>" />
		<link rel="stylesheet" href="<c:url value="/resources/css/bootstrap-responsive.min.css"/>" />
		<link rel="stylesheet" href="<c:url value="/resources/css/jquery.gritter.css"/>" />
		<link rel="stylesheet" href="<c:url value="/resources/css/unicorn.main.cs"/>s" />
		<link rel="stylesheet" href="<c:url value="/resources/css/unicorn.grey.css"/>" class="skin-color" />	
	<meta http-equiv="Content-Type" content="text/html; charset=utf-8" /></head>
	
	<body>
<br><br><br>
 <div class="span6" style="text-align:center; padding: 20px 0 80px 350px;">
					<div class="widget-box">
					
						<div class="widget-title">
								<span class="icon">
									<i class="icon-remove"></i>
								</span>
								<h5>错误</h5>
							</div>
							<div class="widget-content" >
							<div id="errorinfo" name="errorinfo">
								<strong>输入信息有误</strong>
							</div>
							<br>
							<button name="return" href="#" onclick="javascript:history.back(-1);" class="btn" >返回</button>
						</div>
					</div>
				</div>
							
            <script src="<c:url value="/resources/js/jquery.min.js"/>"></script>
            <script src="<c:url value="/resources/js/jquery.ui.custom.js"/>"></script>
            <script src="<c:url value="/resources/js/bootstrap.min.js"/>"></script>
            <script src="<c:url value="/resources/js/jquery.gritter.min.js"/>"></script>
            <script src="<c:url value="/resources/js/jquery.peity.min.js"/>"></script>
            <script src="<c:url value="/resources/js/unicorn.js"/>"></script>
           
	</body>
</html>
