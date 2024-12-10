<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"  isELIgnored="false" %>
    
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:choose>
      <c:when test= "${!empty Emplist}">
      <table align="center" border="1"bgcolor="yellow">
      <tr>
          <th>empno</th>
          <th>ename</th>
          <th>job</th>
          <th>salary</th>
          <th>deptno</th>
        </tr>  
        <c:forEach var="emps" items="${Emplist }">
        <tr>
          <td>${emps.empno} </td>
          <td>${emps.ename}</td>
          <td>${emps.job}</td>
          <td>${emps.sal}</td>
          <td>${emps.deptno}</td>
        </tr>
        </c:forEach>
        
      </table>
      </c:when>
    <c:otherwise>
           <h1 style="color:red ;text-align:center">No Data Found</h1> 
    </c:otherwise>  
      
</c:choose>

<br><br>
  <center><a href="./">Home</a></center>