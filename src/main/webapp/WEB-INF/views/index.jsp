<%@ page session="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<meta name="viewport" content="width=device-width, initial-scale=1">
<link href="https://fonts.googleapis.com/css?family=BenchNine|Satisfy|Shadows+Into+Light" rel="stylesheet">
<link rel="stylesheet" href="resources/lib/bootstrap-3.3.7-dist/css/bootstrap.min.css">
<link rel="stylesheet" href="resources/css/style.css">


<title>Vietjob</title>
</head>
<body>
<!-- bao gom thanh menu, carousel va text -->
<header id="home">
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
						<li><a href="?lang=fi"><img src="resources/img/flags/Finland.png"
								alt="vietjob finnish" /></a>
						</li>
						<li><a href="?lang=de"><img src="resources/img/flags/Germany.png"
								alt="vietjob germany" /></a>
						</li>
						<li><a href="?lang=vn"><img
								src="resources/img/flags/Viet-Nam.png" alt="vietjob vietnamese" /></a>
						</li>
						<li><a href="?lang=en"><img
								src="resources/img/flags/United-Kingdom.png"
								alt="vietjob english" /></a>
						</li>
					</ul>
				</li><!-- language -->
		    </ul>
		</div><!-- collapse navbar-collapse -->
	</div><!-- container --> 
	</nav><!-- navbar navbar-default navbar-fixed-top -->

	<div class="carousel slide" data-ride="carousel" id="feature">
		<div class="container-fluid">
			<ol class="carousel-indicators">
				<li data-target="#myCarousel" data-slide-to="0" class="active"></li>
				<li data-target="#myCarousel" data-slide-to="1"></li>
				<li data-target="#myCarousel" data-slide-to="2"></li>
			</ol>
			<!-- carousel-indicators -->
			<div class="carousel-inner">
				<div class="item active">
					<img src="resources/img/carousel/acrilycs_workshop.jpg" alt="" />
				</div>
				<div class="item">
					<img src="resources/img/carousel/painting_workshop.jpg" alt="" />
				</div>
				<div class="item">
					<img src="resources/img/carousel/pottery_finished.jpg" alt="" />
				</div>
			</div><!-- carousel inner -->
			<a class="left carousel-control" href="#feature" role="button"
				data-slide="prev"><span class="glyphicon glyphicon-chevron-left"></span></a>
			<a class="right carousel-control" href="#feature" role="button"
				data-slide="next"><span
				class="glyphicon glyphicon-chevron-right"></span></a>
		</div><!-- container fluid -->
	</div><!-- carousel slide -->
	

	<div class="container-fluid" id="jobsearch">
	    <div class="row slideamin">
	       <div class="col-md-2"></div><!-- chua co gi -->
			<form class="form-group">
				<div class="col-md-8">
					<div class="col-sm-4 col-xs-12">
						<label></label> <input type="text" class="form-control"
							placeholder="<spring:message code='jobsearch.placeholder.jobname'></spring:message>" />
					</div>
					<div class="col-sm-4 col-xs-12">
						<label></label> <input type="text" class="form-control"
							placeholder="<spring:message code="jobsearch.placeholder.location"></spring:message>" />
					</div>
					<div class="col-sm-2 col-xs-12">
						<label></label> <input type="submit" class="form-control"
							value="<spring:message code="jobsearch.button.search"></spring:message>" />
					</div>
					<div class="col-sm-2 col-xs-12 text-center">
					    <label></label>
						<span class="badge"><spring:message code="jobsearch.bagde.hienco"></spring:message>123.456 <spring:message code="jobsearch.bagde.job"></spring:message></span>
					</div>
				</div><!-- col-sm-4 -->
			</form>
			<div class="col-md-2"></div><!-- chua co gi -->
		</div><!-- row -->
	</div><!-- container -->
	
</header><!-- header -->
	<!-- bao gom cac page khac nhau: home, services, partners, howtoapply, login, language, contact -->
