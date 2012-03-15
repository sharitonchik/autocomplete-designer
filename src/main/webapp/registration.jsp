<!DOCTYPE html>
<html>
<head>
    <title>Main Page</title>
    <%@include file="/resources/assets/fragments/stylesheet.jspf" %>
</head>
<body>
<section id="container">
    <%@include file="/resources/assets/fragments/header.jspf" %>
    <%@include file="/resources/assets/fragments/menubar.jspf" %>

    <section id="content">

        <form method="post" action="/registration">
            <table>
                <tr>
                    <td><label>Name</label></td>
                    <td><input type="text" name="name"/></td>
                </tr>
                <tr>
                    <td>
                        <label>Password </label>
                    </td>
                    <td>
                        <input type="text" name="password"/>
                    </td>

                </tr>
                <tr>
                    <td>
                        &nbsp;
                    </td>
                    <td>
                        <input type="submit" name="btn"/>
                    </td>
                </tr>
            </table>
        </form>
    </section>
    <%@include file="/resources/assets/fragments/footer.jspf" %>

</section>
</body>
</html>
