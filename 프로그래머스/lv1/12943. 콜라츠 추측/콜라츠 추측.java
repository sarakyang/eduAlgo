class Solution {
    public int solution(int num) {
        int answer = 0;
        int coin = 0;
        while (true) {
            if (num == 1) {
                break;
            } else if (num % 2 != 1 ){
                num = num/2;

            } else if (num%2 == 1) {
                num = num * 3 + 1;

            }
            coin++;
            if (coin > 500 ) {
                coin= -1;
                break;
            }
        }
        answer = coin;
        return answer;
        
    }
}