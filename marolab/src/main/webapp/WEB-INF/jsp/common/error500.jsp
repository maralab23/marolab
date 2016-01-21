<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.opensymphony.com/sitemesh/page" prefix="page"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<page:applyDecorator name="default">
<!DOCTYPE html>
<html lang="en">
	<head></head>

	<body>
	    <!-- Page Header -->
	    <!-- Set your background image for this header on the line below. -->
	    <header class="intro-header" style="background-image: url('${pageContext.request.contextPath}img/error-bg.jpg')">
	        <div class="container">
	            <div class="row">
	                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
	                    <div class="page-heading">
	                        <h1>오류 페이지</h1>
	                        <hr class="small">
	                        <span class="subheading">서비스 과정에서 오류가 발생했습니다.</span>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </header>
	
	    <!-- Main Content -->
	    <div class="container">
	        <div class="row">
	            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
					<div class="row">
					    <div class="form-group col-xs-12" align="center">
					        <button type="button" class="btn btn-default" onclick="javascript:history.back();">뒤로가기</button>
					    </div>
					</div>
	            </div>
	        </div>
	    </div>
	
	    <hr>
	</body>
</html>
</page:applyDecorator>