$(document).ready(function(){
    gnb_Init();
    side_Init();

    $(".contentFrame").css("background-color", "transparent");
    $(".navbar").css("background-color", "transparent");
    $(".split_bar").css("color", "white");
    $("a").css("color", "white");
    $(".navbar").css("border-bottom", "solid 1px grey");
    $(".headerbar").css("border-bottom", "solid 1px grey");
    $(".contentFrame").css("border", "solid 1px grey");
    /*$(".contentFrame").css("backdrop-filter", "blur(10px)");
    $(".contentFrame").css("box-shadow", "2px 7px 15px 8px rgba(0,0,0,0.3)");*/

    $("footer").css("color", "white");
    $(".navbar_menu li.on:after").css("border-bottom", "solid 5px black");
    $("#logo").attr("src", '/static/images/mobooLogo_White.png');

    $("body").css("background", "url('/static/images/moboo_Background.png') no-repeat center center");
    //$("body").css("background-attachment", "local");
    //$("body").css("-webkit-background-size", "cover");
    //$("body").css("-moz-background-size", "cover");
    //$("body").css("-o-background-size", "cover");
    $("body").css("-background-size", "cover");
    $("body").css("overflow", "hidden");
    $("body").css("background-attachment", "fixed");
    $("body").css("-webkit-background-attachment", "fixed");
    $("body").css("-moz-background-attachment", "fixed");
    $("body").css("-o-background-attachment", "fixed");
    $("body").css("-background-attachment", "fixed");
    $("body").css("background-blend-mode", "multiply");

    $("section .contentFrame").css("min-height", "80vh");
    $("section .contentFrame .introTitle .intro_contents").css("min-height", "70vh");

});

function gnb_Init() {
    // OFF
    $("#gnb_menu1").attr("class", "");
    $("#gnb_menu1 a").attr("class", "");
    $("#gnb_menu2").attr("class", "");
    $("#gnb_menu2 a").attr("class", "");
    $("#gnb_menu3").attr("class", "");
    $("#gnb_menu3 a").attr("class", "");
    $("#gnb_menu4").attr("class", "");
    $("#gnb_menu4 a").attr("class", "");
    $("#gnb_menu5").attr("class", "");
    $("#gnb_menu5 a").attr("class", "");
}

function side_Init() {
    $("#side_menu1").attr("class", "");
    $("#side_menu2").attr("class", "");
    $("#side_menu3").attr("class", "");
    $("#side_menu4").attr("class", "");
    $("#side_menu5").attr("class", "");
}