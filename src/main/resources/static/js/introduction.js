$(document).ready(function(){
    gnb1_On();
    side1_On();

    $(".menu_wrap li").hover(function (){
        side1_Off();
    }, function (){
        side1_On();
    });

    $(".navbar_menu li").hover(function (){
        gnb1_Off();
    }, function (){
        gnb1_On();
    });
});

function gnb1_On() {
    $("#gnb_menu1").attr("class", "on");
    $("#gnb_menu1 a").attr("class", "on");
}

function gnb1_Off() {
    $("#gnb_menu1").attr("class", "");
    $("#gnb_menu1 a").attr("class", "");
}

function side1_On() {
    $("#side_menu1").attr("class", "on");
}

function side1_Off() {
    $("#side_menu1").attr("class", "");
}
