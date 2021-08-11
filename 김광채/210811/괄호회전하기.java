import java.util.*;

class Solution {
    public boolean isCorrect(LinkedList<Character> s){
        boolean result = true;
        Stack<Character> stack = new Stack<>();
        
        for(int i= 0; i < s.size(); i++){
            if(s.get(i) == ')'|| s.get(i) =='}' || s.get(i) == ']'){
                if(stack.isEmpty())
                    return false;
            }
            
            if(s.get(i) == ')'){
                if(stack.pop() != '('){
                    return false;
                }
            }else if(s.get(i) =='}'){
                 if(stack.pop() != '{'){

                    return false;
                }
            }else if( s.get(i) == ']'){
                 if(stack.pop() != '['){
                    return false;   
                }
            }else{
                stack.push(s.get(i));
            }
        }
        
        if(!stack.isEmpty()){
            return false;
        }
        
        return true;
    }
    
    public int solution(String s) {
        int answer = 0;
        LinkedList<Character> list = new LinkedList<>(); 
        for(int i= 0; i < s.length();i++){
            list.add(s.charAt(i));
        }
        for(int i = 0; i < s.length(); i++){
          
            char c = list.removeFirst();
            list.add(c);
            if(isCorrect(list)){
                
                answer++;
            }
        }
        return answer;
    }
}