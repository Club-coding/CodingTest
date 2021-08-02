import copy

def solution(name):
    answer = 0
    name = list(name)
    alph = [chr(i) for i in range(65, 91)]

    q = []
    #인덱스, 타겟단어와의 거리
    start = [0,0, ['A' for i in range(len(name))]]
    q.append(start)

    while len(q) > 0 :
        word = copy.deepcopy(q.pop(0))

        # 해당 타겟 단어의 인덱스와 거리구해서 더하기
        word[1] += min(ord(name[word[0]])-ord(alph[0]), len(alph)-(ord(name[word[0]])-ord(alph[0])))

        #name과 타겟이 같은지 보기
        word[2][word[0]] = name[word[0]]
        if word[2] == name:
            return word[1]

        #word[0]-1, word[0]+1 인덱스 큐에 넣기
        word[1] += 1

        temp = word[:]
        word[0] -= 1
        if word[0] < 0:
            word[0] %= len(name)
        q.append(word)

        temp[0] += 1
        temp[0] %= len(name)
        q.append(temp)

    return answer