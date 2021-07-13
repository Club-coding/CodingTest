'''
테스트 11 19 효율성 4 실패

def solution(phone_book):
    a = len(min(phone_book))#119
    s = {}
    for i in phone_book:
        s.setdefault(i[:a],i)
    if len(s) == len(phone_book):
        return True
    else:
        return False
'''


def solution(phone_book):
    phone = sorted(phone_book)
    for i,j in zip(phone, phone[1:]):
        print(i,j)
        if j.startswith(i):
            return False
    return True

# gg
phone_book = ["524421", "97674223", "119","4312129","1923","121199"]
print(solution(phone_book))