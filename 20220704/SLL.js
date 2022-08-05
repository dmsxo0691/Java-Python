// linked list: 노드 형식으로 순차적으로 탐색해야 하기 때문에 탐색 및 정렬은 느리나
// 데이터 삽입/삭제는 빠르기 때문에 상황에 따라 array list 와 linked list 중 선택하여 사용하면 된다
function Node(data) {
  this.data = data;
  this.next = null;
}
Node.prototype.insert = function (value) {
  let newNode = new Node(value);
  if (this.next == null) this.next = newNode;
  else {
    newNode.next = this.next;
    this.next = newNode;
  }
};
Node.prototype.delete = function () {
  if (this.next == null) return null;
  const remove = this.next;
  this.next = remove.next;
};
Node.prototype.print = function () {
  let str = "";
  for (let p = this; p != null; p = p.next) {
    str += `${p.data}->`;
  }
  str += `NULL`;
  console.log(str);
};

let sll = new Node("head");
sll.insert(1);
sll.insert(2);
sll.insert(3);
sll.delete();
sll.print();
