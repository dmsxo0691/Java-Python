//배열 arr가 있다. 어떤 수 weight가 주어졌을 때 합쳐서 weight가 되는
//배열 내 두개의 인덱스 반환해라
//만약 합쳐서 weight가 되는 항목 두개가 존재하지 않을 경우 -1 return

const arr = [1, 2, 3, 4, 5];
const weight = 10;

for (let i = 0; i < arr.length; i++) {
  for (let k = i + 1; k < arr.length; k++) {
    if (arr[i] + arr[k] == weight) {
      console.log(i, k);
    } else {
      console.log(-1);
    }
  }
}
