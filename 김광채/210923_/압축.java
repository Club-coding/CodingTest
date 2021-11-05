/*
        1. 해시맵<string, int> A ~ Z 입력
        2. 현재 입력에서 길이 1~msg.length 사전에서 없을 때까지 찾기( w = 제일 긴 문자열 찾기), 실패 이전 길이의 문자열의 사전 값 출력
        3. msg = msg.substring(현재 입력 길이);
        4. 현재 입력 + 다음 글자 사전 찾기
        = 제일 긴 문자열로 사전(w)을 찾았기에 + c 했을 시 사전에 등록 되야함 ** 증명 필요
        5. 2번으로
*/

import java.util.*;

class Solution {
    public Integer[] solution(String msg) {
        Integer[] answer = {};
        List<Integer> outputs = new ArrayList<>();
        String s = new String(msg);
        int keyLength = 27;
    
        // 1번 조건: A(65)~Z(90)
        Map<String, Integer> map = new HashMap<>();
        for(int i = 1; i <= 26; i++){
            map.put(String.valueOf((char)(i + 64)), i);
            //System.out.println(map.get(String.valueOf((char)(i + 64))));
        }
        
        while(s.length() > 0){
            // 2번 조건
            String findS = "";
            for(int i = 0; i < s.length(); i++){
                findS += s.charAt(i);
                
                // 마지막 문자열은 항상 사전에 있어서 이 곳에 못 들어감
                if(!map.containsKey(findS)){
                    findS = findS.substring(0, i);
                    outputs.add(map.get(findS));
                    break;
                }
            }

            // 마지막 문자열은 항상 사전에 있다. 길이 1 사전도 있기 때문이다.
            // 마지막 문자열은 위에서 if문에 들어가지 않음
            // 또한 해당 문자열이 남은 문자열과 길이가 같다.
            if(findS.length() == s.length()){
                outputs.add(map.get(findS));
                break;
            }
            //System.out.println(findS);

            // 3번 조건
            s = s.substring(findS.length());
            //System.out.println(s);

            // 4번 조건
            map.put(findS + s.charAt(0), keyLength++);
            //System.out.println(map.get(findS + s.charAt(0)));
        }
        answer = outputs.toArray(new Integer[outputs.size()]);
        return answer;
    }
}