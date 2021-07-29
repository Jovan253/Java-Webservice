<%@ page import="java.util.Date,java.util.List" %>
<%@ taglib prefix="c1" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<B>Buddy! This is working</B>
<BR/><B>Buddy! This is Great</B>
<BR/>This is really great
<BR/>${famousGuitarist} is a legend

<%
//script for java code SCRIPLET
String str="<BR/>BRUH";
out.println("<BR/>Something is printed from out.println<BR/>");
//int i = 1;
//out.println("<BR/>value of i is " + i);
//out.println(new Date().toString()); 
%>

<%--EXPRESSIONS--%>
<%=request.getParameter("parameterName")%>
${requestScope.guitarist} <%-- Easier than above --%>
${param.bestGuitarist}
<BR/>
<%=new Date().toString()%>
<%=str%>

<%-- Creating variables to be used
<c1:set var="guitarName" value="guitarValue2"/>
 --%>
 
<%--IF not value then no name
<c1:out value="${guitarName}">no name</c1:out>
 --%>
 
<%-- General if statement
<c1:if test="${guitarName ==null}">
Empty
</c1:if>
 --%>
 
<%--Like a switch statement
<c1:choose>
	<c1:when test="${guitarName==null}">
		Empty.
	</c1:when>
	<c1:when test="${guitarName =='guitarValue'}">
		guitarValue.
	</c1:when>
	<c1:otherwise>
		Something else...
	</c1:otherwise>
	
</c1:choose>
 --%>
 
 <%--Printing out headers
 <c1:forEach var="headerValue" items="${header}">
 	${headerValue.key},{headerValue.value}<BR />
 </c1:forEach>
  --%>
  
