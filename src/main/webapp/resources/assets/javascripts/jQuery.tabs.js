$(document).ready(function() {
    function callTabs() {
        areas.hide();
        areas.first().show();
        $('ul.navigation a').first().addClass('selected');
    }
    var areas = $('.CodeMirror');
    callTabs();

    $('ul.navigation a').click(function() {
        areas.hide();
        $('ul.navigation a').removeClass('selected');

        var tab = $(this).attr('data-href');
        if (tab == '#cssTab') {
            areas.last().show();
        } else {
            areas.first().show();
        }
        $(this).addClass('selected');
    });

});