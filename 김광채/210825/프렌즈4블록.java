import java.util.*;

class Solution {
    static char[][] boards;
    static int answer;
    // 2x2 체크 후 삭제, checkBoard를 만들어서 중복 처리 이슈 
    // 이차원배열 크기가 작고 2x2가 아니라 같은 것은 전부라면? => bfs로 처리, 중복을 확인할 필요가 없음
    // 이차원 배열 크기가 훨씬 더 크다면? 중복처리어떻게 할것인가? 똑같다 처리방식은 근데 10x10배열찾는것이라면 다른 방법찾아 봐야할듯?? bfs로 해당 길이만큼만 가게끔하는 아이디어 생각
    public int check2x2(int m, int n){
        int count = 0;
        int[] dr = {1, 0, 1};
        int[] dc = {0, 1, 1};
        boolean[][] checkBoard = new boolean[m][n];
        
        // 현재로부터 3곳 값 확인 후 값이 같으면 checkboard 0 처리
        //n-1,m-1을 하면 범위 계산 필요 x
        for(int i = 0; i < m-1; i++){
            for(int j = 0; j < n-1; j++){
                
                if(boards[i][j] != '0'){
                    boolean is2x2 = true;
                    
                    for(int k = 0; k < 3;k ++){
                        int nr = i + dr[k];
                        int nc = j + dc[k];
                        if(boards[i][j] != boards[nr][nc]){
                            is2x2 = false;
                            break;
                        }
                    }
                
                    if(is2x2){
                        checkBoard[i][j] = true;
                        for(int k = 0; k < 3;k ++){
                            checkBoard[i+dr[k]][j+dc[k]] = true;
                        }
                    }
                }
            }
        }
        
        
        // 0 갯수 세며 0으로 바꾸고 갯수 리턴
        for(int i = 0; i < m; i++){
            for(int j = 0; j < n; j++){
                if(checkBoard[i][j]){
                    count++;
                    boards[i][j] = '0';
                }
            }
        }
        
        answer += count;
        return count;
    }
    
    //2x2 없애기, 0인 것 위에 있는 거 다 내려주기
    public void arrange(int m, int n){
        for(int c = 0; c < n; c++){
            
            for(int r = m-1; r >= 0; r--){
                if(boards[r][c] == '0'){
                    for(int nr = r - 1; nr >= 0; nr--){
                        if(boards[nr][c] != '0'){
                            char temp = boards[nr][c];
                            boards[r][c] = boards[nr][c];
                            boards[nr][c] = '0';
                            break;
                        } 
                    }
                }
            }
            
        }
    }
    
    
    public int solution(int m, int n, String[] board) {
        answer = 0;
        
        boards = new char[m][n];
        for(int i = 0; i < m; i++){
            boards[i] = board[i].toCharArray();
        }
        
        while(check2x2(m, n) > 0){
            arrange(m, n);
        }
        
        return answer;
    }
}