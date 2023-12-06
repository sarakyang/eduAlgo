import java.util.*;

class Solution {
    boolean solution(String s) {
        boolean answer;

        int p_num = 0;
        int y_num = 0;
        String up_s = s.toLowerCase(Locale.ROOT);
        
        char[] chars = up_s.toCharArray();
        for (char aChar : chars) {
            if (aChar == 'p') p_num++;
            if (aChar == 'y') y_num++;
        }
        if (p_num == y_num )  answer = true;
        else answer = false;

        return answer;
    }
}