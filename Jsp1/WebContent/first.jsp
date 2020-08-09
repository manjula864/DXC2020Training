<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>

<sql:setDataSource var="details" driver="com.mysql.cj.jdbc.Driver"
url="jdbc:mysql://localhost:3306/webdemo" 
user="root" password="12345"/>

<sql:query dataSource="${details}" var="res">
select * from web
</sql:query>
<c:out value="${'welcome to jstl demo'}" />
<table border="2" >
<tr>
<th>ID</th>
<th>NAME</th>
</tr>
<c:forEach var="data" items="${res.rows}">
<tr>
<td><c:out value="${data.eid}"/></td>
<td><c:out value="${data.ename}"/></td>
</tr>
</c:forEach>
</table>
