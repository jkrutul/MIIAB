<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Spring 3 hibernate integration example on www.howtodoinjava.com</title>
</head>
<body>
 
<h2>Department Management Screen : Spring 3 hibernate integration example on www.howtodoinjava.com</h2>
 
<form:form method="post" action="add" commandName="department">
 
    <table>
    <tr>
        <td><form:label path="city"><spring:message text="City" code="label.city"/></form:label></td>
        <td><form:input path="city" /></td>
    </tr>
    <tr>
        <td><form:label path="postCode"><spring:message text="Post Code" code="label.postCode"/></form:label></td>
        <td><form:input path="postCode" /></td>
    </tr>
    
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message text="Add" code="label.add"/>"/>
        </td>
    </tr>
</table> 
</form:form>
 
     
<h3>Departments</h3>
<c:if  test="${!empty departmentList}">
<table class="data">
<tr>
    <th>City</th>
    <th>Post Code</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${departmentList}" var="dept">
    <tr>
        <td>${dept.city} </td>
        <td>${dept.postCode}</td>

        <td><a href="delete/${dept.id}">delete</a></td>
    </tr>
</c:forEach>
</table>
</c:if>
 
</body>
</html>