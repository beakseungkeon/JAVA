<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/css/bootstrap.min.css" rel="stylesheet">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.2/dist/js/bootstrap.bundle.min.js"></script>
</head>
<body>
<nav class="navbar navbar-expand-sm bg-light navbar-light">
	  <div class="container-fluid">
	    <ul class="navbar-nav">
	      <li class="nav-item">
	        <a class="nav-link" href="<c:url value="/"/>">LOGO</a>
	      </li>
	      <c:if test="${user==null}">
	      <li class="nav-item">
	        <a class="nav-link" href="<c:url value="/signup"/>"  >회원가입</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="<c:url value="/login"/>">로그인</a>
	      </li>
	      </c:if>
	      <li class="nav-item">
	        <a class="nav-link" href="<c:url value="/board/insert"/>">게시글 등록</a>
	      </li>
	      <li class="nav-item">
	        <a class="nav-link" href="<c:url value="/board/list"/>">게시글 조회</a>
	      </li>
	      
	    </ul>
	  </div>
	</nav>

</body>
</html>