<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1" isELIgnored="false"%>
    
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    
    <h1 Style="color:green">Save Contact Page</h1>
    <script src="https://code.jquery.com/jquery-3.5.1.slim.min.js" integrity="sha256-4+XzXVhsDmqanXGHaHvgh1gMQKX40OUvDEBTu8JcmNs=" crossorigin="anonymous"></script>
    <script src="src/main/resources/jquery-validation-1.19.1"></script>
   <link rel="stylesheet" href="css/style.css"/>
   <script src="js/form-validation.js"></script>
   
   
    <form:form   action="form" method="post" modelAttribute="contact" name="registration" >
    <table>
    <tr>
    <form:hidden path="contactId"/>
    <!-- <td><b>Contact Name:</b></td>  -->
    <td><label for="contactName">Name</label></td>
    <td><form:input path="contactName" name="name" id="name" /></td>
    </tr>
    <tr>
    <td><b>Contact email:</b></td>
    <td><form:input path="contactEmail" name="email"/></td>
    </tr>
    <tr>
    <td><b>Contact no:</b></td>
    <td><form:input path="contactNumber" name="number"/></td>
    </tr>
    <tr>
    <td><input type="submit" value="save"></td>
    </tr>
    </table>
    </form:form>
    
    <a href="getall">get all data</a>
