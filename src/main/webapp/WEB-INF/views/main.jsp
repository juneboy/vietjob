<%@ page session="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="sec" uri="http://www.springframework.org/security/tags" %>
<%@ page language="java" contentType="text/html; UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=BenchNine|Satisfy|Shadows+Into+Light" rel="stylesheet">
<link type="text/css" href="../resources/lib/bootstrap-3.3.7-dist/css/bootstrap.min.css" rel="stylesheet">
<link type="text/css" href="../resources/css/admin.css" rel="stylesheet" >

<title>Admin</title>
</head>
<body>
   <nav class="navbar navbar-default navbar-fixed-top">
	<div class="container">
		<div class="navbar-header">
			<button type="button" class="navbar-toggle collapsed"
				data-toggle="collapse" aria-haspopup="true" aria-expanded="false"
				data-target="#menu">
				<span class="icon-bar"></span> <span class="icon-bar"></span> <span
					class="icon-bar"></span>
			</button>
			<a class="navbar-brand" href="">Vietjob Berlin</a>
		</div>
		<!-- navbar header -->
		<div class="collapse navbar-collapse" id="menu">
			<ul class="nav navbar-nav navbar-right">
				<li class="active"><a href="#home"><spring:message code="menu.home"></spring:message></a></li>
				<li><a href="#howtoapply"><spring:message code="menu.howtoapply"></spring:message></a></li>
				<li><a href="#service"><spring:message code="menu.service"></spring:message></a></li>
				<li><a href="#partner"><spring:message code="menu.partner"></spring:message></a></li>
				<li><a href="#staff"><spring:message code="menu.ourstaff"></spring:message></a></li>
				<li><a href="#contact"><spring:message code="menu.contact"></spring:message></a></li>
				<li><a href="#" data-toggle="modal" data-target="#login"><spring:message code="menu.login"></spring:message></a></li>
				<li class="dropdown">
				    <a href="#" class="dropdown-toggle" data-toggle="dropdown" role="button" aria-haspopup="true" aria-expanded="false">
				         Language <span class="caret"></span>
				    </a>
					<ul class="dropdown-menu" id="language">
						<li><a href="?lang=fi"><img src="../resources/img/flags/Finland.png"
								alt="vietjob finnish" /></a>
						</li>
						<li><a href="?lang=de"><img src="../resources/img/flags/Germany.png"
								alt="vietjob germany" /></a>
						</li>
						<li><a href="?lang=vn"><img
								src="../resources/img/flags/Viet-Nam.png" alt="vietjob vietnamese" /></a>
						</li>
						<li><a href="?lang=en"><img
								src="../resources/img/flags/United-Kingdom.png"
								alt="vietjob english" /></a>
						</li>
					</ul>
				</li><!-- language -->
                 <li><a href="<c:url value="logout" />">Logout</a></li>
                 <h3><sec:authentication property="principal.username" /></h3>
			</ul>
		</div><!-- collapse navbar-collapse -->
	</div><!-- container --> 
	</nav><!-- navbar navbar-default navbar-fixed-top -->

<div class="main">
    <div class="container-fluid">
        <div class="search-setting row">
                  <div class="search col-md-3">
                         <form class="form-inline">
                              <div class="form-group">
                                   <label></label>
                                   <input type="text" class="form-control" placeholder="Enter your keyword" />
                              </div><!-- text form-group -->
                              <div class="form-group">
                                   <label></label>
                                   <input type="submit" class="btn btn-success form-control" value="search" />
                              </div><!-- submit form-group -->
                        </form>
                   </div><!--search col-md-3 -->
             <div class="setting col-md-9">
                  
             </div><!--setting col-md-9 -->
        </div><!-- search-setting row -->
        <div class="sidebar-controlside row">
            <div class="col-md-2">
                 <!-- day la cho de sidebar -->
            </div><!-- col-md-2 -->
            <div class="controlside col-md-10">
                 <!-- day la cho de control side -->
            </div><!-- controlside col-md-10 -->
        </div><!-- sidebar row -->
    </div><!--container-fluid -->
</div><!-- main -->
<footer>
<nav class="navbar navbar-default">
	<div class="container">
		<div class="row">
			<div class="col-md-4">
			</div>
			<div class="col-md-4 text-center">
			</div>
			<div class="col-md-4">
			    <h5 class="text-right">Copyright &copy Dinh Duc Thinh</h5>
			</div>
		</div><!-- row -->
	</div><!-- container -->
</nav><!-- navbar navbar-default -->
</footer><!-- footer -->
<script type="text/javascript" src="../resources/lib/jQuery/jquery-3.1.1.js"></script>
<script type="text/javascript" src="../resources/lib/jQuery/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="../resources/lib/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

</body>
</html>