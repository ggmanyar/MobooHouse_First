$(document).ready(function(){
    gnb2_On();
    side2_On();

    $(".menu_wrap li").hover(function (){
        side2_Off();
    }, function (){
        side2_On();
    });

    $(".navbar_menu li").hover(function (){
        gnb2_Off();
    }, function (){
        gnb2_On();
    });

    // 1. 상담 종류 선택 event
    $("input:radio[name='consultType']").change(function(){
       if($("input:radio[name='consultType']").eq(0).is(':checked') == true){
           $("#consultTypePrice_Visit").css("display", "none");
           $("#consultTypeExplain_Visit").css("display", "none");
           $("#consultTypePrice_Phone").css("display", "block");
           $("#consultTypeExplain_Phone").css("display", "block");
       }else{
           $("#consultTypePrice_Phone").css("display", "none");
           $("#consultTypeExplain_Phone").css("display", "none");
           $("#consultTypePrice_Visit").css("display", "block");
           $("#consultTypeExplain_Visit").css("display", "block");
       }
    });

    // 2. 날짜 선택 event
    $('.date').each(function(index){
        $(this).attr('date-index', index);
    }).click(function(){
        var index = $(this).attr('date-index');
        $('.date[date-index=' + index + ']').addClass('clicked');
        $('.date[date-index!=' + index + ']').removeClass('clicked');
    });

    // 3. 시간 선택 event
    $('.each_time').each(function(index){
        $(this).attr('time-index', index);
    }).click(function(){
        var index = $(this).attr('time-index');
        $('.each_time[time-index=' + index + ']').addClass('clicked');
        $('.each_time[time-index!=' + index + ']').removeClass('clicked');
    });

    init();
});

function init() {
    // 1.상담종류 선택 초기화
    $("input:radio[name='consultType']").eq(0).attr("checked", true);
    $("#consultTypePrice_Visit").css("display", "none");
    $("#consultTypeExplain_Visit").css("display", "none");
    $("#consultTypePrice_Phone").css("display", "block");
    $("#consultTypeExplain_Phone").css("display", "block");

    // 2.날짜 선택 초기화
    $('.date[date-index=3]').addClass('clicked');
    $('.date[date-index=6]').addClass('disabled');

    // 3.시간 선택 초기화
    $('.each_time[time-index=0]').addClass('clicked');
    $('.each_time[time-index=3]').addClass('disabled');
    $('.each_time[time-index=7]').addClass('disabled');
    $('.each_time[time-index=10]').addClass('disabled');
    $('.each_time[time-index=12]').addClass('disabled');
    $('.each_time[time-index=13]').addClass('disabled');
}

function gnb2_On() {
    $("#gnb_menu2").attr("class", "on");
    $("#gnb_menu2 a").attr("class", "on");
}

function gnb2_Off() {
    $("#gnb_menu2").attr("class", "");
    $("#gnb_menu2 a").attr("class", "");
}

function side2_On() {
    $("#side_menu2").attr("class", "on");
}

function side2_Off() {
    $("#side_menu2").attr("class", "");
}
