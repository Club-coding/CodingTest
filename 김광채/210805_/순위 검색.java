import java.util.*;

class People implements Comparable<People>{
    Map<Integer, String> info;
    int score;
    
    People(Map<Integer, String> info, int score){
        this.info = info;
        this.score = score;
    }
    
    @Override
    public int compareTo(People p){
        if(p.score < this.score){
            return -1;
        }
        return 1;
    }
}

//이분탐색??
/*
각 사람 정보를 ArrayList에 저장. info는 맵으로(앞글짜만 따서 String), socre 두 개 변수
사람 ArrayList를 점수를 기준으로 내림차순

쿼리를 돌며 쿼리를 맵으로 만들어도됨(정규식 문자열로 만듦)
for query
  for peoples
  점수이상 && 쿼리 정규식과 people 일치 count++
  점수가 불일치하면 peoples for문 break;

*/
class Solution {
    static int LANGUAGE = 0;
    static int JOB = 1;
    static int CAREER = 2;
    static int FOOD = 3;
    static int SCORE = 4;
    
    public int[] solution(String[] info, String[] query) {
        Map<String, String> m = new HashMap<>();
        
        int[] answer = {};
        List<Integer> listAnswer = new ArrayList<Integer>();
        List<People> peoples = new ArrayList<>();
        
        //peoples 세팅
        for(String i : info){
            Map<Integer,String> map = new HashMap<Integer, String>();
            String[] splitInfo = i.split(" ");
            for(int j = 0; j < 4; j++){
                map.put(j, splitInfo[j]);
            }
            peoples.add(new People(map, Integer.parseInt(splitInfo[4])));
        }
        
        Collections.sort(peoples);
        
        for(String s : query){
            int count = 0;
            
            //쿼리 세팅(info, query 세팅 함수로 리팩토링)
            s = s.replace(" and ", " ");
            String[] splitQuery = s.split(" ");
            Map<Integer,String> map = new HashMap<Integer, String>();
            for(int j = 0; j < 4; j++){
                if(!splitQuery[j].equals("-")){
                     map.put(j, splitQuery[j]);
                }
            }
            int queryScore = Integer.parseInt(splitQuery[SCORE]);
            //쿼리와 peoples 비교
            for(int i = 0; i < peoples.size(); i++){
                if(queryScore <= peoples.get(i).score){
                    boolean isSame = true;
                    for(int key : map.keySet()){
                        if(!map.get(key).equals(peoples.get(i).info.get(key))){
                            isSame = false;
                            break;
                        }     
                    }
                    if(isSame){
                        count++;
                    }
                    
                }else{
                    break;
                }
                
                
            }
            
            listAnswer.add(count);
        }
        
        answer = new int[listAnswer.size()];
        for(int i = 0; i < listAnswer.size(); i++){
            answer[i] = listAnswer.get(i);
        }
        return answer;
    }
}