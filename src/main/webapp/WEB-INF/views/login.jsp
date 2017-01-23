<%@ page session="false"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
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
<div id="login" class="modal fade" role="dialog">
  <div class="modal-dialog">

    <!-- Modal content-->
    <div class="modal-content">
      <div class="modal-header">
        <button type="button" class="close" data-dismiss="modal">&times;</button>
        <h4 class="modal-title text-center"><spring:message code="login.header"></spring:message></h4>
      </div>
      <div class="modal-body">
					<div class="login container-fluid">
						<div class="login row">
							<div class="login col-sm-6">
							    <c:url value="login" var="springcheck"></c:url>
								<form action="${springcheck}" method="post">
								   <div class="form-group">
								       <label></label>
								       <input type="text" class="form-control" placeholder="<spring:message code="login.placeholder.user" />" name="user" /> 
								   </div>
								   <div class="form-group">
								       <label></label>
									   <input type="password" class="form-control" placeholder="<spring:message code="login.placeholder.pass" />" name="pass" /> 
								   </div>
								   <div class="form-group">
								       <label class="checkbox-inline"><input type="checkbox" name="remember-me" /><spring:message code="login.checkbox.rememberme"/></label>
								   </div>
								   <div class="form-group">
									   <input type="submit" class="form-control" value="<spring:message code="login.submit.login" />">
								   </div>
								   <div class="form-group">
								        <c:if test="${not empty loginerror }">
								            <p class="text text-warning">Sisäänkirjautuminen epäonnistui</p>
								        </c:if>
								   </div>
								</form>
							</div><!-- login col-sm-6-->
							<div class="register col-sm-6">
								<form action="signup" method="post">
								    <div class="form-group">
								         <label><spring:message code="register.select.title" /></label>   
								         <select class="form-control" id="mySelect" name="type">
								             <option value="1"><spring:message code="register.option.employee"/></option>
								             <option value="2"><spring:message code="register.option.employer" /></option>
								         </select>
								    </div>
									<div id="employee">
										<div class="form-group">
										    <label><spring:message code="register.label.fullname" /></label>
											<input type="text" class="form-control" name="nameEmployee"
												placeholder="<spring:message code="register.placeholder.fullname" />" />
										</div>
									</div><!-- employee -->
									<div id="employer" style="display:none">
										<div class="form-group">
										    <label><spring:message code="register.label.company" /></label>
											<input type="text" class="form-control" name="nameEmployer"
												placeholder="<spring:message code="register.placeholder.company" />" />
										</div>
										<div class="form-group">
										    <label><spring:message code="register.label.industry" /></label>
											<input type="text" class="form-control" name="industry"
												placeholder="<spring:message code="register.placeholder.industry" />" />
										</div>
									</div><!-- employer -->

									<div class="form-group">
								         <input type="text" class="form-control" name="email" placeholder="<spring:message code="register.placeholder.email" />" />
								    </div>
								    <div class="form-group">
								         <input type="password" name="pass" class="form-control" placeholder="<spring:message code="register.placeholder.pass" />" />
								    </div>
								    <div class="form-group">
								         <input type="password" name="passagain" class="form-control" placeholder="<spring:message code="register.placeholder.passagain" />" />
								    </div>
								    <div class="form-group">
								         <input type="submit" class="form-control" value="<spring:message code="register.submit.register" />" />
								    </div>
								</form>
							</div><!-- register col-sm-6-->
						</div><!-- login row -->
					</div><!-- login container-fluid -->
				</div><!-- modal body -->
      <div class="modal-footer">
        <button type="button" class="btn btn-default" data-dismiss="modal">Close</button>
      </div><!-- model footer -->
    </div><!-- modal content -->

  </div><!-- modal dialog -->
</div><!-- modal fade -->
<script type="text/javascript" src="resources/lib/jQuery/jquery-3.1.1.js"></script>
<script type="text/javascript" src="resources/lib/jQuery/jquery-3.1.1.min.js"></script>
<script type="text/javascript" src="resources/lib/bootstrap-3.3.7-dist/js/bootstrap.min.js"></script>

<script type="text/javascript">
   $(document).ready(function(){
	   $("#mySelect").on("change",function(){
		   /* var option = $("#mySelect  option:selected").text(); */
		   var option = this.value;
		   switch(option){
		     case "1":
		    	     $("#employee").show();
		    	     $("#employer").hide();
		    	     break;
		     case "2":
	    	         $("#employer").show();
	    	         $("#employee").hide();
	    	     break;
		    	 default:
		    		 alert(option);
		    		 $("#employee").hide();
		    	     $("#employer").hide();
		    	     break;
		     }
	   });
	   
   })
</script>
</body>
</html>