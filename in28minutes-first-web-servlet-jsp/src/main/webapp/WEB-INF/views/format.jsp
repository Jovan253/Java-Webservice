<%@ page import="java.util.Date,java.util.List" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>

<c:set var="amountToBeFormatted" value="12345688.89123" />
${amountToBeFormatted}

<BR />
Default:
<fmt:formatNumber value="${amountToBeFormatted}" type="currency" />
<BR/>
maxIntegerDigits="3":
<fmt:formatNumber type="number" maxIntegerDigits="3" value="${amountToBeFormatted}" />
<BR/>
maxFractionDigits="3":
<fmt:formatNumber type="number" maxFractionDigits="3" value="${amountToBeFormatted}" />
<BR/>
groupingUsed="false":
<fmt:formatNumber type="number" groupingUsed="false" value="${amountToBeFormatted}" />
<BR/>
pattern="###.###E0":
<fmt:formatNumber type="number" pattern="###.###E0" value="${amountToBeFormatted}"/>

<BR/>
<fmt:setLocale value="nl_NL"/>
<c:set var="today" value="<%=new java.util.Date() %>" />
<BR/>type="time" => <fmt:formatDate type="time" value="${today}" />
<BR/>type="date" => <fmt:formatDate type="date" value="${today}" />
<BR/>type="both" => <fmt:formatDate type="both" value="${today}" />
