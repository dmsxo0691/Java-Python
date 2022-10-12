# 3에서부터 2의 간격으로 7까지의 정수를 출력하는 코드
# for i in range(3, 7, 2):
#     print(i)

# sum = 0
# for i in range(1, 11):
#     sum+=i
#     print(sum)

# import time
# for i in range(10, 0, -1):
#     print(i)
#     time.sleep(1)
# print('Fire!')

# for i in range(3):
#     for j in range(3):
#         print('* ', end='') 
# end를 사용하면 앞의 문자열을 출력한 후 다음 줄로 띄우지 않고 'end'에 설정된 문자열 출력

# for i in range(1, 10):
#     for j in range(1, 10):
#         print(i*j, end=' ') 
#     print('')

# for i in range(1, 10):
#     for j in range(1, 10):
#         print(i*j, end='\t') 
#     print('')
# \t는 tab만큼 공란이 생긴다.

# for i in range(1, 10):
#     print(i,'단')
#     for j in range(1, 10):
#         print(i,'x',j ,'=' , i*j, end='\t') 
#     print('')

# for i in range(1, 4):
#     for j in range(1, i+1):
#         print(j, end=' ')
#     print()

# i = 0
# while(i<3):
#     print(i)
#     i = i+1

# def double(num):
#     print(num, '의 제곱', num*num)
# double(3)

# def hello():
#     print('Hello!')
# hello()

# def double(num):
#     return num*num
# result = double(3)
# print('%d의 제곱: %d' % (3,result))

# def double(n):
#     square = n*n
#     return square
# print(double(7))

# def add(a,b):
#     sum = a+b
#     return sum
# print(add(3,5))

# from re import A


# def add_sub(a,b):
#     sum = a+b
#     diff = a-b
#     return sum, diff
# print(add_sub(3,5))

# def swap(a,b):
#     temp = a
#     a = b
#     b = temp
# a = 3
# b = 5
# swap(a, b)
# print('a = ', a, ', b = ',b)

# def swap(a,b):
#     return b, a
# a = 3
# b = 5
# a, b = swap(a, b)
# print('a = ', a, ', b = ',b)

# from unittest import result


# def sum(n):
#     sum = 0
#     for i in range(1, n+1):
#         sum += i
#     return sum
# print(sum(10))

# def factorial(n):
#     result = 1
#     for i in range(n):
#         result *= i+1
#     return result
# print (factorial(5))

# import math
# print(math.factorial(3))

# import turtle
# turtle.shape('turtle')
# turtle.forward(100)
# turtle.left(50)
# turtle.forward(100)
# turtle.right(60)
# turtle.forward(100)

print("doesn't")
print('doesn\'t')

animal = 'frog'
print(animal[3])
print(animal[-2])

animal = '진돗개'
print(animal[0])
print(animal[-2])

animal = 'frog'
print(animal[1])
print(animal[1:3])
print(animal[0:3:2])

print(animal[:])
print(animal[1:])
print(animal[:2])
