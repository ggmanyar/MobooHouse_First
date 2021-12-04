$(document).ready(function(){
    // 전체 동의
    $("#all_check").click(function (){
       if($("#all_check").is(":checked")){
           $("#first_check").prop("checked", true);
           $("#second_check").prop("checked", true);
           $("#third_check").prop("checked", true);
       }else{
           $("#first_check").prop("checked", false);
           $("#second_check").prop("checked", false);
           $("#third_check").prop("checked", false);
       }
    });
});

function goPrevious(step) {
    if(step == 2){
        window.location.href = "/moveJoin01";
    }else if(step == 3){
        window.location.href = "/moveJoin02";
    }else if(step == 4){
        window.location.href = "/moveJoin03";
    }
}

function goNext(step) {
    if(step == 1){
        acceptTerm();
    }else if(step == 2){
        verifyPhoneNumber();
    }else if(step == 3){
        registerMemberInfo();
    }else{
        console.log("존재하지 않는 STEP");
    }
}

function goLogin() {
    window.location.href = "/moveLogin";
}

function goConsulting() {
    window.location.href = "/moveConsulting";
}

// (1) 약관 동의 프로세스
function acceptTerm() {
    var param = {};

    $.ajax({
        url: "/join/acceptTerm",
        type: "POST",
        data: param,
        success:function(ret){
            window.location.href = "/moveJoin02";
        },
        error:function(e){
            console.log("error : " + JSON.stringify(e));
            alert("오류 발생 : 관리자에게 문의하세요.");
        }
    });
}

// (2) 전화번호 인증 프로세스
function verifyPhoneNumber() {
    var param = {};

    $.ajax({
        url: "/join/verifyPhoneNumber",
        type: "POST",
        data: param,
        success:function(ret){
            window.location.href = "/moveJoin03";
        },
        error:function(e){
            console.log("error : " + JSON.stringify(e));
            alert("오류 발생 : 관리자에게 문의하세요.");
        }
    });
}

// (3) 회원정보 입력
function registerMemberInfo() {
    var param = {};

    $.ajax({
        url: "/join/registerMemberInfo",
        type: "POST",
        data: param,
        success:function(ret){
            window.location.href = "/moveJoin04";
        },
        error:function(e){
            console.log("error : " + JSON.stringify(e));
            alert("오류 발생 : 관리자에게 문의하세요.");
        }
    });
}