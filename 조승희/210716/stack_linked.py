class Linked:
    def __init__(self, n):
        self.data = n
        self.myNext = None
        self.myPrev = None
n = int(input())
stack = []
start = None
end = None
count = 0
for i in range(n):
    command = input()
    if command[-1].isdigit():
        command, num = command.split()
        
    if command == 'push':
        e = Linked(int(num))
        if start == None and end == None:
            start = e
            end = e
        else:
            end.myNext = e
            e.myPrev = end
            end = end.myNext
        count += 1
        
    elif command == 'pop':
        if count == 0:
            print(-1)
        else:
            print(end.data)
            if count == 1:
                start = None
                end = None
            else:
                end = end.myPrev
                end.myNext = None
            count -= 1    
    elif command == 'top':
        if count == 0:
            print(-1)
        else:
            print(end.data)
    
    elif command == 'size':
        print(count)
    
    elif command == 'empty':
        if count == 0:
            print(1)
        else:
            print(0)
        
            