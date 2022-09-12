$(function () {
  $(".ul li").click(function () {
    var i = $(this).index();
    var nowLeft = $(".section").eq(i).offset().left;
    $("html,body").stop().animate({ scrollLeft: nowLeft }, 1300);
    return false;
  });
  $(".section").mousewheel(function (event, d) {
    console.log(d);
    if (d > 0) {
      var prev = $(this).prev().offset().left;
      $("html,body")
        .stop()
        .animate({ scrollLeft: prev }, 1000, "easeOutBounce");
    }
    if (d < 0) {
      var next = $(this).next().offset().left;
      $("html,body")
        .stop()
        .animate({ scrollLeft: next }, 1000, "easeOutBounce");
    }
  });
});
