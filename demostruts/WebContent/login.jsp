<%@ taglib uri="/WEB-INF/struts-html.tld" prefix="h" %>
<h:form action="test">

ENTER USERNAME:<h:text property="username"/>
<br>
ENTER PASSWORD:<h:password property="password"/>
<br>

<h:submit value="send"/>
</h:form>