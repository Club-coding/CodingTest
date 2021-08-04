import java.util.*;

class Solution {
    public String solution(String number, int k) {
        StringBuilder sb = new StringBuilder();
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < number.length(); i++){
            while(!stack.isEmpty() && stack.peek() < number.charAt(i) && k-- > 0){
                stack.pop();
            }
            stack.push(number.charAt(i));
        }
        
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        
        return sb.reverse().toString();
    }
}


//앞뒤 특정한 위치에서 짜르는 경우가 아니라 뒤를 계속 써야한다면 투포인터써보기, 뒤 자르는 경우도 투포인터 쓰는 경우 있을 듯
//서브스트링이 아닌 투포인터로 풀어야 시간 초과를 없앨 수 잇음
/*
class Solution {
    
    public String solution(String number, int k) {
        StringBuffer sb = new StringBuffer();
        String answer = "";
        // 이것 계속 고려못하고 k를 넣음
        int endPoint = number.length() - k;
        String removedNumber = new String(number);
        while(sb.toString().length() < number.length() - k){
            int idx = 0;
            //System.out.println(removedNumber + " " + endPoint);
            for(int i = 0; i <= removedNumber.length() - endPoint; i++){
                // =를 안해주면 같은 값이 있을때 제일 뒤에 값을 선택한다. 99991일 때 마지막 9를 선택, 다음에 9를 선택 못함
                idx = removedNumber.charAt(idx) >= removedNumber.charAt(i) ? idx : i;
            
            }
            
            //answer += removedNumber.charAt(idx);
            sb.append(removedNumber.charAt(idx));
            endPoint--;
            removedNumber = removedNumber.substring(idx + 1);
        }
        
        return sb.toString();
  */      
        /*
        numbers = number.toCharArray();
        
        //permutation 은 visited가 필요.
        //순서가 다르면 다른 것이기에 처음부터 모든 경우를 보며 어디를 사용했는지, 안 했는지 판별하기 위해 visited가 필요.
        //combination visited 불 필요, 순서가 상관 x, 항상 현재보다 다음의 리스트를 사용
        
        combination("", 0, 0, number.length() - k);
        return answer;
        */
    //}
    
    /*
    public void combination(String output, int nowIdx, int depth, int endDepth){
        if(depth == endDepth){
            answer = output.compareTo(answer) < 0 ? answer : output;
            return;
        }
        
        for(int i = nowIdx; i < numbers.length; i++){
            combination(output +numbers[i], i + 1, depth + 1, endDepth);
        }      
    }
    */
//}