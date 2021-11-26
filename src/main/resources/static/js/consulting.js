$(document).ready(function(){
    gnb2_On();
    side2_On();

    // 닫기
    $(".popCloseBtn").click(function (){
        $("#popup_layer").css("display", "none");
    });

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
           $("#visit_Detail").css("visibility", "hidden");
           $("#visit_Detail option:eq(0)").prop("selected", "true");
           $("#phone_Detail").css("visibility", "visible");
       }else{
           $("#consultTypePrice_Phone").css("display", "none");
           $("#consultTypeExplain_Phone").css("display", "none");
           $("#consultTypePrice_Visit").css("display", "block");
           $("#consultTypeExplain_Visit").css("display", "block");
           $("#visit_Detail").css("visibility", "visible");
           $("#phone_Detail").css("visibility", "hidden");
           $("#phone_Detail option:eq(0)").prop("selected", "true");
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
    $("#visit_Detail").css("visibility", "hidden");

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

// 상담예약하기
function goReservation() {
    $("#popup_layer").css("display", "inline");
}

// 회원 로그인
function goMemberLogin() {
    window.location.href = "/moveLogin";
}

// 비회원 로그인
function goNonMemberLogin() {
    //alert("비회원 상담신청 페이지는 준비중입니다.");
    window.location.href = "/moveConsulting02";
}

// 회원가입
function goJoin() {
    window.location.href = "/moveJoin01";
}

function goPrevious(step) {
    if(step == 2){
        // 이전 버튼
        window.location.href = "/moveConsulting";
    }else if(step == 3){
        // 이전 버튼
        window.location.href = "/moveConsulting02";
    }
}

function goNext(step) {
    if(step == 1){
        // 상담 예약하기 버튼
        window.location.href = "/moveConsulting02"
    }else if(step == 2){
        // 다음 버튼
        window.location.href = "/moveConsulting03"
    }else if(step == 3){
        // 예약신청 완료 버튼
        $("#popup_layer").css("display", "inline");
    }else{
        console.log("존재하지 않는 STEP");
    }
}