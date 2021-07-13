```java
import java.util.*;

/*
1. ����
2. �ؽø�
3. ����Ž��

�ؽø��� ����Ͽ� Ǯ��
���� Ž���� ���� ��,
�ؽø��� �ߺ����� �ʴ� key���� ������, �ش� Ű�� value�� �����ϴµ� ����ð�(O(1))�� �ɸ�
*/
class Solution {
    
    //���ڿ� ����
    //���̰� �۰�, ���� ���� ���� �ڿ� ���� ���Ե� �� �ִ�.
    //���̰� ª���� ���ٸ� �ش� ���̱��� ���� ���ٸ���̰� �������� �տ�(������ �ϳ� ���̷� ���ĵǾ�����) ���ξ�� true,
    //�ƿ� ũ�ų� ������ ���غ��� ���̳� �ڿ� ���� �ٷ� �հ� �񱳽� startsWith�� false
    //�׷��Ƿ� ���ڿ� ������ ���� ���� �� ����
    //�ؽõ� �����Ͽ� for�� �ѹ����� �񱳰���������.. �갡 �� ������.. �迭�� ó��
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
        
        //�ؽøʿ� �ش� ������ ���� �Է� 0
        //O(n)
        for(String s: phone_book){
            map.put(s, 0);
        }
        
        
        //O(n) = 1,000,000 * 20
        for(String s: phone_book){
            String prefix = "";
            
            for(int i = 0; i < s.length(); i++){
                prefix += s.charAt(i);
                
                //�ش� Ű�� �ؽÿ� �ִٸ�, value�� +1
                //���� value > 1 ���ξ �ִ� ���̴� return false;
                if(map.containsKey(prefix)){
                    map.put(prefix, map.get(prefix) + 1);
                    
                    if(map.get(prefix) > 1)
                        return false;
                }
            }
        }
        
        return answer;
        
        
        //O(n^2)
        //���� Ž��
        //�ι�° for�� 0���� ���ϸ� �ȵ�. 
        //���� ���ξ �ƴϰ�, �ڿ� �ִ� ���� ���ξ�� ����� ���� ����
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
1,000,000 O(n^2), �ð� �� ���� �˾����� �ɼ���
�ϳ��� �ִٸ� true, �ϳ��� ���ٸ� false
�̸� üũ���� ���� ��
    - prefix�� �� ���ڿ��� ���� ����
    - i 0~len, j i+1~len -> i 0~len, j 0~len
    - isPrefix��� break, continue ����
*/
```