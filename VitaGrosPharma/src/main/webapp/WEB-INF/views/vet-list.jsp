<%@ include file="common/header.jspf"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<table class="table table-success table-hover">
<thead>
 <tr>
<th>FirstName</th>
<th>LastName</th>
<th>Specialties</th>

</tr>
</thead>

<tbody>
<c:forEach items="${vets}" var="vet"> 
<tr>
    
     <td>${vet.firstName}</td>
     <td>${vet.lastName}</td>
     <td>${vet.specialty.name}</td>
     
     
</tr>
</c:forEach>
</tbody>			

</table>
<a href="pets-list" class="btn btn-success">Join the petList</a> &nbsp &nbsp

<a href="/logout" class="btn btn-success">Logout</a>
<%@ include file="common/header.jspf"%>
