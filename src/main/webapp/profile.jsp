<!DOCTYPE html>
<html>
<head>
    <title>Main Page</title>
    <link rel="stylesheet" type="text/css" href="resources/assets/stylesheets/design.css"/>
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
    <aside id="projects" class="right">
        <ul>
            <li><a href="new_project.jsp">New project</a></li>
            <li>some text</li>
        </ul>
    </aside>
    <section id="user_data" class="stubcontent">
        JavaScript is an important language because it is the language of the web browser. Its association with the
        browser makes it one of the most popular programming languages in the world. At the same time, it is one of the
        most despised programming languages in the world. The API of the browser, the Document Object Model (DOM) is
        quite awful, and JavaScript is unfairly blamed. The DOM would be painful to work with in any language. The DOM
        is poorly specified and inconsistently implemented. This book touches only very lightly on the DOM. I think
        writing a Good Parts book about the DOM would be extremely challenging.

        JavaScript is most despised because it isn't SOME OTHER LANGUAGE. If you are good in SOME OTHER LANGUAGE and you
        have to program in an environment that only supports JavaScript, then you are forced to use JavaScript, and that
        is annoying. Most people in that situation don't even bother to learn JavaScript first, and then they are
        surprised when JavaScript turns out to have significant differences from the SOME OTHER LANGUAGE they would
        rather be using, and that those differences matter.

        The amazing thing about JavaScript is that it is possible to get work done with it without knowing much about
        the language, or even knowing much about programming. It is a language with enormous expressive power. It is
        even better when you know what you're doing. Programming is difficult business. It should never be undertaken in
        ignorance.
    </section>
    <footer id="links" class="clear">
        <a href="http://javascript.ru" target="blank">
            <img src="resources/assets/images/linkjs.gif" alt="Javascript.RU"/>
        </a>
    </footer>
</section>
</body>
</html>
