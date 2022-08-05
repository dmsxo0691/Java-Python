const API_URL = "https://floating-harbor-78336.herokuapp.com/fastfood";

$(function () {
  $(".btn-search").click(function () {
    // console.log("써치");

    const searchKeyword = $("#txt-search").val();
    search(1, 10, searchKeyword);
  });
});

function search(page, perPage, searchKeyword) {
  if (typeof page !== "number" || page < 1) page = 1;
  if (typeof perPage != "number" || page <= 0) perPage = 10;

  $.get(
    //요청할 URL
    API_URL,
    //요청에 포함시킬 인자
    { page: page, perPage: perPage, searchKeyword: searchKeyword },
    //응답이 왔을 때 실행할 함수(콜백함수)
    function (data) {
      const list = data.list;
      const total = data.total;
      $(".total").html("총" + total + "개의 패스트푸드점을 찾았다.");

      const $list = $(".list");

      for (let i = 0; i < list.length; i++) {
        let item = list[i];

        const $elem = $("#item-template").clone().removeAttr("id");

        // const $clone = $elem.clone();
        // $clone.removeAttr('id');
        $elem.find(".item-no").html(i + 1);
        $elem.find(".item-name").html(item.name);
        $elem.find(".item-addr").html(item.addr);

        $list.append($elem);
      }
      showPaging(page, perPage, total);
      console.log(data);
    }
    //   "text"
  );
}
function showPaging(page, perPage, total) {
  const $paging = $(".paging").empty();
  let numPages = 5;
  let pageStart = Math.floor((page - 1) / numPages) * numPages + 1;
  let pageEnd = pageStart + numPages - 1;
  let totalPages = Math.floor((total - 1) / perPage) + 1;

  if (pageEnd > totalPages) pageEnd = totalPages;

  //
  let prevPage = pageStart - 1;
  let nextpage = pageEnd + 1;
  if (prevPage < 1) prevPage = 1;
  if (nextpage > totalPages) nextpage = totalPages;

  const $prevElem = $(
    '<a href = "javascript:search(' + prevPage + "," + perPage + ')">이전</a>'
  );
  $prevElem.addClass("prev");
  $paging.append($prevElem);

  for (let i = pageStart; i <= pageEnd; i++) {
    //perPage 추가
    const $elem = $("<a href = javascript:search(" + i + ")>" + i + "</a>");

    if (i === page) {
      $elem.addClass("current");
    }
    $paging.append($elem);
  }
  const $nextElem = $(
    '<a href = "javascript:search(' + nextPage + "," + perPage + ')">다음</a>'
  );
  nextElem.addClass("next");
  $paging.append($nextElem);
}
