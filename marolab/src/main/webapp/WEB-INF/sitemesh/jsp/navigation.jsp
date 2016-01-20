<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/decorator" prefix="decorator" %>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page" %>

<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions" %>

<!-- MaroLab Common Javascript Lib.  -->
<script src="${pageContext.request.contextPath}/js/marolab.js"></script>
<!-- jQuery -->
<script src="${pageContext.request.contextPath}/js/jquery.js"></script>
<!-- Bootstrap Core JavaScript -->
<script src="${pageContext.request.contextPath}/js/bootstrap.min.js"></script>
<!-- Custom Theme JavaScript -->
<script src="${pageContext.request.contextPath}/js/clean-blog.min.js"></script>

<!DOCTYPE html>
<html lang="en">
	<head></head>
	<body>
	    <!-- Navigation -->
	    <nav class="navbar navbar-default navbar-custom navbar-fixed-top">
	        <div class="container-fluid">
	            <!-- Brand and toggle get grouped for better mobile display -->
	            <div class="navbar-header page-scroll">
	                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
	                    <span class="sr-only">Toggle navigation</span>
	                    <span class="icon-bar"></span>
	                    <span class="icon-bar"></span>
	                    <span class="icon-bar"></span>
	                </button>
	                <a class="navbar-brand" href="${pageContext.request.contextPath}/home.do">MaroLab</a>
	            </div>
	
	            <!-- Collect the nav links, forms, and other content for toggling -->
	            <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
	                <ul class="nav navbar-nav navbar-right">
	                    <li>
	                        <a href="${pageContext.request.contextPath}/home.do">Home</a>
	                    </li>
	                    <li>
	                        <a href="${pageContext.request.contextPath}/about.do">About Me</a>
	                    </li>
	                    <li>
	                        <a href="${pageContext.request.contextPath}/notice.do">Notice</a>
	                    </li>
	                    <c:choose>
	                    	<c:when test="${empty sessionScope.SPRING_SECURITY_CONTEXT.authentication.principal.userId }">
								<li>
			                        <a href="${pageContext.request.contextPath}/login.do">Login</a>
			                    </li>	
	                    	</c:when>
	                    	<c:otherwise>
								<li>
			                        <a href="${pageContext.request.contextPath}/logout.do">Logout</a>
			                    </li>	                    	
	                    	</c:otherwise>
	                    </c:choose>
	                    
	                </ul>
	            </div>
	            <!-- /.navbar-collapse -->
	        </div>
	        <!-- /.container -->
	    </nav>	
	</body>
</html>