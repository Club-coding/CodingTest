import java.util.*;

class Solution {
    public int solution(int cacheSize, String[] cities) {
        int answer = 0;
        final int HIT = 1;
        final int MISS = 5;
        LinkedList<String> deque = new LinkedList<>();
        
        for(String city : cities){
            String lowerCity = city.toLowerCase();
            int index = deque.indexOf(lowerCity);
            
            if(index > -1){
                answer += HIT;
                deque.remove(lowerCity);
                deque.add(lowerCity);
            }else{
                answer += MISS;
                
                if(cacheSize <= deque.size()){
                    deque.poll();
                }
                
                // 예최 처리 필요..놓침
                if(cacheSize > 0){
                    deque.add(lowerCity);
                }
                
            }
        }
        
        return answer;
    }
}