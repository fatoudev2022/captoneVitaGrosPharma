

<%@ include file="common/header.jspf"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<table  class="table table-warning table-hover">
<thead>
 <tr>
<th>Name</th>
<th>DateOfBirth</th>
<th>PetType</th>
<th>ACTION</th>
</tr>
</thead>

<tbody>
<c:forEach items="${pets}" var="pet"> 
<tr>
     
     <td>${pet.name}</td>
     <td>${pet.dateOfBirth}</td>
     <td>${pet.petTypes.name}</td>
     <td><a href="/update-pet?petId=${pet.petId}" class="btn btn-success">Update Pets</a>   &nbsp; &nbsp; <a href="delete-pet?petId=${pet.petId }"  class="btn btn-success"> Delete</a>
     </td>
     
    
     
</tr>
</c:forEach>
</tbody>			

</table>
<a href="/add-pet" class="btn btn-success btn-outline-warning">Add Pet</a> <br> <br>

<a href="vet-list" class="btn btn-success btn-outline-warning">Join the VetList</a> &nbsp &nbsp
<%@ include file="common/footer.jspf"%>