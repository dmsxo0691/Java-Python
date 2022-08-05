//선택정렬: 쓰레기지만 버블보단 낫다
//가장 작은 항목을 찾아서 해당 항목을 배열의 현 위치에 삽입하는 방식
/*
7 4 5 6 8 2 1
1 4 5 6 8 2 7 -> 최소값 1 -> 7과 교환
1 2 5 6 8 4 7 -> 최소값 2 -> 4와 교환
1 2 4 6 8 5 7 -> 최소값 4 -> 5와 교환
1 2 4 5 8 6 7
1 2 4 5 6 8 7
1 2 4 5 6 7 8
*/

function swap(arr, a, b) {
  let temp = arr[a];
  arr[a] = arr[b];
  arr[b] = temp;
}

function random(n) {
  let arr = new Array();
  let num;
  let temp;

  for (let i = 0; i <= n; i++) {
    arr.push(i);
  }
  for (let i = 0; i < arr.length; i++) {
    num = Math.floor(Math.random() * n);
    temp = arr[i];
    arr[i] = arr[num];
    arr[num] = temp;
  }
  return arr;
}

function selectSort(arr) {
  const arrlen = arr.length;
  let min;

  for (let i = 0; i < arrlen; i++) {
    //최소항목을 현재 위치로 설정
    min = i;

    //더 작은 항목이 있는지 배열의 나머지를 확인
    for (let k = i + 1; k < arrlen; k++) {
      if (arr[k] < arr[min]) {
        min = k;
      }
      //현재 위치가 최소항목 위치가 아니라면 항목 swap
    }
    if (i != min) {
      swap(arr, i, min);
    }
  }
  return arr;
}
let number = random(1000);
console.log("선택정렬전 :", number);
console.log("선택정렬후 :", selectSort(number));

let startTime = new Date().getTime() / 1000;
console.log("버블 정렬 전: ", selectSort(number));
let endTime = new Date().getTime() / 1000;
console.log(`정렬시간:${endTime - startTime}`);
