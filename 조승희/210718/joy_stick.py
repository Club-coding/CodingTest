def solution(name):
    check = []
    answer = 0
    for i in range(len(name)):
        if name[i] != 'A' and i != 0:
            check.append(i)
        if ord(name[i]) <= 78:
            answer += ord(name[i])-65
        else:
            answer += 91-ord(name[i])
    
    cursor = 0
    while check:
        if cursor < check[-1]:
            left = len(name)-check[-1]+cursor
        else:    
            left = cursor - check[-1]
        if cursor <= check[0]:
            right = check[0]-cursor
        else:
            right = len(name)-cursor+check[0]
        if left >= right:
            way = 'right'
        else:
            way = 'left'
        if way == 'left':
            answer += left
            cursor = check[-1]
            check.pop()
        else:
            answer += right
            cursor = check[0]
            check.pop(0)
    return answer
##두번째 시도###########################################################
# def solution(name):
#     check = []
#     answer = 0
#     for i in range(len(name)):
#         if name[i] != 'A' and i != 0:
#             check.append(i)
#         if ord(name[i]) <= 78:
#             answer += ord(name[i])-65
#         else:
#             answer += 91-ord(name[i])
#     cursor = 0
#     for c in check:
#         if cursor < c:
#             answer += min(c-cursor, len(name)-c+cursor)
#         else:
#             answer += min(cursor-c, len(name)-cursor+c)
#         cursor = c
#     return answer

#첫번째 시도######################################################
# def solution(name):
#     answer = 0
#     cursor = 0
#     for i in range(len(name)):
#         if i > 0 and name[i] != 'A':
#             if name[cursor:i].count('A')>name[i:].count('A')+1:
#             cursor 
#             36+= 1
#         else:
            
#         if ord(name[i]) <= 78:
#             answer += ord(i)-65
#         else:
#             answer += 91-ord(name[i])
#     answer += len(name)-1 - name.count('A')
#     return answer