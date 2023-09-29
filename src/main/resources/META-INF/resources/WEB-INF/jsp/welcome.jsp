<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@ include file="common/header.jspf" %>
<%@ include file="common/navigation.jspf" %>
<body>
	<div class="container">
		<h2>Welcome ${name}</h2>
	<hr>
	<div>Today is : ${date}</div>
	<div><a href="list-todos">Manage Your todos</a>
	</div>
	<script src="webjars/bootstrap/5.1.3/js/bootstrap.min.js"></script>
	<script src="webjars/jquery/3.6.0/jquery.min.js"></script>

</body>
<%@ include file="common/footer.jspf" %>