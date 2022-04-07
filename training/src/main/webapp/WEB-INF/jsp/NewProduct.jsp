<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<h1>Create Contact</h1>
<form:form method="post" action="/addProducts">
    <table>
        <tr>
            <td>Code: </td>
            <td><form:input path="code"/></td>
        </tr>
        <tr>
            <td>Name: </td>
            <td><form:input path="name"/></td>
        </tr>
        <tr>
            <td>Type: </td>
            <td><form:input path="type"/></td>
        </tr>
          <tr>
            <td>Price: </td>
            <td><form:input path="price"/></td>
        </tr>
        <tr>
            <td></td>
            <td><input type="submit" value="Create"/></td>
        </tr>
    </table>
       <a href="/viewProducts" >Back</a>
</form:form>