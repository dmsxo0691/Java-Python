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
    if (sct >= 450) {
      $(".left1").addClass("on");
    }
    if (sct >= 900) {
      $(".right1").addClass("on");
    }
    if (sct >= 2300) {
      $(".s4_cover div").addClass("active");
    }
  });
  $("nav ul li").click(function () {
    var i = $(this).index(); // 클릭한 메뉴의 인덱스 번호를 구한다
    var offset_t = $("section > article").eq(i).offset().top;
    // alert(offset_t);
    $("html, body").stop().animate({ scrollTop: offset_t }, 1300);

    return false; //a 링크 금지
  });
});
