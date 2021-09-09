$(document).ready(function(){
    gnb3_On();
    side3_On();

    $(".menu_wrap li").hover(function (){
        side3_Off();
    }, function (){
        side3_On();
    });

    $(".navbar_menu li").hover(function (){
        gnb3_Off();
    }, function (){
        gnb3_On();
    });
});

function gnb3_On() {
    $("#gnb_menu3").attr("class", "on");
    $("#gnb_menu3 a").attr("class", "on");
}

function gnb3_Off() {
    $("#gnb_menu3").attr("class", "");
    $("#gnb_menu3 a").attr("class", "");
}

function side3_On() {
    $("#side_menu3").attr("class", "on");
}

function side3_Off() {
    $("#side_menu3").attr("class", "");
}
