class Solution {
    static int answer = 0;
    static int count = 0;
    static String[] alph = {"A", "E", "I", "O", "U"};
    static int depth = 5;
    
    public void find(int nowDepth, String output, String target){

        if(target.equals(output)){
            answer = count;
        }
        
        if(answer > 0 || nowDepth == depth){
            return;
        }
        

        for(int i = 0; i < 5; i++){
            count++;
            find(nowDepth + 1, output + alph[i], target);
        }
    }
    
    public int solution(String word) {
        find(0, "", word);
        return answer;
    }
}