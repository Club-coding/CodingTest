def solution(phone_book):
    phone_book.sort()
    for i in range(len(phone_book)-1):
        if phone_book[i+1].startswith(phone_book[i]):
            return False
            
    return True

# 처음에 길이를 기준으로 sort했는데 안됨
# 그냥 sort하면 비교하기가 쉽다는 걸 알게됨