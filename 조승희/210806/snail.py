from math import ceil
a, b, v = map(int, input().split())
print(ceil((v-a)/(a-b))+1)
# 마지막 a를 빼고 a-b한 값으로 나눈다
# a만큼 올라가는 마지막 날을 더한다