<%@page import="java.util.Date,java.util.List"%>

<B>Buddy! This is working</B>
<BR/><B>Buddy! This is Great</B>
<BR/>This is really great
<BR/>${famousGuitarist} is a legend

<%
//script for java code SCRIPLET
String str="<BR/>Slash";
out.println("<BR/>Something is printed from out.println<BR/>");
//int i = 1;
//out.println("<BR/>value of i is " + i);
//out.println(new Date().toString()); 
%>

<%--EXPRESSIONS--%>
<%=request.getParameter("parameterName") %>
<%=new Date().toString()%>
<%=str%>

<%-- Percentage = Comments --%>
