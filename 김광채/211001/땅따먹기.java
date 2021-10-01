class Solution {
    
    int solution(int[][] land) {
        int answer = 0;
        // 키 포인트: 같은 행의 제일 큰 것을 밟으면 되지만 이전 칸은 밟을 수 없는 제약사항으로 항상 충족 X,
        // dp로 완전 탐색식으로 자신을 제외한 이전 칸 중 제일 큰 값을 더해서 갱신하며 해당 칸까지의 제일 큰 값을 유지
        int[][] dp = new int[land.length][4];
        
        for(int i = 0; i < 4; i++){
            dp[0][i] = land[0][i];
        } 
        
        for(int i = 1; i < land.length; i++){
            for(int j = 0; j < 4; j++){
                
                int max = 0;
                for(int k = 0; k < 4; k++){
                    if(k != j){
                        max = Math.max(max, dp[i-1][k]);
                    }
                }
                
                dp[i][j] = land[i][j] + max;
            }
        }
        
        for(int k = 0; k < 4; k++){
            answer = Math.max(answer, dp[land.length - 1][k]);
        }
        // [실행] 버튼을 누르면 출력 값을 볼 수 있습니다.
        System.out.println("Hello Java");

        return answer;
    }
}