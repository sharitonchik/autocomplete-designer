<%--
  User: sharitonchik
--%>
<!DOCTYPE html>
<html>
<head><title>Simple Project stub</title>
    <link href="../resources/assets/stylesheets/design.css" rel="stylesheet" type="text/css"/>
    <script src="../resources/assets/javascripts/jquery-1.7.min.js">//</script>
    <script src="../resources/assets/javascripts/vkbeautify.0.93.beta.js">//</script>
</head>
<body>
<section id="container">
    <header id="art">
        <aside id="registration" class="right">
            <form>
                <table>
                    <tr>
                        <td><label for="name">Enter your name:</label>
                        </td>
                        <td><input type="text" id="name"/></td>
                    </tr>
                    <tr>
                        <td>
                            <label for="password">Password</label></td>
                        <td><input type="password" id="password"/></td>
                    </tr>
                    <tr>
                        <td>&nbsp;</td>
                        <td>
                            <input type="submit" value="Enter"/>
                        </td>
                    </tr>
                </table>
            </form>
        </aside>
    </header>
    <nav id="menubar">
        <ul>
            <li><a href="index.jsp">Main</a></li>
            <li><a href="profile.jsp">Profile</a></li>
            <li><a href="#">About</a></li>
        </ul>
    </nav>
    <section id="work_space">
        <section id="output" class="right"></section>
        <textarea id="source_code"></textarea><br/>
        <input id="beauty" type="button" value="Beautify code"/>
        <input id="see" type="button" value="See"/>
        <%--<textarea id="css_code"></textarea>--%>
    </section>

    <footer id="links" class="clear">
        <a href="http://javascript.ru" target="blank">
            <img src="resources/assets/images/linkjs.gif" alt="Javascript.RU"/>
        </a>
    </footer>
</section>
<script src="../resources/assets/javascripts/autocomplete.js"></script>
</body>
</html>