/**
 * @author: sharitonchik
 */
jQuery.fn.bindEndOfInput = function (delay, fn) {
    delay = delay / 2;
    $(this).keyup(function (event) {
        if (isNotSymbol(event.which)) {
            return;
        }
        if (typeof fn === 'function') {
            startTimer($(this), delay, fn);
        }
    });

    var isNotSymbol = function (check) {
        return !(check == 8 ||
                check == 32 ||
                check >= 96 && check <= 105 ||
                check >= 46 && check <= 90);
    };

    var startTimer = function (input, delay, fn) {
        var oldValue = input.val();
        input.everyTime(delay + "ms", 'timer', function () {
            if (oldValue != input.val()) {
                oldValue = input.val();
            } else {
                fn(input);
                input.stopTime('timer');
            }
        })
    };
};

