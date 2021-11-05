def solution(skill, skill_trees):
    answer = 0
    for s in skill_trees:
        cnt = -1
        for i in s:
            if i in skill:
                cnt += 1
                if skill[cnt] != i:
                    break
        else:
            answer += 1
    return answer