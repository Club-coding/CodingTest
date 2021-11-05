import java.util.*;

class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        
        Stack<Character> stack = new Stack<>();
        
        for(int i = 0; i < s.length(); i++){
            if(stack.isEmpty()){
                stack.push(s.charAt(i));
            }else{            
                if(stack.peek() == s.charAt(i)){
                    stack.pop();
                }else{
                    stack.push(s.charAt(i));
                }    
            }
        }
        
        if(stack.isEmpty()){
            return 1;
        }
        
        return answer;
    }
}





/*
class Solution
{
    public int solution(String s)
    {
        int answer = 0;
        boolean changeFlag = true;
        
        char[] charArr = s.toCharArray();
        ArrayList<Character> arr = new ArrayList<>();
        for(char i : charArr){
            arr.add(i);
        }
        
        while(arr.size() > 0 && changeFlag){
            changeFlag = false;
            for(int i = 0; i < arr.size()-1; i++){
                if(arr.get(i) == arr.get(i+1)){
                    arr.remove(i);arr.remove(i);
                    changeFlag = true;
                    break;
                }
            }
        }
        
        if(arr.size() == 0)
            answer = 1;
        else
            answer = 0;

        return answer;
    }
}
*/