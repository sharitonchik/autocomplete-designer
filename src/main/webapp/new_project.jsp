<%--
  User: sharitonchik
--%>
<!DOCTYPE html>
<html>
<head><title>Simple Project stub</title>
    <%@include file="/resources/assets/fragments/stylesheet.jspf" %>
    <script src="../resources/assets/javascripts/jquery-1.7.min.js">//</script>
    <script src="../resources/assets/javascripts/vkbeautify.0.93.beta.js">//</script>
</head>
<body>
<section id="container">
    <%@include file="/resources/assets/fragments/header.jspf" %>
    <%@include file="/resources/assets/fragments/menubar.jspf" %>

    <section id="work_space">
        <section id="output" class="right"></section>
        <textarea id="source_code"></textarea><br/>
        <input id="beauty" type="button" value="Beautify code"/>
        <input id="see" type="button" value="See"/>
        <%--<textarea id="css_code"></textarea>--%>
    </section>

    <%@include file="/resources/assets/fragments/footer.jspf" %>

</section>
<script src="../resources/assets/javascripts/autocomplete.js"></script>
</body>
</html>