class Solution {
    public int solution(int[] number) {
        int answer = 0;
        
        int A = 0;
        int B = 0;
        int c = 0;

        for (int i = 0 ; i < number.length ; i++) {
            for (int j = i+1 ; j < number.length  ; j++) {
                for(int k = j+1 ; k < number.length  ; k ++) {
                    A = number[i];
                    B = number[j];
                    c= number[k];
                    if(A+B+c == 0) {answer++;}

                }
            }
        }
        
        return answer;
    }
}