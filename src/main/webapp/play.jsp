<%@ page import="com.py4object.v2.modle.PlayerSession" %><%--

  Created by IntelliJ IDEA.
  User: kozo
  Date: 2/9/16
  Time: 4:59 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>

</head>

<body>
    <center>
        <%
            PlayerSession session1= (PlayerSession) request.getAttribute("Session");
            out.println(session1.getUrl());
        %>
    </center>
    <iframe src="http://www.youtube.com/embed/<%=((PlayerSession)request.getAttribute("Session")).getUrl()%>"
            width="640" height="390"></iframe>

</body>
</html>
