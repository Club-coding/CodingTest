package club;

public class jcont1 {

    public static int gcd(int a, int b){ 
        if(b == 0)
            return a;
        return gcd(b, a % b); 
    }

    public static int lcm(int a, int b){

        return (a * b) / gcd(a,b);
    }

    //mod1 나누어떨어지지만, mod2 나누어 떨어지지 않는 수의 갯수
    public static int solution(int mod1, int mod2, int max_range){
        int answer = 0;

        int mod1MultipleNum = max_range / mod1; 
        int lcmNum = max_range / lcm(mod1, mod2);

        answer = mod1MultipleNum - lcmNum;
        return answer;
    }

    public static void main(String[] args) {
        System.out.println(solution(4, 3, 20) == test(4, 3, 20));
        System.out.println(solution(3, 4, 20) == test(3, 4, 20));
        System.out.println(solution(5,7, 1000000) == test(5,7, 1000000));
    }

    public static int test(int mod1, int mod2, int max_range){
        int count = 0;

        for(int i = 1; i <= max_range; i++){
            if(i % mod1 == 0 && i % mod2 != 0){
                count++;
            }
        }

        return count;
    }
}
