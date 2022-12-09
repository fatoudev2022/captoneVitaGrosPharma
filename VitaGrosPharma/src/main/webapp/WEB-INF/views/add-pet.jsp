<%@ include file="common/header.jspf"%>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous" height="50px">
<img src="https://th.bing.com/th/id/R.b0369e4902240aebb4428d0f632ef519?rik=TWhnpSrLKqOHTQ&pid=ImgRaw&r=0" >
<div class="card" style="width: 30rem;" >

  <div class="card-body">
   <h3 class="card-title text-secondary fs-2 fst-italic">Add this informations  </h3>
<table>
<form:form modelAttribute="pets"  method="post">
<tr>
<td><form:errors path="name"/>
<form:label path="name" class="fs-4 fst-italic text-warning">Name of Pet: </form:label> </td>
<td><form:input path="name" type="text"/></td>
</tr>

<tr>
<td><form:errors path="dateOfBirth"/>
<form:label path="dateOfBirth" class="fs-4 fst-italic text-warning"> DateOfBirth: </form:label> </td>
<td><form:input path="dateOfBirth" type="date" name="dateOfBirth"/></td>
</tr>

<tr>
<td>
<form:label path="petTypes" class="fs-4 fst-italic text-warning"> Choose The Type of your Pet:</form:label> 
</td>
<td>
<select >
<option value="bird">Bird</option>
<option value="cat">Cat</option>
<option value="dog">Dog</option>
<option value="hamster">Hamster</option>
<option value="lizzard">Lizzard</option>
</select>
</td>
</tr>

<tr>
<td>
 <button type="submit" class="btn btn-warning btn-outline-success"> ADD</button>
 </td>
 </tr>
 </form:form>
</table>
</div>
</div>






<%@ include file="common/footer.jspf"%>