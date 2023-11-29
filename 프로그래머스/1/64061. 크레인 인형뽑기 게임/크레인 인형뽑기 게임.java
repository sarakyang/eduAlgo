import java.util.*;

class Solution {
    public int solution(int[][] board, int[] moves) {
        int answer = 0;
        List<Integer> picks = new ArrayList<>();
        int size;

        for (int move : moves) {
            int line = 0;

            while (true) {
                int doll = board[line][move-1];
                if (doll == 0 ) {
                    line++;
                    if ( line > board.length-1) {
                        break;
                    }
                }

                if (doll != 0) {
                    picks.add(doll);
                    board[line][move-1] = 0;

                    break;
                }
            }
            
            size = picks.size();
            if(size > 1) {
                if(picks.get(size -1 ).equals(picks.get(size-2))) {
                    picks.remove(size -1);
                    picks.remove(size -2);
                    answer += 2;

                }
            }

        }

        return answer;
    }
}