import java.util.*;

public class Main{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int z =0;
        long ans = 0;
        long[] alpha = new long['J'-'A'+ 1];
        boolean[] check = new boolean['J'-'A' + 1];
        for(int i=0; i<N; i++){ 
            String num = sc.next();

            //   각 자릿수 만큼을 더해서 기여도를 계산한다
            int d= 1;
            check[num.charAt(0) - 'A'] = true; //첫째 자리수
            for(int j=num.length()-1; j>=0; j--){
                alpha[num.charAt(j)-'A'] += d;
                d *= 10;

            }
        }

        


        //false일때 

          // 그렇다면 가장 앞 자리에서 오지 않는 수중에서 기여도가 가장 낮은 알파벳을 찾아 0으로 만들면 된다
          for(int i=0; i<10; i++){
              if(!check[i]){
                  z = i;
                  break;
              }
          }
          for (int i = 0; i < 10; i++) {
            if (!check[i] && alpha[i] < alpha[z]) {
                z = i;
            }
         }
         alpha[z] = 0;
         // 모든 알파벳을 사용해서 0까지 다 매칭시켜야 하는 경우라면, 가장 앞 자리에 오지 않고 기여도도 가장 낮은 알파벳을 0으로 치환하면 합이 최대가 된다.
          //모든 알파벳을 사용하지 않아서 0을 매칭시키지 않아도 된다면, 사용하지 않는 알파벳(기여도가 0)에 0이 매칭될 것이다.
         Arrays.sort(alpha);

         System.out.println(Arrays.toString(alpha));
          for(int i=9; i>= 0; i--){
              ans += i * alpha[i];
              System.out.println(i*alpha[i]);
          }
          System.out.println(ans);
          


    }
}