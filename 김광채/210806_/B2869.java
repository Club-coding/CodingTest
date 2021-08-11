import java.io.IOException;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException{
        Scanner sc = new Scanner(System.in);
        int up = sc.nextInt();
        int down = sc.nextInt();
        int goal = sc.nextInt();

        int answer = 0;
        int nowLocation = 0;

        while(nowLocation < goal){
            answer++;
            nowLocation += up;
            if(nowLocation == goal){
                break;
            }

            nowLocation -= down;
        }

        System.out.println(answer);
    }    
}