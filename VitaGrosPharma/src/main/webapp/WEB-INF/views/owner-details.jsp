<%@ include file="common/header.jspf"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">

<div>
<div class="d-inline p-2 bg-primary text-white">FirstName:${owner.firstName}</div> 
<div class="d-inline p-2 bg-dark text-white">LastName:${owner.lastName}</div> <br> <br>
</div>

<div >
<div class="d-inline p-2 bg-primary text-white ">Address:${owner.address}</div> 

<div class="d-inline p-2 bg-dark text-white ">City:${owner.city}</div> <br> <br>
</div>

<div>
<div class="d-block p-2 bg-dark text-white margin-top:20px" >Telephone:${owner.telephone}</div>
</div>

<hr>

<h1 class="text-primary fs-4 fst-italic">PetName: ${owner.pets.name}</h1> 
<h1 class="text-primary fs-4 fst-italic">Type: ${owner.pets.petTypes.name}</h1>                  

<h1 class="text-primary fs-4 fst-italic">DateOfBirth:${owner.pets.dateOfBirth}</h1>          
 <a href="page-visit"class="text-primary fs-4 fst-italic">VisitDate</a> <a href="page-visit" class="text-primary fs-4 fst-italic">Description</a> <br><br>




<a href="update-owner?id=${owner.id}" class="btn btn-dark btn-outline-primary">EDIT Owners</a> &nbsp &nbsp   <a href="add-owner" class="btn btn-dark btn-outline-primary">Add Owners</a> <br> <br>
<a href="pets-list" class="btn btn-dark btn-outline-primary">Access to pet-List</a>

<%@ include file="common/footer.jspf"%>