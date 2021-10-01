class Solution {
    
    public int countOne(String binary){
        int oneNum = 0;
        
        for(int i = 0; i < binary.length(); i++){
            if (binary.charAt(i) == '1')
                oneNum++;
        }
        
        return oneNum;
    }
    
    public int solution(int n) {
        int answer = 0;
        int oneNumOfN = 0;
        String binaryN = Integer.toBinaryString(n);
        oneNumOfN = countOne(binaryN);
        answer = n+1;
        
        while(true){
            String binaryAnswer = Integer.toBinaryString(answer);
            int oneNumOfAnswer = countOne(binaryAnswer);
            if(oneNumOfN == oneNumOfAnswer)
                break;
            answer++;
        }
        
        return answer;
    }
}