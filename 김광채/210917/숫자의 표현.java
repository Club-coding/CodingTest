class Solution {
    public int solution(int n) {
        int answer = 0;
        int sum = 0;
        int right = 0;
        
        //투포인터
        for(int left = 1; left <= n; left++){
            
            while(sum <= n){
                if(sum >= n){
                    if(sum == n)
                        answer++;
                    break;
                }
                right++;
                sum += right;
            }
            
            sum -= left;
        }
        
        return answer;
    }
}