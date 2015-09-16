<%@ taglib uri="http://java.sun.com/portlet" prefix="portlet"%>
<%@ taglib uri="http://liferay.com/tld/theme" prefix="theme"%>
<%@ taglib uri="http://liferay.com/tld/portlet" prefix="liferay-portlet"%>
<%@ taglib uri="http://alloy.liferay.com/tld/aui" prefix="aui"%>

<portlet:defineObjects />
<theme:defineObjects />

<h1>
	Hello, world! <small>Edit mode</small>
</h1>

<portlet:actionURL var="submitFormURL" />

<aui:form name="editForm" action="${submitFormURL}">

	<aui:input label="name" name="name" />
	<input type="submit" />

</aui:form>