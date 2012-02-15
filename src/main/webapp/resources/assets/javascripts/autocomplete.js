$(document).ready(function() {
    var code = $('#source_code');
    var code_text;
    var result = $('#output');

    $('#beauty').click(function() {
        getCodeAndBeautify();
    });
    $('#see').click(function() {
        getCodeAndBeautify();
        result.html(code_text);
    });

    function getCodeAndBeautify() {
        code_text = code.val();
        code.val(vkbeautify(code_text, 'xml'));
    }
});