<div class="main">
        <div class="page" id="howtoapply">
            <div class="container">
                <div class="row slideamin">
                    <div class="col-sm-6">
                        <div class="howtoapply row">
                            <div id="member">
                                <img class="member" src="resources/img/icon/howtoapply/member.svg" />
                                <h3 class="member"><spring:message code="howtoapply.becomemmber"></spring:message></h3>
                            </div>
                        </div><!-- howtoapply row -->
                        <div class="howtoapply row">
                            <div id="resume">
                                <img class="resume" src="resources/img/icon/howtoapply/cv.svg" />
                                <h3 class="resume"><spring:message code="howtoapply.createresume"></spring:message></h3>
                            </div>
                        </div><!-- howtoapply row -->
                    </div>
                    <div class="col-sm-6">
                        <div class="howtoapply row">
                            <div id="search-2">
                                <img class="search-2" src="resources/img/icon/howtoapply/search-2.svg" />
                                <h3 class="search-2"><spring:message code="howtoapply.searchjob"></spring:message></h3>
                            </div>
                        </div><!-- howtoapply row -->
                        <div class="howtoapply row">
                            <div id="checked-2">
                                <img class="checked-2" src="resources/img/icon/howtoapply/checked-2.svg" />
                                <h3 class="checked-2"><spring:message code="howtoapply.applyonlyclick"></spring:message></h3>
                            </div>
                        </div><!-- howtoapply row -->
                    </div>
                </div><!-- row -->
            </div><!-- container-fluid -->
        </div><!-- page howtoapply -->
		<div class="page" id="service">
		    <div class="container">
		        <div class="row slideamin">
		            <div class="col-sm-3">
		                <h3 class="trainning"><spring:message code="service.trainning" /></h3>
		                <img class="trainning" src="resources/img/icon/service/trainning.svg" />
						<article>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna
							aliqua. Ut enim ad minim veniam, quis nostrud exercitation
							ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
							aute irure dolor in reprehenderit in voluptate velit esse cillum
							dolore eu fugiat nulla pariatur. Excepteur sint occaecat
							cupidatat non proident, sunt in culpa qui officia deserunt mollit
							anim id est laborum.</p>
						</article>
					</div><!-- dao tao nghe -->
		            <div class="col-sm-3">
		                <h3 class="scales"><spring:message code="service.lawservice" /></h3>
		                <img class="scales" src="resources/img/icon/service/scales.svg"/>
		                <article>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna
							aliqua. Ut enim ad minim veniam, quis nostrud exercitation
							ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
							aute irure dolor in reprehenderit in voluptate velit esse cillum
							dolore eu fugiat nulla pariatur. Excepteur sint occaecat
							cupidatat non proident, sunt in culpa qui officia deserunt mollit
							anim id est laborum.</p>
						</article>
		            </div><!-- tu van luat -->
		            <div class="col-sm-3">
		                <h3 class="tax"><spring:message code="service.taxservice" /></h3>
		                <img class="tax" src="resources/img/icon/service/tax.svg" />
		                <article>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna
							aliqua. Ut enim ad minim veniam, quis nostrud exercitation
							ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
							aute irure dolor in reprehenderit in voluptate velit esse cillum
							dolore eu fugiat nulla pariatur. Excepteur sint occaecat
							cupidatat non proident, sunt in culpa qui officia deserunt mollit
							anim id est laborum.</p>
						</article>
		            </div><!-- quyet toan thue -->
		            <div class="col-sm-3">
		                <h3 class="success"><spring:message code="service.jobnetwork" /></h3>
		                <img class="success" src="resources/img/icon/service/success.svg" />
		                <article>
						<p>Lorem ipsum dolor sit amet, consectetur adipisicing elit,
							sed do eiusmod tempor incididunt ut labore et dolore magna
							aliqua. Ut enim ad minim veniam, quis nostrud exercitation
							ullamco laboris nisi ut aliquip ex ea commodo consequat. Duis
							aute irure dolor in reprehenderit in voluptate velit esse cillum
							dolore eu fugiat nulla pariatur. Excepteur sint occaecat
							cupidatat non proident, sunt in culpa qui officia deserunt mollit
							anim id est laborum.</p>
						</article>
		            </div><!-- gioi thieu viec lam -->
		        </div><!-- row -->
		    </div><!-- container-->
		</div><!-- page service -->
		<div class="page" id="partner">
		    <div class="container">
		        <div class="row slideamin">
		             <div class="col-sm-4"></div>
		             <div class="col-sm-4"></div>
		             <div class="col-sm-4"></div>
		        </div>
		    </div>
		</div><!-- page partner -->
		<div class="page" id="staff">
		     <div>
		         <div class="row">
		             <div class="staff col-sm-4 text-center">
		                <img src="resources/img/icon/staff/businessman.svg">
		                <article>
		                     <h4>Dinh Tuan Hung</h4>
		                     <h4><spring:message code="staff.ceo"></spring:message></h4>
		                </article>
		             </div>
		             <div class="staff col-sm-4 text-center">
		                <img src="resources/img/icon/staff/businesswoman.svg">
		                <article>
		                     <h4>Dinh Duc Thinh</h4>
		                     <h4><spring:message code="staff.staff"></spring:message></h4>
		                </article>
		             </div>
		             <div class="staff col-sm-4 text-center">
		                <img src="resources/img/icon/staff/businessman.svg">
		                <article>
		                     <h4>Dinh Duc Thinh</h4>
		                     <h4><spring:message code="staff.staff"></spring:message></h4>
		                </article>
		             </div>
		         </div><!-- row -->
		         <div class="slogan row">
		             <div class="col-sm-12">
		                  <h3 class="text-center"><spring:message code="staff.slogan"></spring:message></h3>
		             </div>
		         </div>
		     </div><!-- container -->
		</div><!-- page staff -->
		
		<div class="page" id="contact">
		     <div class="container">
		         <div class="row slideamin">
		             <div class="contact col-md-6 col-sm-6 col-xs-12">
		                 <form class="form">
		                     <div class="form-group">
		                         <label><spring:message code="contact.subject"></spring:message></label>
		                         <input type="text" class="form-control" placeholder="<spring:message code="contact.placeholder.subject"></spring:message>"/>
		                     </div>
		                     <div class="form-group">
		                         <label><spring:message code="contact.email"></spring:message></label>
		                         <input type="text" class="form-control" placeholder="<spring:message code="contact.placeholder.email"></spring:message>"/>
		                     </div>
		                     <div class="form-group">
		                         <label><spring:message code="contact.content"></spring:message></label>
		                         <textarea class="form-control" rows="5"></textarea>
		                     </div>
		                     <div class="form-group">
		                         <input type="submit" value="<spring:message code="contact.button.send"></spring:message>" class="btn btn-success col-xs-4" />
		                     </div>
		                 </form>
		             </div>
		             <div class="map col-md-6 col-sm-6 col-xs-12">
		                 <div class="direction row">
		                 <form class="form">
		                     <div class="col-sm-12">
		                          <div class="form-group col-sm-8">
		                            <input type="text" class="form-control" placeholder="<spring:message code="contact.placeholder.address"></spring:message>" />
		                         </div>
		                         <div class="form-group col-sm-4">
		                            <button type="submit" class="form-control btn btn-success"><spring:message code="contact.button.direction"></spring:message></button>
		                         </div>
		                     </div>
		                 </form>
		                 </div><!-- row -->
		                 <div class="row" id="map"></div>
		             </div>
		         </div><!-- row -->
		     </div><!-- container -->
		</div><!-- page contact -->
		<%@ include file="/WEB-INF/views/login.jsp" %>
