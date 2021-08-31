import java.util.*;

class Solution {
    public int[] solution(int n, String[] words) {
        int[] answer = {0, 0};
        int[] countN = new int[n];
        int now = 0;
        Map<String, Integer> wordAndCount = new HashMap<>();
        char beforeEnd = words[0].charAt(0);
        
        for(String word : words){
            
            if(word.charAt(0) != beforeEnd || word.length() <= 1 || wordAndCount.containsKey(word)){
                answer[0] = now + 1;
                answer[1] = countN[now]+1;
                break;
            }
            
            countN[now] += 1;
            now = (now+1) % n;
            wordAndCount.put(word, 1);
            beforeEnd = word.charAt(word.length() - 1);
        }
        
        return answer;
    }
}