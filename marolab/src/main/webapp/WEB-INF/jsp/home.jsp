<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html lang="en">
	<head></head>

	<body>
	    <!-- Page Header -->
	    <!-- Set your background image for this header on the line below. -->
	    <header class="intro-header" style="background-image: url('img/home-bg.jpg')">
	        <div class="container">
	            <div class="row">
	                <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
	                    <div class="site-heading">
	                        <h1>Maro's Blog</h1>
	                        <hr class="small">
	                        <span class="subheading">Living in architecture aimed developer</span>
	                    </div>
	                </div>
	            </div>
	        </div>
	    </header>
	
	    <!-- Main Content -->
	    <div class="container">
	        <div class="row">
	            <div class="col-lg-8 col-lg-offset-2 col-md-10 col-md-offset-1">
	            	<c:forEach items="${blogList }" var="blog">
	                <div class="post-preview">
	                    <a href="post.html">
	                        <h2 class="post-title">
	                            ${blog.title }
	                        </h2>
	                        <h3 class="post-subtitle">
	                            ${blog.content }
	                        </h3>
	                    </a>
	                    <p class="post-meta">Posted by <a href="#">${blog.author }</a> on ${blog.updateTime }</p>
	                </div>
	                <hr>
	                </c:forEach>
	                <!-- Pager -->
	                <ul class="pager">
	                    <li class="next">
	                        <a href="#">Older Posts &rarr;</a>
	                    </li>
	                </ul>
	            </div>
	        </div>
	    </div>
	    <hr>
	</body>
</html>
