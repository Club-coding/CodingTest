class Solution {
    public String solution(int n) {
        // 0이면 4
        String[] ends = {"4", "1", "2"};
        String[] dp = new String[n+1];
        if(n < 4)
            return ends[n];

        dp[1] = "1"; dp[2] = "2"; dp[3] = "4";
        for(int i = 4; i <= n; i++){
            int endNIdx = i % 3;
            int restNIdx = i % 3 == 0? (int)i / 3 - 1 : (int)i / 3;
            dp[i] = "";
            dp[i] += dp[restNIdx] + ends[endNIdx];
        }
        
        return dp[n];
        
    }
}





//2020.5.14
//3:34~ 5:13
//1,2,4를 저장한 배열
// 1. 진법 구하는 것을 적용시켜봄 -> 규칙이 나옴
// =>나머지가 0일 때는 dp[몫-1]+124arr[나머지]
//            0이 아닐 때는 dp[몫]+124arr[나머지]  --> 5억번 돌아야함 -> 메모리 초과
// 한번에 구하는 법 answer = 몫이4이하로 나올때까지+answer
/*
class Solution {
    public String solution(int n) {
        String answer = "";
        int rmd;
        while(n > 0){
            rmd = n%3;
            n = n/3;
            
            if(rmd == 0){
                n -= 1;
                rmd = 4;
            }
            
            answer = String.valueOf(rmd) + answer;
        }
  */      
        //n/3 이 아닌 n%3을 기준으로 해야 4로 끝나는 애들을 다룰 수 있다. 배열도 만들 필요 없음
        // 얼마나 얕게 생각하고 대충생각하는지 느끼기, 논리적이지 못함, 구체적으로 어떻게 논리적이지 못한지 정리해보기
        // 0일때 "4"로 만들지 않고 그냥 문자열 4를 넣엇어야했다. 더 큰 수들이 나올 때를 고려하지 못함
        //유사코드를 작성하지 않고 머리로만 생각하여 구체적이지 못함
        /*
        String[] arrPor = {"0","1", "2", "4"};
        String[] arr124  = {"4", "1", "2", "4"};
        if(n < 3 ){
            return answer = arr124[n%3] + answer;
        }
        while( n / 3 > 0){
            answer = arr124[n%3] + answer;
            n = n/3;
        }
        if(answer.charAt(answer.length()-1) == '4'){
            n = n-1;
            if(n > 0)
                answer = arrPor[n%3] + answer;
        }else{
            answer = arr124[n%3] + answer;   
        }
        */
        
//        return answer;
//    }
//}