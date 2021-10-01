import java.util.*;
import java.lang.*;

class Solution
{
    public int solution(int [][]board)
    {
        int answer = 0;
        for(int r = 1; r < board.length; r++){
            for(int c = 1; c < board[0].length; c++){
                if(board[r][c] == 1) //&& board[r][c-1] > 0 && board[r-1][c-1] > 0 && board[r-1][c] > 0) //왜 check? check필요없음, 이해 부족 =>[[1,0], [0,0]] 못찾음
                    board[r][c] = Math.min(board[r][c-1], Math.min(board[r-1][c],board[r-1][c-1])) + 1;
                answer = Math.max(answer, board[r][c]);
            }
        }
        
        //아래 부분 ex[[1,0], [0,0]] 못찾음 -> 더 효율적으로 처리하기 위코드로수정해도됨
        if(answer == 0){
            for(int r = 0; r < board.length; r++){
                for(int c = 0; c < board[0].length; c++){
                    if(board[r][c] == 1)
                        return 1;
                }
            }
        }
        
        return answer*answer;
        //왼쪽상단, 상단, 왼쪽 대신 오른쪽상단, 상단, 오른쪽을 보면 어떻게해야할까?
        /*
        int answer = 0;
        ArrayList<Integer> arr;
        
        for(int r = 0; r < board.length; r++){
            arr = new ArrayList<>();
            for(int c = 0; c < board[0].length; c++){
                if(board[r][c] == 1){
                    arr.add(c);
                }
            }
            
            int max = arr.size();
            for(int i = r+1 ; i < board.length; i++){
                boolean isContinue = true;
                for(int j = 0; j < arr.size(); j++){
                    if(board[i][arr.get(j)] != 1){
                        isContinue = false;
                        break;
                    }        
                }
                if(isContinue)
                   max += arr.size();
                else 
                    break;
            }
            answer = Math.max(max,answer);
        }

        return answer;
        */
    }
}