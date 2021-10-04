import java.util.*;

class Solution {
    public String solution(String s) {
        String answer = "";
        String[] nums = s.split(" ");
        int min = 10000000;
        int max = -100000000;
        List<Integer> list = new ArrayList<>();
        for(String num : nums){
            list.add(Integer.parseInt(num));
            //int n = Integer.parseInt(num);
            //max = Math.max(max, n);
            //min = Math.min(min, n);
        }
        Collections.sort(list);
        answer += list.get(0) + " " + list.get(list.size()-1);
        //answer += min + " " + max ;
        return answer;
    }
}