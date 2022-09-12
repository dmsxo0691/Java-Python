$(function () {
  var a0 = $("section > article").eq(0).offset().top;
  var a1 = $("section > article").eq(1).offset().top;
  var a2 = $("section > article").eq(2).offset().top;
  var a3 = $("section > article").eq(3).offset().top;

  console.log(a0, a1, a2, a3);
  $(window).scroll(function () {
    var sct = $(this).scrollTop(); //스크롤 위치값을 sct에 저장
    $("#Stop").text(sct);
    //   위 행과 동일 document.getElementById(Stop).innerHTML = sct;
    if (sct >= 100) {
      $("nav").addClass("fixed");
    } else {
      $("nav").removeClass("fixed");
    }
    if (sct >= 450) {
      $(".left1").addClass("on");
    }
    if (sct >= 900) {
      $(".right1").addClass("on");
    }
    if (sct >= 2300) {
      $(".s4_cover div").addClass("active");
    }

    if (sct >= $("article").eq(0).offset().top) {
      $("nav ul li").removeClass("on");
      $("nav ul li").eq(0).addClass("on");
    }
    if (sct >= $("article").eq(1).offset().top) {
      $("nav ul li").removeClass("on");
      $("nav ul li").eq(1).addClass("on");
    }
    if (sct >= $("article").eq(2).offset().top) {
      $("nav ul li").removeClass("on");
      $("nav ul li").eq(2).addClass("on");
    }
    if (sct >= $("article").eq(3).offset().top) {
      $("nav ul li").removeClass("on");
      $("nav ul li").eq(3).addClass("on");
    }
  });
  $("nav ul li").click(function () {
    var i = $(this).index(); // 클릭한 메뉴의 인덱스 번호를 구한다
    var offset_t = $("section > article").eq(i).offset().top;
    // alert(offset_t);
    $("html, body").stop().animate({ scrollTop: offset_t }, 1300);
    // $("nav ul li").removeClass("on");
    // $("nav ul li").eq(i).addClass("on");
    return false; //a 링크 금지
  });

  $("article").mousewheel(function (event, d) {
    console.log(d);
    if (d > 0) {
      //휠을 위로 올릴 때
      var prev = $(this).prev().offset().top;
      $("html,body").stop().animate({ scrollTop: prev }, 1000, "easeOutBounce");
    }
    if (d < 0) {
      //휠을 아래로 내릴 때
      var next = $(this).next().offset().top;
      $("html,body").stop().animate({ scrollTop: next }, 1000, "easeOutBounce");
    }
  });
});
