class Solution {
    public int[] solution(int[] lottos, int[] win_nums) {
        int[] answer = new int[2];

        int high = 0;
        int low = 0;


        for (int i = 0; i < lottos.length; i++) {
            for (int num : win_nums) {
                if (lottos[i] == num) {
                    high++;
                    low++;
                }
                if (lottos[i] == 0) {
                    high++;
                    lottos[i] = -1;
                }
            }
        }

        answer[0] = rank(high);
        answer[1] = rank(low);

        return answer;
    }
    
    public int rank (int a) {
        int i = 0;
        switch (a) {
            case 6 -> i = 1;
            case 5 -> i = 2;
            case 4 -> i = 3;
            case 3 -> i = 4;
            case 2 -> i = 5;
            default -> i = 6;
        }
        return i;
    }
