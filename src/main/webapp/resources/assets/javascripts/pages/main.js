$(document).ready(function() {
    var nowContent = 0;
    var mainContents = [];
    var content1 = '<p><b>HyperText Markup Language</b> (<b>HTML</b>) is the main <a href="/wiki/Markup_language"title="Markup language">markup language</a> for <a href="/wiki/Web_page" title="Web page">web pages</a>. HTML elements are the basic building-blocks of webpages.</p><p>HTML is written in the form of <a href="/wiki/HTML_element" title="HTML element">HTML elements</a> consisting of <i>tags</i> enclosed in <a href="/wiki/Angle_brackets" title="Angle brackets" class="mw-redirect">angle brackets</a> (like <code>&lt;html&gt;</code>), within the web page content. HTML tags most commonly come in pairs like <code style="white-space:nowrap;"> &lt;h1&gt;</code> and <code style="white-space:nowrap;">&lt;/h1&gt;</code>, although some tags, known as <i>empty elements</i>, are unpaired, for example <code>&lt;img&gt;</code>. The first tag in a pair is the <i>start tag</i>, the second tag is the <i>end tag</i> (they are also called <i>opening tags</i> and <i>closing tags</i>). In between these tags web designers can add text, tags, comments and other types of text-based content.</p>';
    var content2 = '<h1>CSS <span class="color_h1">Introduction</span></h1><h2>What You Should Already Know</h2> <p>Before you continue you should have a basic understanding of the following:</p><ul><li>HTML / XHTML</li></ul><p>If you want to study these subjects first, find the tutorials on our <a target="_top" href="/default.asp">Home page</a>.</p><hr><h2>What is CSS?</h2><ul><li><b>CSS</b> stands for <b>C</b>ascading <b>S</b>tyle <b>S</b>heets</li><li>Styles define <b> how to display</b> HTML elements</li><li>Styles were added to HTML 4.0 <b>to solve a problem</b></li><li><b>External Style Sheets</b> can save a lot of work</li><li>External Style Sheets are stored in <b>CSS files</b></li></ul><hr><h2>Styles Solved a Big Problem</h2><p>HTML was never intended to contain tags for formatting a document.</p><p>HTML was intended to define the content of a document, like:</p><p>&lt;h1&gt;This is a heading&lt;/h1&gt;</p><p>&lt;p&gt;This is a paragraph.&lt;/p&gt;</p><p>When tags like &lt;font&gt;, and color attributes were added to the HTML 3.2 specification, it started a nightmare for web developers. Development of large web sites, where fonts and color information were added to every single page, became a long and expensive process.</p><p>To solve this problem, the World Wide Web Consortium (W3C) created CSS.</p><p>In HTML 4.0, all formatting could be removed from the HTML document, and stored in a separate CSS file.</p><p>All browsers support CSS today.</p><hr><h2>CSS Saves a Lot of Work!</h2><p>CSS defines HOW HTML elements are to be displayed.</p><p>Styles are normally saved in external .css files. External style sheets enable you to change the appearance and layout of all the pages in a Web site, just by editing one single file!</p><br>';
    mainContents[0] = $('#inside').html();
    mainContents[1] = content1;
    mainContents[2] = content2;

    $('#menubar > ul > li > a').first().addClass('on');
    $('.prev').click(function() {
        if (nowContent == 0) {
            nowContent = mainContents.length;
        }
        $('#inside').html(mainContents[--nowContent]);
    });
    $('.next').click(function() {
        if (nowContent == (mainContents.length - 1)) {
            nowContent = -1;
        }
        $('#inside').html(mainContents[++nowContent]);
    });
});