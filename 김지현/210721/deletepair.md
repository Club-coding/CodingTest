## 짝지어 제어하기

<pre>
<code>
    def solution(s):
        s = list(s)
        stack = []
        stack.append(s[0])
        for i in s[1:]:
            if len(stack) == 0:
                stack.append(i)
            elif stack[-1] == i:
                stack.pop()
            else:
                stack.append(i)
        if len(stack) == 0:
            return 1
        else:
            return 0


</code>
</pre>