$(document).ready(function() {
//    var submitState = false;
    var ajaxForCheck = function (el) {
        var nameEl = el.attr("name");
        var element = {};
        element[nameEl] = el.val();
        $.ajax({
                    url:"/check",
                    contentType:"text/html",
//                    processData:false,
//                    type:"POST",
                    data:element
                }).success(
                function(response) {
                    if (nameEl == "login") {
                        $('#loginError').html(response).show();
//                        submitState = false;
                    }
                    if (nameEl == "password") {
                        $('#passwordError').html(response).show();
//                        submitState = false;
                    }
                }).error(function() {
                    if (nameEl == "login") {
                        $('#loginError').hide();
//                        submitState = true;
                    }
                    if (nameEl == "password") {
                        $('#passwordError').hide();
//                        submitState = true;
                    }
                });
    }

   $(':input[data-check="check"]').bindEndOfInput(1000, ajaxForCheck);
//    $('#registerForm').submit(function() {
//        return submitState;
//    });
});
