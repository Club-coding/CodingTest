import java.util.*;

class Solution {
    public String[] solution(String[] record) {
        String[] answer = {};
        List<String> answerList = new ArrayList<>();
        String[][] splitRecords = new String[record.length][3];
        // 전체돌며 split으로 리스트를 만들어준다.
        // idx 1(아이디), 2(닉네임)을 hash로 만들어준다.
        // 다시 전체를 돌며 idx 0이 enter면 들어왔습니다, Leave면 나갔습니다.로 만들기
        // => 전체 마지막의 아이디와 연결된 닉네임으로 모든 것이 출력되기 때문
        Map<String, String> map = new HashMap<>();

        for(int i = 0; i < record.length; i++){
            splitRecords[i] = record[i].split(" ");
            if(splitRecords[i][0].charAt(0) != 'L'){
                map.put(splitRecords[i][1], splitRecords[i][2]);
            }
        }
        
        for(int i = 0; i < splitRecords.length; i++){
            if(splitRecords[i][0].charAt(0) == 'E'){
                answerList.add(map.get(splitRecords[i][1])+"님이 들어왔습니다.");
            }else if(splitRecords[i][0].charAt(0) == 'L'){
                answerList.add(map.get(splitRecords[i][1])+"님이 나갔습니다.");
            }
        }
        
        answer = new String[answerList.size()];
        for(int i = 0; i < answerList.size(); i++){
            answer[i] = answerList.get(i);
        }
        
        return answer;
    }
}








/*
import java.util.*;
class Solution {
    public String[] solution(String[] record) {
        String[] answer;
        ArrayList<String> result = new ArrayList<>();
        HashMap<String,String> map = new HashMap<String, String>();
        
        //HashMap으로 아이디 닉네임 최신화 (최종 아이디 닉네임만 알고 있으면 되기 때문)
        for(int i = 0; i < record.length; i++){
            String[] sentence = record[i].split(" ");
            if(sentence[0].equals("Enter") || sentence[0].equals("Change")){
                map.put(sentence[1], sentence[2]);
            }
            //if(map.containsKey(record[1])) put을 하면 갱신되기에 확인할 필요 없음
        }
        
        for(int i = 0; i < record.length; i++){
            String[] sentence = record[i].split(" ");
            if(sentence[0].equals("Enter")){
                result.add(map.get(sentence[1])+"님이 들어왔습니다.");
            }else if(sentence[0].equals("Leave")){
                result.add(map.get(sentence[1])+"님이 나갔습니다.");            
            }
        }
        
        answer = new String[result.size()];
        for(int i = 0; i < result.size(); i++){
            answer[i] = result.get(i);
        }
        return answer;
    }
}
*/