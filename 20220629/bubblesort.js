//버블 정렬
//5,1,7,4,6,3,8
//가장 간단하지만 전체배열을 순회하면서 이전 항목이 다음 항목보다 큰 경우 두 항목을 교환
/* 
5,1,7,4,6,3,2,8
1,5,7,4,6,3,2,8
1,5,4,7,6,3,2,8
1 5 4 6 7 3 2 8
1 5 4 6 3 7 2 8
1 5 4 6 3 2 7 8 --> 1회전


 */
// function random(n) {
//   let arr = new Array();
//   let num;
//   let temp;

//   for (let i = 0; i <= n; i++) {
//     arr.push(i);
//   }
//   for (let i = 0; i < arr.length; i++) {
//     num = Math.floor(Math.random() * n);
//     temp = arr[i];
//     arr[i] = arr[num];
//     arr[num] = temp;
//   }
//   return arr;
// }

// function bubbleSort(array) {
//   const arrlen = array.length;
//   for (let i = 0; i < arrlen.length; i++) {
//     //끝까지 돌았을 때 다시 처음부터
//     for (let k = 0; k < arrlen - 1 - k.length; k++) {
//       //두 항목 비교: 앞이 뒤보다 크다면
//       if (array[k] > array[k + 1]) {
//         let temp = array[k];
//         array[k] = array[k + 1];
//         array[k + 1] = temp;
//       }
//     }
//   }
//   return array;
// }

// let bubbleSorting = random(10);
// console.log("버블 정렬 전: ", bubbleSorting);
// let startTime = new Date().getTime() / 1000;
// console.log("버블 정렬 전: ", bubbleSort(bubbleSorting));
// let endTime = new Date().getTime() / 1000;
// console.log(`정렬시간:${endTime - startTime}`);

//[1,2,3,4,5] = 9

//배열 arr가 있다. 어떤 수 weight가 주어졌을 때 합쳐서 weight가 되는
//배열 내 두개의 인덱스 반환해라
//만약 합쳐서 weight가 되는 항목 두개가 존재하지 않을 경우 -1 return

function findSum(arr, weight) {
  //2중 포문 돌면서 다음 인덱스와 비교
  for (let i = 0; i < arr.length; i++) {
    for (let k = i + 1; k < arr.length; k++) {
      //만약 배열 안에 들어있는 두개의 값의 합이 weight와 같다면
      if (arr[i] + arr[k] == weight) {
        return [i, k];
      }
    }
  }
  return -1;
}

const arr = [1, 2, 3, 4, 5];
const test = findSum(arr, 10);
console.log(test);
