import java.util.*;

class Solution {
    public String solution(int[] numbers, String hand) {
        String answer = "";
        int push = 0;
        int [][] model = new int[][] {{1,2,3},{4,5,6},{7,8,9},{10,0,11}};
        Map<String,Integer> hand_location = new HashMap<>();
        hand_location.put("L" ,10 );
        hand_location.put("R" ,11 );

        while (push <= numbers.length-1) {
            String word = "" ;
            int num = numbers[push];

            switch (num) {
                case 1, 4, 7 -> {
                    word = "L";
                    hand_location.replace("L",num);
                }

                case 3, 6, 9 -> {
                    word = "R";
                    hand_location.replace("R",num);
                }
                case 2, 5, 8, 0 -> word = find_hand( num,hand, hand_location,model);
            }
            answer += word;
            push++;
        }

        return answer;
    }

    public String find_hand(int a, String s, Map<String, Integer> m, int[][] l) {
        String hand = s.substring(0,1).toUpperCase();
        int l_x = 0;
        int l_y = 0;
        int r_x = 0;
        int r_y = 0;
        int g_x = 0;
        int g_y = 0;

        for (int i = 0; i < l.length; i++) {
            for (int j = 0; j < l[0].length; j++) {
                if(l[i][j] == a) {
                    g_y = i;
                    g_x = j;
                }
                if(l[i][j] == m.get("L")){
                    l_y = i;
                    l_x = j;
                }
                if (l[i][j] == m.get("R")){
                    r_y = i;
                    r_x = j;
                }
            }
        }
        

        int r_dis = Math.abs(g_x- r_x) + Math.abs(g_y- r_y);
        int l_dis = Math.abs(g_x- l_x) + Math.abs(g_y- l_y);
        

        if(r_dis < l_dis) hand = "R";
        else if (l_dis < r_dis) hand = "L";


        m.put(hand,a);
       
        return hand;
    }
}