# training_data = [['연두', 3, '사과'],
#                  ['노랑', 3, '사과'],
#                  ['빨강', 2, '포도'],
#                  ['빨강', 1, '포도'],
#                  ['노랑', 3, '레몬']]
# def fruit_counts(data):
#     counts = {}
#     for row in data:
#         label = row[0]
#         if label not in counts:
#             counts[label] = 0
#         counts[label] += 1
#     return counts
# result = fruit_counts(training_data)
# print(result)

# 클래스 선언
# class You :
#     def setname(self, n): # 멤버변수(속성) 정의
#         self.name = n
#     def setage(self, a):
#         self.age = a
#     def show(self):
#         print('이름:', self.name, '/ 나이:', self.age)
# my = You()
# my.setname('준서')
# my.setage(21)
# my.show()

# class Calc :
#     def __init__(self, n):
#         self.a = n
#     def plus(self, value):
#         print(self.a, '+', value, '=', self.a + value)
#     def mult(self, value):
#         print(self.a, '*', value, '=', self.a + value)
# my = Calc(3)
# my.plus(7)
# my.mult(10)

# def func(x):
#     x = 5
#     print('x(함수):', x)
# x = 3
# func(x)
# print('x(메인):', x)




# def fib(n):
#     a, b = 0, 1
#     while b < n:
#         print (b, end = ' ')
#         a, b = b, a+b
# fib(8)

# def fib2(n):
#     result = []
#     a, b = 0, 1
#     while b < n:
#         result.append(b)
#         a, b = b, a+b
#     return result
# a = fib2(8)
# print(a)

# a = [2, 6, 9, 0, 9, 1, 7]
# for x in a:
#     print(x, end=' ')

from unittest import result
def fib(n):       # 피보나치 수열 출력
    a, b = 0, 1
    while b < n:
        print(b, end=' ')
        a, b = b, a+b
    print()
def fib2(n):    # 피보나치 수열을 리스트로 반환
    result = []
    a, b = 0, 1
    while b < n:
        result.append(b)
        a, b = b, a+b
    return result