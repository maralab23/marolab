<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head></head>

	<body>
	    <!-- Page Header -->
	    <!-- Set your background image for this header on the line below. -->
	    <header class="intro-header" style="background-image: url('img/contact-bg.jpg')">
	        <div class="container">
	            <div class="row">
	                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
	                    <div class="page-heading">
	                        <h1>Login</h1>
	                        <hr class="small">
	                        <span class="subheading">가입문의는 관리자에게 메일을 보내주세요.</span>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </header>
	
	    <!-- Main Content -->
	    <div class="container">
	        <div class="row">
	            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
	                <form action="/loginProcess.do" name="loginForm" id="loginForm" method="post" novalidate>
	                    <div class="row control-group">
	                        <div class="form-group col-xs-12 floating-label-form-group controls">
	                            <label>Id</label>
	                            <input type="text" class="form-control" placeholder="Id" id="userId" name="userId" required data-validation-required-message="Please enter your id.">
	                            <p class="help-block text-danger"></p>
	                        </div>
	                    </div>
	                    <div class="row control-group">
	                        <div class="form-group col-xs-12 floating-label-form-group controls">
	                            <label>Password</label>
	                            <input type="password" class="form-control" placeholder="Password" id="userPassword" name="userPassword" required data-validation-required-message="Please enter your password.">
	                            <p class="help-block text-danger"></p>
	                        </div>
	                    </div>
	                    <br>
	                    <div class="row">
	                        <div class="form-group col-xs-12" align="center">
	                            <button type="submit" class="btn btn-default">로그인</button>
	                        </div>
	                    </div>
	                </form>
	            </div>
	        </div>
	    </div>
	
	    <hr>
	</body>
</html>
