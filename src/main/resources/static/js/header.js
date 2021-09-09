/*
const toggleBtn = document.querySelector('.navbar_toggleBtn');
const menu = document.querySelector('.navbar_menu');
const icons = document.querySelector('.navbar_icons');

toggleBtn.addEventListener('click', () => {
    menu.classList.toggle('active');
    icons.classList.toggle('active');
});
*/

var toggleClicked = false;

$(document).ready(function(){
    $("#closeBtn").css("display", "none");
    $(".sidebar_menu").css("display", "none");

    $("#openBtn").click(function (){
        //$(".navbar_menu").toggleClass('active');
        //$(".navbar_icons").toggleClass('active');
        //$("#openBtn").css("display", "none");
        //$("#closeBtn").css("display", "block");
        //$(".bg-shadow").css("display", "block");

        $('.menu_bg').show();
        $('.sidebar_menu').show().animate({
            right:0
        });
        toggleClicked = true;
    });

    //$("#closeBtn").click(function (){
    $("#close_btn").click(function (){
        //$(".navbar_menu").toggleClass('active');
        //$(".navbar_icons").toggleClass('active');
        //$("#openBtn").css("display", "block");
        //$("#closeBtn").css("display", "none");
        //$(".bg-shadow").css("display", "none");

        $('.menu_bg').hide();
        $('.sidebar_menu').animate({
            right: '-' + 50 + '%'
        },function() {
            $('.sidebar_menu').hide();
        });
        toggleClicked = false;
    });

    $(window).resize(function (){
        if(toggleClicked && window.outerWidth > 768) {
            $(".bg-shadow").css("display", "none");
            toggleClicked = false;
        }
    });


    /*$(".navbar_toggleBtn").click(function (){
        $(".navbar_menu").toggleClass('active');
        $(".navbar_icons").toggleClass('active');
        $("#openBtn").toggleClass('active');
        $("#closeBtn").toggleClass('active');
        $(".bg-shadow").css("display", "none");
    });*/
});
