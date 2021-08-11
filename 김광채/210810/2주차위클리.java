class Solution {
    
    public String makeScore(int score, int n){
        score = score / n;
        String[] scores = {"A", "B", "C", "D", "F"};
        
        if(score >= 90){
            return scores[0];
        }else if(score >= 80){
            return scores[1];
        }else if(score >= 70){
            return scores[2];
        }else if(score >= 50){
            return scores[3];
        }else{
            return scores[4];
        }
        
    }
    
    public String solution(int[][] scores) {
        String answer = "";
        int[] sum = new int[scores.length];
        StringBuffer sb = new StringBuffer();
        
        for(int c = 0; c < scores.length; c++){
            boolean isMax = true;
            boolean isMin = true;
            boolean isUnique = true;
            for(int r = 0; r < scores.length; r++){
                if(c == r){
                    continue;
                }
                
                sum[c] += scores[r][c];
                
                if(scores[c][c] == scores[r][c]){
                    isUnique = false;
                }else if(scores[c][c] < scores[r][c]){
                    isMax = false;
                }else if(scores[c][c] > scores[r][c]){
                    isMin = false;
                }
            }
            
            if((isUnique && isMax) || (isUnique && isMin)){
                sb.append(makeScore(sum[c], scores.length-1));
            }else{
                sum[c] += scores[c][c];
                sb.append(makeScore(sum[c], scores.length));
            }
            
            
        }
        
        return sb.toString();
    }
}