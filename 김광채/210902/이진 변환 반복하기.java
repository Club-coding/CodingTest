import java.util.*;

class Solution {
    static int zeroCount = 0;
    static int changeCount = 0;
    
    public void make(String s){
        int zero = 0;
        int len = s.length();
        for(int i = 0; i < len; i++){
            if(s.charAt(i) == '0'){
                zero++;
            }
        }
        zeroCount += zero;
        changeCount++;
        int changeStr = len-zero;
        
        if(changeStr == 1){
            return;
        }
        
        make(Integer.toBinaryString(changeStr));
        
    }
    
    public int[] solution(String s) {
        int[] answer = {0, 0};
        make(s);
        answer[0] = changeCount;
        answer[1] = zeroCount;
        return answer;
    }
}