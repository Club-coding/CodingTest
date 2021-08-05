public class Solution{

    public static long solution(int price, int money, int count) {
        long answer = -1;
        answer = (long)((long)count * ((long)(price + price * count)))/ 2;
        System.out.println(answer);
        answer = money - answer;
        
        answer = answer < 0 ? -answer: 0;
        
        return answer;
    }  

    public static void main(String[] args) {
        System.out.println(solution(2500, 1183, 2500));

        /*
        //price, count 
        //홀수 홀수: 홀수인 경우 x
        //홀수 짝수: 홀수인 경우 x
        //짝수 홀수: 홀수인 경우 x
        //짝수 짝수: 홀수인 경우 x
        int i = 2; // price
        int j = 1; //카운트
        int c = 0;
        while(true){
            if(j * (i + i * j) % 2 != 0){
                System.out.println("가격: " + i + " count: " + j);
            }
            i += 2;
            j++;
            c++;
            if(c == 10000){
                break;
            }
        
        }
        */
    }
}
