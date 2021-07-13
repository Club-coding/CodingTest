import java.util.*;

class Solution {
    public int solution(String[][] clothes) {
        int answer = 1;
        HashMap<String, Integer> hm = new HashMap<>();
        //getOrDefault : clothes[i][1]키의 value가 있다면 그것을 반환하고 아니면 기본값으로 지정된 0반환
        for(int i = 0; i<clothes.length; i++)
            hm.put(clothes[i][1], hm.getOrDefault(clothes[i][1], 0) + 1);

        //{n,m,p개}들의 경우의수는 (n+1)(m+1)(p+1)-1
        for (String i : hm.keySet()) 
            answer*=hm.get(i)+1;
        
        return answer-1;
    }
}