```java
import java.util.*;

/*
1. 정렬
2. 해시맵
3. 완전탐색

해시맵을 사용하여 풀이
완전 탐색은 전부 비교,
해시맵은 중복되지 않는 key값을 가지며, 해당 키의 value에 접근하는데 상수시간(O(1))이 걸림
*/
class Solution {
    
    //문자열 정렬
    //길이가 작고, 값도 작은 것이 뒤에 값에 포함될 수 있다.
    //길이가 짧은데 같다면 해당 길이까지 값이 같다면길이가 작은것이 앞에(값들이 하나 차이로 정렬되어있음) 접두어면 true,
    //아예 크거나 작으면 기준보다 앞이나 뒤에 오고 바로 앞과 비교시 startsWith시 false
    //그러므로 문자열 정렬을 통해 구할 수 있음
    //해시도 정렬하여 for문 한번으로 비교가능하지만.. 얘가 더 빠를듯.. 배열로 처리
    public boolean solution(String[] phoneBook) {
        Arrays.sort(phoneBook);
        boolean result = true;
        for (int i=0; i<phoneBook.length-1; i++) {
            if (phoneBook[i+1].startsWith(phoneBook[i])) {
                result = false;
                break;
            }
        }
        return result;
    
        
    /*
    static Map<String, Integer> map= new HashMap<>();
    
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        
        //해시맵에 해당 값들을 전부 입력 0
        //O(n)
        for(String s: phone_book){
            map.put(s, 0);
        }
        
        
        //O(n) = 1,000,000 * 20
        for(String s: phone_book){
            String prefix = "";
            
            for(int i = 0; i < s.length(); i++){
                prefix += s.charAt(i);
                
                //해당 키가 해시에 있다면, value에 +1
                //만약 value > 1 접두어가 있는 것이니 return false;
                if(map.containsKey(prefix)){
                    map.put(prefix, map.get(prefix) + 1);
                    
                    if(map.get(prefix) > 1)
                        return false;
                }
            }
        }
        
        return answer;
        
        
        //O(n^2)
        //완전 탐색
        //두번째 for문 0부터 안하면 안됨. 
        //앞이 접두어가 아니고, 뒤에 있는 것을 접두어로 사용할 수도 잇음
        for(int i = 0; i < phone_book.length; i++){
            for(int j = 0; j < phone_book.length; j++){
                if(i != j && phone_book[j].startsWith(phone_book[i]))
                    return false;
            }
        }
        
        return answer;
        */
    }
}



/*
import java.util.*;

class Solution {
    public boolean isPrefix(char[] prefix, String str)
    {
        for(int k = 0; k < prefix.length; k++)
            {
                if(prefix[k] != str.charAt(k))
                {
                    return false;
                }
            }
        return true;
    }
    
    public boolean solution(String[] phone_book) {
        boolean answer = true;
        for (int i = 0; i < phone_book.length; i++)
        {
            char[] prefix = phone_book[i].toCharArray();
            
            for (int j = 0; j < phone_book.length; j++)
            {
                if (i!=j && prefix.length <= phone_book[j].length())
                {
                    if(!isPrefix(prefix, phone_book[j]))
                        continue;
                    
                    return false;
                }
            }
        }
        return answer;
    }
}
/*
1,000,000 O(n^2), 시간 안 될줄 알았지만 될수도
하나만 있다면 true, 하나도 없다면 false
미리 체크하지 못한 점
    - prefix와 비교 문자열의 길이 차이
    - i 0~len, j i+1~len -> i 0~len, j 0~len
    - isPrefix라면 break, continue 차이
*/
```