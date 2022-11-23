$(function () {
  var ht;
  $(window).resize(function () {
    ht = $(window).height(); //현재 브라우저의 높이
    $("section").height(ht); //구한 높이값을 가져와 컨텐츠 영역의 높이에 대입
  });
  $(window).trigger("resize"); //브라우저를 켬과 동시에 강제로 resize실행

  //메뉴 클릭 시 스크롤
  $("#menu li").click(function () {
    var i = $(this).index();
    // var ii = $("section").eq(i).offset().top;
    // $("html, body").stop().animate({ scrollTop: ii }, 700);
    $("html, body")
      .stop()
      .animate({ scrollTop: ht * i }, 700);

    return false;
  });

  $(window).on("scroll", function () {
    var sct = $(window).scrollTop();
    /*
    if (sct >= ht * 0 && sct < ht * 1) {
      $("#menu li").removeClass("on");
      $("#menu li").eq(0).addClass("on");
    }
    if (sct >= ht * 1 && sct < ht * 2) {
      $("#menu li").removeClass("on");
      $("#menu li").eq(1).addClass("on");
    }
    if (sct >= ht * 2 && sct < ht * 3) {
      $("#menu li").removeClass("on");
      $("#menu li").eq(2).addClass("on");
    }
    if (sct >= ht * 3 && sct < ht * 4) {
      $("#menu li").removeClass("on");
      $("#menu li").eq(3).addClass("on");
    }
   */
    /*
    for (var i = 0; i < 5; i++) {
      if (sct >= ht * i && sct < ht * (i + 1)) {
        $("#menu li").removeClass("on");
        $("#menu li").eq(i).addClass("on");
      }
    }
    */
    var i = 0;
    $("#menu li").each(function (i) {
      if (sct >= ht * i && sct < ht * (i + 1)) {
        $("#menu li").removeClass("on");
        $("#menu li").eq(i).addClass("on");
      }
    });

    $("section").mousewheel(function (event, d) {
      console.log(d);
      if (d > 0) {
        var prev = $(this).prev().offset().top;
        $("html, body")
          .stop()
          .animate({ scrollTop: prev }, 700, "easeOutBounce");
      }
      if (d < 0) {
        var next = $(this).next().offset().top;
        $("html, body")
          .stop()
          .animate({ scrollTop: next }, 700, "easeOutBounce");
      }
    });
  });

  $("section").on("mousemove", function (e) {
    var posX = e.pageX;
    var posY = e.pageY;

    $(".p11").css({ right: 20 - posX / 30, bottom: 20 - posY / 30 });
    $(".p12").css({ right: 130 - posX / 20, bottom: -40 - posY / 20 });
    $(".p13").css({ right: 60 - posX / 20, top: 180 - posY / 20 });

    //2페이지
    $(".p21").css({
      right: -180 - posX / 30,
      bottom: -480 - posY / 30,
    });
    $(".p22").css({
      right: 130 + posX / 50,
      bottom: -40 + posY / 50,
    });

    //3페이지
    $(".p31").css({ right: 280 - posX / 30, bottom: 30 - posY / 30 });
    $(".p32").css({
      right: 110 + posX / 20,
      bottom: -270 + posY / 20,
    });
    $(".p33").css({
      right: -70 + posX / 20,
      bottom: -130 + posY / 20,
    });

    //4페이지
    $(".p41").css({
      right: 20 - posX / 30,
      bottom: -120 - posY / 30,
    });
    $(".p42").css({
      right: 0 - posX / 20,
      bottom: -180 - posY / 20,
    });
  });

  $("#popup").draggable();
  if ($.cookie("pop") != "no") {
    $("#popup").show();
  }
  if ($.cookie("popup") == "none") {
    $("#notice_wrap").hide();
  }

  $("#popup").css("cursor", "move");
  var chk = $("#expiresChk");

  $(".closeBtn").on("click", closePop);

  function closePop() {
    if (chk.is(":checked")) {
      //체크가 되있으면
      $.cookie("popup", "none", { expires: 3 });
      //chk 변수가 checked를 가지고있으면
      //popup에 none을 3일동안 저장해라
    }
    $("#popup").fadeOut("fast");
  }
});
