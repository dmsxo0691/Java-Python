#Numpy 리스트에서 할 수 없는 배열 기능을 도와준다.
# x = [1,3,5]
# x.mean() #에러
# 1. Numpy 모듈 가져오기
# 2. 리스트형을 Numpy 형으로 변환
# 3. Numpy에서 제공하는 기능 사용

# import numpy as np
# x = np.array([1,3,5])
# print(x.mean())

# data1 = [1,2,3,4,5]
# data2 = [1,2,3,3.5,4]
# arr1 = np.array(data1)
# arr1.shape

from msilib import sequence


f = open('data.txt', 'r', encoding='utf-8')
sequence = f.read()
sequence
