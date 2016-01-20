<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head></head>

	<body>
	    <!-- Page Header -->
	    <!-- Set your background image for this header on the line below. -->
	    <header class="intro-header" style="background-image: url('${pageContext.request.contextPath}/img/post-bg.jpg')">
	        <div class="container">
	            <div class="row">
	                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
	                    <div class="post-heading">
	                        <h1>Notice</h1>
	                        <h2 class="subheading">서비스 업데이트 및 관리자 활동 이력</h2>
	                        <span class="meta">문의사항은 관리자에게 메일을 보내주세요.</span>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </header>
	
	    <!-- Main Content -->
	    <div class="container">
	        <div class="row">
	            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
	            	<c:forEach items="${noticeList }" var="notice">
	                <div class="post-preview">
	                    <a href="${pageContext.request.contextPath}/noticeForm.do?seq=${notice.seq }">
	                        <h2 class="post-title">
	                            ${notice.title }
	                        </h2>
	                        <h3 class="post-subtitle">
	                            ${notice.content }
	                        </h3>
	                    </a>
	                    <p class="post-meta">Noticed by <b>${notice.author }</b> on ${notice.createTime }</p>
	                </div>
	                <hr>
	                </c:forEach>
	                <!-- Posting -->
	                <ul class="pager">
	                    <li class="next">
	                        <a href="${pageContext.request.contextPath}/noticeForm.do">작성하기</a>
	                    </li>
	                </ul>
	                 
	            </div>
	        </div>
	    </div>
	    <hr>
	</body>
</html>