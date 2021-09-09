$(document).ready(function(){
    gnb4_On();
    side4_On();

    $(".menu_wrap li").hover(function (){
        side4_Off();
    }, function (){
        side4_On();
    });

    $(".navbar_menu li").hover(function (){
        gnb4_Off();
    }, function (){
        gnb4_On();
    });
});

function gnb4_On() {
    $("#gnb_menu4").attr("class", "on");
    $("#gnb_menu4 a").attr("class", "on");
}

function gnb4_Off() {
    $("#gnb_menu4").attr("class", "");
    $("#gnb_menu4 a").attr("class", "");
}

function side4_On() {
    $("#side_menu4").attr("class", "on");
}

function side4_Off() {
    $("#side_menu4").attr("class", "");
}
