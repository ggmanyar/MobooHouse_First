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
    $("body").css("background", "url('/static/images/moboo_Background.jpeg') no-repeat center center/cover, rgba(0, 0, 0, 0.8)");
    $("body").css("background-blend-mode", "multiply");
    /*background: url('/static/images/moboo_Background.jpeg') no-repeat center center/cover, rgba(0, 0, 0, 0.6);
    background-blend-mode: multiply;*/
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