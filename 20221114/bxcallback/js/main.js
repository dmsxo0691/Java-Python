$(function () {
  var slider = $(".slider").bxSlider({
    auto: true,
    controls: false,
    autoHover: true,
    InfiniteLoop: true,
    onSlideBefore: function () {
      var n = slider.getCurrentSlide(); // 현재 슬라이드
      var w = $("#page ul li").width(); // 넓이를 구해서 w대입
      $("#page ul li").removeClass("on");
      $("#page ul li").eq(n).addClass("on");

      if (n == 0) {
        $("#focus").css("left", "0");
      } else {
        $("#focus")
          .stop()
          .animate({ left: n * w }, 600);
      }
    },
    onSlideAfter: function () {
      var k = slider.getCurrentSlide();
      $(".slider li").find("h1").removeClass("on");
      $(".slider li .text" + k).addClass("on");
    },
  });

  $(".left_btn").click(function () {
    slider.goToPrevSlide();
    return false;
  });
  $(".right_btn").click(function () {
    slider.goToNextSlide();
    return false;
  });
  $("#page ul li").click(function () {
    var j = $(this).index();
    slider.goToSlide(j);
    return false;
  });
});
