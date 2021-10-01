import java.util.*;

class Solution {
    private Map<Integer, String> map = new HashMap<>();
    
    public String make(int num, int n){
        StringBuilder sb = new StringBuilder();
        // 문제지점
        if(num == 0)
            return "0";
        
        while(num > 0){
            sb.append(String.valueOf(num % n >= 10? map.get(num % n ): num % n));
            num /= n;
        }
        return sb.reverse().toString();
    }
    
    public String solution(int n, int t, int m, int p) {
        // 고민1
        for(int i = 0; i <= 5; i++){
            map.put(i + 10, String.valueOf((char)(65 + i)));
        }
        
        String answer = "";
        int totalCount = 0;
        int tubeCount = 0;
        
        StringBuilder sb = new StringBuilder();
        for(int i = 0; i <= 100000; i++){
            
            String s = make(i, n);
            
            for(int j = 0; j < s.length(); j++){
                totalCount++;
                
                // 고민2
                if((totalCount - 1) % m == p-1){
                    tubeCount++;
                    sb.append(s.charAt(j));
                    
                    //sb.size() == t 도 가능하다
                    if(tubeCount == t){
                        return sb.toString();
                    }
                }
            }
            
        }
        
        return answer;
    }
}