$(document).ready(function() {

    $('#menubar > ul > li > a').each(function(index, element) {
        if (index == 1) {
            $(element).addClass('on');
        }
    });

    $('#createProject').click(function() {
        var projectName = getProjectName();
        $('#projects > ul').append('<li><span class="cursor project">' + projectName + '</span></li>');
    });


    function getProjectName() {
        var name = null;
        do{
            name = prompt("Set project name");
        } while (name == null);
        return name;
    }

    $('.project').live('click', function() {
        var projectName = this.innerHTML;
        var workZone = '<section id="workSpace"><div id="projectName"><h2>' + projectName + '</h2></div><iframe id="output" class="right"></iframe><section id="tabs"><ul class="navigation"><li><a class="" data-href="#codeTab">Code</a> </li><li><a class="" data-href="#cssTab">Css</a></li></ul><div id="codeTab"><textarea name="code" id="code">&lt;!DOCTYPE HTML&gt&lt;html&gt;&lt;head&gt;&lt;style&gt;&lt;link rel="stylesheets" type="text/css" href="css.css"/&gt;&lt;/style&gt;&lt;/head&gt;&lt;body&gt;&lt;/body&gt;&lt;/html&gt;</textarea></div><div id="cssTab"> <textarea name="css" id="css">body {margin: 0;padding: 3em 6em;font-family: tahoma, arial, sans-serif;color: #000;}</textarea></div></section><section id="buttons"><input id="see" type="button" value="See"/></section></section>';
        var scripts = '<script type="text/javascript" src="/resources/assets/javascripts/codemirror/codemirror.js">//</script><script type="text/javascript" src="/resources/assets/javascripts/codemirror/xml.js">//</script><script type="text/javascript" src="/resources/assets/javascripts/codemirror/css.js">//</script><script type="text/javascript" src="/resources/assets/javascripts/codemirror/jQuery.editors.js">//</script><script type="text/javascript" src="/resources/assets/javascripts/jQuery.tabs.js">//</script><script type="text/javascript" src="/resources/assets/javascripts/autocomplete.js">//</script>';
        $('#content').html(workZone);
        $("#body").append(scripts);
    });
});
