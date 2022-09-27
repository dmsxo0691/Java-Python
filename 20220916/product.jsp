<%@ page contentType="text/html; charset=utf-8"%>
<%@ page import="dto.Product"%>
<%@ page import="dao.ProductRepository" %>
<html>
<head>
<link rel="stylesheet"	href="./resources/css/bootstrap.min.css">
<title>상품 모록</title>
</head>
<body>
	<jsp:include page="menu.jsp" />
	
	<div class="jumbotron">
		<div class="container">
			<h1 class="display-3">
				상품정보
			</h1>
		</div>
	</div>
	<%
		String id = request.getParameter("id");
	
		
		ProductRepository dao =  ProductRepository.getInstance();
		Product product = dao.getProductById(id);
		// -ProductRepository 클래스의 객체 변수 instance를 호출하는 getIntance() 메소드를
		// 작성하고 이를 통해 getProductById(id) 메소드를 호출하여 반환 결과 값을 Product 객체 타입의 
		// 변수 product에 저장합니다.
		
	%>
		
	<div class="container">
		<div class="row" >
			<div class="col-md-6">
				<h3><%=product.getPname()%></h3>
				<p><%=product.getDescription()%>
				<p><b>상품 코드 : </b><span class="badge badge-danger">
				<%=product.getProductId()%></span></p>
				<p><b>제조사</b> : <%=product.getManufacturer()%>
				<p><b>분류</b> : <%=product.getCategory()%>
				<p><b>재고 수</b> : <%=product.getUnitsInStock()%>
				<h4><%=product.getUnitPrice()%>원</h4>
				<p><a href="#" class="btn btn-info">상품 주문 &raquo;</a>
				<a href="./products.jsp"  class="btn btn-secondary">상품 목록 &raquo;</a></p>
			</div>
		</div>
			<!-- 33-40 Product 객체타입의 변수 product에 저장된 상품명. 상품상세정보, 상품코드,제조사, 분류 
			재고수, 상품가격등을 출력하도록 표현문 태그에 작성-->
			
		</div>
		<hr>
	</div>	
	<jsp:include page="footer.jsp"/>
</body>
</html>





