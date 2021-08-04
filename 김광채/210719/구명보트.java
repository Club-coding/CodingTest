import java.util.*;

class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        Arrays.sort(people);
        LinkedList<Integer> peoples = new LinkedList<>();
        for(int i : people){
            peoples.add(i);
        }
            
        while(!peoples.isEmpty()){
            int max = peoples.peekLast();
            
            if(max + peoples.peek() <= limit){
                peoples.removeLast();
                //remove시 요소가 없을경우 에러
                peoples.poll();
            }else{
                peoples.removeLast();
            }
            answer++;
        }
        return answer;
    }
}





/*
class Solution {
    public int solution(int[] people, int limit) {
        int answer = 0;
        int max = 0;
        //boolean flag = true;
        Arrays.sort(people);  //sort 후 max값을 최대한 2명으로 태우는 것이 효율적
        //아래 hint
        LinkedList<Integer> list = new LinkedList<>();
        for (int i : people)
            list.add(i);
        
        while(!list.isEmpty()){
            max = list.removeLast();
            if(!list.isEmpty() && max+list.get(0) <= limit){
                list.remove(0);
                answer++;
            }
            else
                answer++;
            
            // 주석
            flag = true;
            for(int i = 0; i < list.size(); i++){
                if (max+list.get(i) <= limit){
                    list.remove(i);
                    answer++;
                    break;
                    flag = false;
                }
            }
            if(flag)
                answer++;
            // 주석
        }
        
        return answer;
    }
}
*/
//=> 더나아가 2명을 태우기 위해 max+min<=limit 인데 min이 안되면 무조건 한명만 탈 수 있다는 소리가 된다. = 이 점을 놓침