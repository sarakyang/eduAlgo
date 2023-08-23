class Solution {
    public int[] solution(int n, int m) {
         int[] answer = new int[2];
        int big = 0;
        int sm = 0;
        int i =0;
        int k = 0 ;
        if (n < m) {
            big = m;
            sm = n;
        } else {
            big = n;
            sm = m;
        }
        while (true) {
            i++;
            if(big % i == 0 && sm % i == 0 ) {
                answer[0] = i;
            }
            if (i >= sm) break;
            }

        while (true) {
            k++;
            if (answer[0]*k % big == 0 && answer[0]*k % sm == 0) {
                answer[1] = answer[0]*k;
                break;
            }
        }
        return answer;
    }
}