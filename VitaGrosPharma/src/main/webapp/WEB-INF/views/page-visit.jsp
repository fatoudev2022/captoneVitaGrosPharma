<%@ include file="common/header.jspf"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<c:forEach items="${visits}" var="visit">

<h3 class="text-write">${visit.date }</h3>
<h3 class="text-whrite">${visit.description }</h3>

</c:forEach>:
<a href="/logout" class="btn btn-success">Logout</a>


<%@ include file="common/header.jspf"%>