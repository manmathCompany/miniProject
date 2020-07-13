<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>

    <form:form action="/add" method="post" modelAttribute="obj">
    
    <table>
    <tr>
    <td>Name :</td>
    <td><form:input path="cName" /></td>
    </tr>
    <tr>
    <td>Email :</td>
    <td><form:input path="email" /></td>
    </tr>
    <tr>
    <td>Phone no :</td>
    <td><form:input path="phNo" /></td>
    </tr>
    <tr>
    <td><input type="submit" value="submit"></td>
    </tr>
    </table>
    
    </form:form>