</div><!-- main -->

<!-- bao gom copyright, address va name cong ty -->
<footer>
<nav class="navbar navbar-default">
	<div class="container">
		<div class="row">
			<div class="col-sm-4">
				
			</div>
			<div class="col-sm-4 text-center">
				<a href="#home"><span class="glyphicon glyphicon-chevron-up"></span></a>
				<!-- footer a -->
			</div>
			<div class="col-sm-4">
			    <h5 class="text-right">Copyright &copy Dinh Duc Thinh</h5>
			</div>
		</div><!-- row -->
	</div><!-- container -->
</nav><!-- navbar navbar-default -->
</footer><!-- footer -->
<script src="https://maps.googleapis.com/maps/api/js?key=AIzaSyCQAwa0kJpBKjMh9BtcDguCOYOnsO4BWR0"></script>
<!-- <script type="text/javascript" src="resources/lib/jQuery/jquery-3.1.1.js"></script> -->
<script type="text/javascript" src="resources/lib/jQuery/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="resources/lib/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>
<script type="text/javascript" src="resources/js/index.js"></script>
<!--Start of Tawk.to Script-->
<script type="text/javascript">
var Tawk_API=Tawk_API||{}, Tawk_LoadStart=new Date();
(function(){
var s1=document.createElement("script"),s0=document.getElementsByTagName("script")[0];
s1.async=true;
s1.src='https://embed.tawk.to/59a32066b6e907673de09eaa/default';
s1.charset='UTF-8';
s1.setAttribute('crossorigin','*');
s0.parentNode.insertBefore(s1,s0);
})();
</script>
<!--End of Tawk.to Script-->
</body>
</html>