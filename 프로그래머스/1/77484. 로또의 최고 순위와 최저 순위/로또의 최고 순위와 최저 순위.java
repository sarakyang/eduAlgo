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


        switch (high) {
            case 6 -> answer[0] = 1;
            case 5 -> answer[0] = 2;
            case 4 -> answer[0] = 3;
            case 3 -> answer[0] = 4;
            case 2 -> answer[0] = 5;
            default -> answer[0] = 6;
        }
        
        switch (low) {
            case 6 -> answer[1] = 1;
            case 5 -> answer[1] = 2;
            case 4 -> answer[1] = 3;
            case 3 -> answer[1] = 4;
            case 2 -> answer[1] = 5;
            default -> answer[1] = 6;
        }

        return answer;
    }
}