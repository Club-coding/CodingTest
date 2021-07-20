def solution(people, limit):
    answer = 0
    people.sort()
    left = 0
    right = len(people)-1
    while left <= right:
        answer += 1
        if left == right:
            break
        if people[left] + people[right] > limit:
            right -= 1
            
        elif people[left] + people[right] <= limit:
            left += 1
            right -= 1
        
    return answer