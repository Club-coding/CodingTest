'''
스파이는 매일 다른 옷을 조합하여 입어 자신을 위장한다.
clothes = [["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]] 일 경우
 headgear 가 두개 eyewear 한개
 이렇게 판단
 왼쪽이 value 오른쪽이 key 값으로 보면 될것 같은데 ?

'''


def solution(clothes):
    answer =1
    cnt = 0
    dict = {}
    for v, k in clothes:
        dict.setdefault(k, []).append(v)
        cnt +=1
# 딕셔너리를 만드는 방법 세가지 setdefault, defaultdict , counter
    print(len(dict.values()))
    for val in dict.values():
        answer *= len(val)+1

   # return len(dict)*cnt -1 이렇게 했더니 len(dict) =1 인 케이스2에서 오류
    #( 의상의 수 + 1) * (의상의 수 +1 ) -1 = 경우의 수

    return answer -1

# gg

clothes = [["yellowhat", "headgear"], ["bluesunglasses", "eyewear"], ["green_turban", "headgear"]]
print(solution(clothes))