

<%@ include file="common/header.jspf"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
<div class="container-fluid">
<table class="table table-success table-striped">
<thead>
 <tr>
<th>FirstName</th>
<th>LastName</th>
<th>Address</th>
<th>City</th>
<th>Telephone</th>
<th>Pets</th>
<th>ACTION</th>
</tr>
</thead>

<tbody>
<c:forEach items="${owners}" var="owner"> 
<tr>
     <td> <a href="owner-details?id=${owner.id}" style="text-decoration:none" class="link-success">${owner.firstName}</a></td>
     <td>${owner.lastName}</td>
     <td>${owner.address}</td>
     <td>${owner.city}</td>
     <td>${owner.telephone}</td>
     <td>${owner.pets.name}</td>
     <td><a href="update-owner?id=${owner.id}" class="btn btn-primary">Update Owners</a> &nbsp; &nbsp; <a href="delete-owner?id=${owner.id }" class="btn btn-primary"> Delete</a>
     
</tr>
</c:forEach>
</tbody>			

</table>
<div class="card" style="width: 18rem;">
  <img src="https://media.istockphoto.com/photos/portrait-young-woman-with-laughing-corgi-puppy-nature-background-picture-id1276788283?s=612x612" class="card-img-top" alt="">
  <div class="card-body">
    <h5 class="card-title">Your Owner</h5>
    <p class="card-text">Here you can add your Own Owner </p>
    <a href="add-owner" class="btn btn-primary">Add Owners</a>
  </div>
</div>
 <a href="pets-list" class="btn btn-primary">Join your pets-List</a>
</div>
 

















<%@ include file="common/footer.jspf"%>