<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>


<portlet:defineObjects />
<theme:defineObjects />

<h1>
	Hello, world! <small>View mode</small>
</h1>

<c:choose>
	<c:when test="${not empty name}">
		<p>
			It's very nice to meet you, <strong> <c:out value="${name}" /></strong>
		</p>
	</c:when>
	<c:otherwise>
		<p>
			Please go to the <em>preferences</em> to tell us your name!
		</p>
	</c:otherwise>
</c:choose>