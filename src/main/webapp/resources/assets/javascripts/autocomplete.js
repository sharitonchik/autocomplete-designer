$(document).ready(function() {
    var element = {};
    element.pname = projectName;
    element.command = "create";

    $.ajax({
                url:"/project",
                contentType:"text/html",
                data:element
            }).error(function() {
                console.log("error");
            });

    var code = $('.CodeMirror-lines');
    var codeText;
    var result = $('#output');

    $('#see').click(function() {
        element.html = codeText = code.first().text();
        element.css = codeText = code.last().text();
        element.command = "write";
        $.ajax({
                    url:"/project",
                    contentType:"text/html",
                    data:element
                });
        codeText = code.first().text();
        result.html(codeText);
    });
});