import java.util.*;

//교집합만 구하면, a u b : a 집합 길이 + b 집합 길이 - 교집합
// 주요 이슈: a n b : 다중 집합 고려한 교집합 갯수구하기 알고리즘 (중복 원소 포함)
class Solution {
    
    // aa1+aa2 는 aa, aa, aa가 아니라 aa, aa가 나와야한다.
    // 원래 알파벳만 추출 후 그 문자열에서 집합을 만듦 => 제대로된 집합 안 나옴
     public List<String> makeSet(String s){
        s = s.toLowerCase();
        List<String> set = new ArrayList<>();
        for(int i = 0; i < s.length()-1; i++){
            if(isOnlyAlph(s.charAt(i)) && isOnlyAlph(s.charAt(i+1))){
                set.add(String.valueOf(s.charAt(i)) + String.valueOf(s.charAt(i+1)));
            }
        }
        
        return set;
    }
    
    public boolean isOnlyAlph(char c){
        if((c >= 65 && c <= 90) ||
              c >= 97 && c < 123){
            return true;
        }
        
        return false;
    }
    
    public int getIntersecSize(List<String> s1, List<String> s2){
        int intersectionSize = 0;
        boolean[] visited = new boolean[s2.size()];
        for(int i = 0; i < s1.size(); i++){
            for(int j = 0; j < s2.size(); j++){
                if(!visited[j] && s1.get(i).equals(s2.get(j))){
                    intersectionSize++;
                    visited[j] = true;
                    break;
                }
            }
        }
        return intersectionSize;
    }
    
    
    public int solution(String str1, String str2) {
        int answer = 0;
        List<String> set1 = makeSet(str1);
        List<String> set2 = makeSet(str2);
        int intersectionSize = getIntersecSize(set1, set2);
        int union = set1.size() + set2.size()- intersectionSize;
        
        double jaccard = intersectionSize / (double)union;
        
        //System.out.println(set1.size() + set2.size() - intersectionSize);
        //System.out.println(intersectionSize
        //System.out.println(jaccard);
        if(union == 0 && intersectionSize == 0){
            jaccard = 1;
        }
        answer = (int)Math.floor(jaccard * 65536);
        return answer;
    }
}


