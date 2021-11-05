> **[JadenCase 문자열 만들기](https://programmers.co.kr/learn/courses/30/lessons/12951)**

```java
class Solution {
    public String solution(String s) {
        char[] ch = s.toCharArray();
        //A 65,  a 97
        if(97<=(int)ch[0] & 121>=(int)ch[0])
            ch[0] = (char)((int)ch[0]-32); //맨앞 글자가 소문자이면
        
        for(int i = 0; i<ch.length-1; i++){
            if(ch[i]==' '& 97<=(int)ch[i+1] & 121>=(int)ch[i+1]) //공백 다음 글자가 소문자이면
                ch[i+1] = (char)((int)ch[i+1]-32);
            else if(ch[i]!=' '& 65<=(int)ch[i+1] & 90>=(int)ch[i+1]) //공백이 아니고 다음글자가 대문자이면
                ch[i+1] = (char)((int)ch[i+1]+32);
        }
        
        return new String(ch);
    }
}
```

