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
<jsp:include page="/WEB-INF/views/header.jsp"></jsp:include>
<div class="container">
	<h1>게시글 상세</h1>
		<div class="mb-3 mt-3">
			<label for="community" class="form-label">게시판</label>
			<input type="text" class="form-control" readonly=readonly value="${board.community.co_name}">
				
		</div>
		<div class="mb-3 mt-3">
			<label for="title" class="form-label">제목</label>
		<input type="text"class="form-control" readonly=readonly value="${board.community.bo_title}">
			
		</div>
		<div class="mb-3 mt-3">
			<label for="title" class="form-label">작성자</label>
		<input type="text"class="form-control" readonly=readonly value="${board.community.bo_me_id}">
			
		</div>
		<div class="mb-3 mt-3">
			<label for="title" class="form-label">조회수</label>
		<input type="text"class="form-control" readonly=readonly value="${board.community.bo_view}">
			
		</div>
		<div class="mb-3 mt-3">
			<label for="content" class="form-label">내용</label>
			<textarea rows="10" class="form-control" readonly>${board.bo_content} </textarea>
		</div>
</div>
</body>
</html>