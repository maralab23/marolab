<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head></head>

	<body>
	    <!-- Page Header -->
	    <!-- Set your background image for this header on the line below. -->
	    <header class="intro-header" style="background-image: url('${pageContext.request.contextPath}/img/about-bg.jpg')">
	        <div class="container">
	            <div class="row">
	                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
	                    <div class="page-heading">
	                        <h1>About Me</h1>
	                        <hr class="small">
	                        <span class="subheading">This is what I do.</span>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </header>
	
	    <!-- Main Content -->
	    <div class="container">
	        <div class="row">
	            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
	            	<h2 class="section-heading">인생 키워드</h2>
	            	<p>
	            		Responsibility, Sincerity, Professional, Valuation
            		</p>
	            	<h2 class="section-heading">경력사항</h2>
	            	<span class="caption text-muted">
                		2011.02, 경원대학교 컴퓨터미디어학과 졸업
                	</span>	            	
	            	<span class="caption text-muted">
                		2012.05-2014.10, (주)서울문고 인터넷개발팀
                	</span>
	            	<img class="img-responsive" src="${pageContext.request.contextPath}/img/aboutBandi.png" alt="">
	            	<span class="caption text-muted">
                		2014.10-2015.12, (주)영원아웃도어 IT팀
                	</span>
                	<img class="img-responsive" src="${pageContext.request.contextPath}/img/aboutYoungone.png" alt="">
                	<h2 class="section-heading">기술사항</h2>
	                <p>
						Language : Java, Jsp, Ajax, jQuery, Javascript, Android, Html, CSS, C#, ASP.Net, Node.js<br>
						Framework : Spring, Spring Security, iBatis, MyBatis<br>
						WAS : Apache, Tomcat, Weblogic<br>
						OS : Linux, Unix, Windows Server<br>
						Database : Oracle, MS-SQL, MySql, MongoDB<br>
						Platform : Miplatform<br>
						Development Tool : Eclipse, Editplus, Toad, Visual Studio 2015, Sql Server Studio<br>
						Software Configuration Management : CVS, SVN, Git<br>
						Continuous Integration : Jenkins
					</p>
	            </div>
	        </div>
	    </div>
	
	    <hr>
	</body>
</html>
