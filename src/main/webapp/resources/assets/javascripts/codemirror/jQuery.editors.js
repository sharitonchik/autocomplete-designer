$(document).ready(function() {
    var htmlEditor = CodeMirror.fromTextArea(document.getElementById("code"), {
                mode: {name: "xml", alignCDATA: true},
                lineNumbers: true
            });

    var cssEditor = CodeMirror.fromTextArea(document.getElementById("css"), {
                mode: {name: "css", alignCDATA: true},
                lineNumbers: true
            });
});