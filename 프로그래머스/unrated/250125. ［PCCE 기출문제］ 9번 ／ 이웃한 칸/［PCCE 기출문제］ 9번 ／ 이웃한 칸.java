import java.util.*;

class Solution {
    public int solution(String[][] board, int h, int w) {
        int answer = 0;

        if( h > 0 && Objects.equals(board[h - 1][w], board[h][w])) answer++;
        if( w < board[h].length -1 && Objects.equals(board[h][w + 1], board[h][w])) answer++;
        if(w > 0 && Objects.equals(board[h][w - 1], board[h][w])) answer++;
        if(h < board.length -1&&  Objects.equals(board[h + 1][w], board[h][w])) answer++;
        
        return answer;
    }
}