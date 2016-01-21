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
	                        <h1>Notice Form</h1>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </header>
	
	    <!-- Post Content -->
	    <article>
		    <div class="container">
		        <div class="row">
		            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
		                <form action="${pageContext.request.contextPath}/noticePostProcess.do" name="noticePostForm" id="noticePostForm" method="post" novalidate>
		                	<input type="hidden" id="flag" name="flag" value="">
		                	<c:if test="${not empty notice }">
			                	<input type="hidden" name="seq" value="${notice.seq }">
		                	</c:if>
		                    <div class="row control-group">
		                        <div class="form-group col-xs-12 floating-label-form-group controls">
		                            <label>Title</label>
		                            <c:if test="${not empty notice }">
		                            <p class="help-block text-danger">Title</p>
		                            </c:if>
		                            <input type="text" class="form-control" placeholder="Title" id="title" name="title" required data-validation-required-message="Please enter a title." value="${notice.title }">
		                        </div>
		                    </div>
		                    <div class="row control-group">
		                        <div class="form-group col-xs-12 floating-label-form-group controls">
		                            <label>Content</label>
		                            <c:if test="${not empty notice }">
		                            <p class="help-block text-danger">Content</p>
		                            </c:if>
		                            <textarea rows="5" class="form-control" placeholder="Content" id="content" name="content" required data-validation-required-message="Please enter a content.">${notice.content }</textarea>
		                            <p class="help-block text-danger"></p>
		                        </div>
		                    </div>
		                    <br>
		                    <div class="row">
		                        <div class="form-group col-xs-12" align="center">
	                            	<c:choose>
	                            		<c:when test="${empty notice }">
			                            	<input type="button" id="add" class="btn btn-default" value="등록"/>
	                            		</c:when>
	                            		<c:otherwise>
	                            			<input type="button" id="modify" class="btn btn-default" value="수정"/>
	                            			<input type="button" id="remove" class="btn btn-default" value="삭제"/>
	                            		</c:otherwise>
	                            	</c:choose>
                            		<input type="button" id="list" class="btn btn-default" value="목록"/>
		                        </div>
		                    </div>
		                </form>
		                <script type="text/javascript">
		                	$(document).ready(function(){
		                		$('#noticePostForm input[type=button]').click(function(){
		                			var action = this.id;
		                			
		                			if(action == 'list'){
		                				location.href = '/notice.do';
		                				return false;
		                			}
		                			
		                			if(action != 'remove'){
			                			var title = $('#title').val();
			                			var content = $('#content').val();
			                			
			                			if(!isDefined(title)){
			                				alert('제목을 입력해주세요.');
			                				$('#title').focus();
			                				return false;
			                			}
			                			
			                			if(!isDefined(content)){
			                				alert('내용을 입력해주세요.');
			                				$('#content').focus();
			                				return false;
			                			}
		                			}
		                			
		                			var confirmMsg = '';
		                			if(action == 'add'){
		                				confirmMsg = '이 내용으로 등록하시겠습니까?';
		                			}else if(action == 'modify'){
		                				confirmMsg = '이 내용으로 수정하시겠습니까?';
		                			}else{
		                				confirmMsg = '정말 삭제하시겠습니까?';
		                			}
		                			
		                			if(confirm(confirmMsg)){
		                				$("#flag").val(action);
		                				$('#noticePostForm').submit();
		                			}
		                			
		                			return false;
	                			});
		                	});
		                </script>
		            </div>
		        </div>
		    </div>	  
	    </article>
	
	    <hr>
	</body>
</html>