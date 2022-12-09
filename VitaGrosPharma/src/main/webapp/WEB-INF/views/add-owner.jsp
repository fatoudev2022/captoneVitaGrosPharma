<%@ include file="common/header.jspf"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous" height="50px">

<img src="https://images.pexels.com/photos/1139793/pexels-photo-1139793.jpeg?auto=compress&cs=tinysrgb&w=600" >
<div class="card" style="width: 30rem;" >

  <div class="card-body">
   <h3 class="card-title text-primary fs-4 fst-italic">Complete the following informations </h3>
<table>
<form:form modelAttribute="owners"  method="post">
  <tr>
    <td><form:label path="firstName" class="fs-2 fst-italic text-info">FirstName</form:label></td>
    <td> <form:input  path="firstName" type="text"/> </td>
  </tr>
  
  <tr>
    <td><form:label path="lastName" class="fs-2 fst-italic text-info">lastName</form:label></td>
    <td><form:input path="lastName" type="text"/></td>
  </tr>
  <tr>
    <td><form:label path="address" class="fs-2 fst-italic text-info">Address</form:label></td>
    <td><form:input path="address" type="text"/> </td>
  </tr>
  
   <tr>
   
    <td> <form:errors path="city"/>
    <form:label path="city" class="fs-2 fst-italic text-info">City</form:label> </td>
    <td><form:input path="city" type="text"/> </td>
  </tr>
  
   <tr>
    <td><form:label path="telephone" class="fs-2 fst-italic text-info">Telephone</form:label></td>
    <td><form:input path="telephone" type="number"/></td>
  </tr>
  
  
  <tr>
 <td> <button type="submit" class="btn btn-outline-primary">Add Your Owner now</button> </td>
  </tr>
  </form:form> 
</table>
</div>
</div>









<%@ include file="common/footer.jspf"%>