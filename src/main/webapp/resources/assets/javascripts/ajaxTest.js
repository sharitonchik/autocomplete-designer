$(document).ready(function() {
    var submitState = false;
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
                        submitState = false;
                    }
//                    if (nameEl == "password") {
//                        $('#passwordError').html(response).show();
//                        submitState = false;
//                    }
                }).error(function() {
                    if (nameEl == "login") {
                        $('#loginError').hide();
                        submitState = true;
                    }
//                    if (nameEl == "password") {
//                        $('#passwordError').hide();
//                        submitState = true;
//                    }
                });
    }

   $('#login').bindEndOfInput(1000, function (el) {
        var nameEl = el.attr("name");
       console.log(el.attr("name"));
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
                        submitState = false;
                    }
//                    if (nameEl == "password") {
//                        $('#passwordError').html(response).show();
//                        submitState = false;
//                    }
                }).error(function() {
                    if (nameEl == "login") {
                        $('#loginError').hide();
                        submitState = true;
                    }
//                    if (nameEl == "password") {
//                        $('#passwordError').hide();
//                        submitState = true;
//                    }
                });
    });
   //live('keyup', function() {
//        if ($(this).val().length < 3) {
//            $('#loginError').html("too short").show().fadeOut(3000);
//            submitState = false;
//        } else {
//            ajax($(this));
//        }
//    });
//    $('#password').live('keyup', function() {
//        if ($(this).val().length <= 6) {
//            $('#passwordError').html("too short").show().fadeOut(3000);
//            submitState = false;
//        } else {
//            ajax($(this));
//        }
//    });
//    $('#registerForm').submit(function() {
//        return submitState;
//    });
});
