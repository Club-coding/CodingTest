import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;


public class Main {
    static int n;
    static int[] budgets;
    static int limit;

    public static int binarySearch(int left, int right, int limit, int[] budgets){
        int l = left;
        int r = right;
        int mid = (l + r) / 2;
        int answer = 0;

        while(l <= r){
            mid = (l + r) / 2;
            int sum = 0;
            for(int i = 0; i < budgets.length; i++){
                if(budgets[i] > mid){
                    sum += mid;
                }else{
                    sum += budgets[i];
                }
            }

            if(sum <= limit){
                l = mid + 1;
                answer = mid;
            }else{
                r = mid - 1;
            }
        }
        
        return answer;
    }

    public static void main(String[] args) throws IOException{
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        n = Integer.parseInt(br.readLine());
        budgets = new int[n];
        StringTokenizer st = new StringTokenizer(br.readLine());
        
        //예산들 중 최댓값
        int right = 0;
        for(int i = 0; i < n; i++){
            budgets[i] = Integer.parseInt(st.nextToken());
            right = Math.max(right, budgets[i]);
        }

        limit = Integer.parseInt(br.readLine());
        // 0부터가 아닌 해당 값이 최소값, 최댓값을 뽑는 것이기에 항상 이것보다는 커지거나 같은 값이어야한다.
        int left = limit / n;
        System.out.println(binarySearch(left, right, limit, budgets));

    }
}
