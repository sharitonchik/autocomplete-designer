<%--
  User: sharitonchik
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head><title>Simple jsp page</title>
    <%@include file="/resources/assets/fragments/stylesheet.jspf" %>
</head>
<body>
<section id="container">
    <%@include file="/resources/assets/fragments/header.jspf" %>
    <%@include file="/resources/assets/fragments/menubar.jspf" %>


    <section id="content">
        <%@include file="/resources/assets/fragments/content/error.jspf" %>
    </section>
    <%@include file="/resources/assets/fragments/footer.jspf" %>
</section>
</body>
</html>