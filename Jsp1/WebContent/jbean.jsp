<%-- <%@ page import=" com.model.*"%>
<%
Employee emp=new Employee();
emp.setId(100);
emp.setName("teja");



%>
 --%>
 <%-- <% 
int empid=Integer.parseInt(request.getParameter("eid"));
String ename=request.getParameter("user");
%> --%>
<%-- <jsp:useBean id="emp" class="com.model.Employee"/>
<jsp:setProperty name="emp" property="id" value='<%=empid%>'/>
<jsp:setProperty name="emp" property="name" value='<%=ename%>'/>
 --%>
 <%-- <jsp:useBean id="emp" class="com.model.Employee"/>
<jsp:setProperty name="emp" property="id" param="eid"/>
<jsp:setProperty name="emp" property="name" param="user"/>
 --%>

<%-- 
<% 
<jsp:forward page="sony.html"/>

%> --%>
<%-- Name:<jsp:getProperty name="emp" property="id"/><br>
ID:<jsp:getProperty name="emp" property="name"/>
 --%>
<%-- <h1>using el :</h1>
<h4>${emp.id}</h4>
<h4>${emp.name}</h4>
 --%>

<%@ page isELIgnored="false"%>
Name: ${param:eid}














