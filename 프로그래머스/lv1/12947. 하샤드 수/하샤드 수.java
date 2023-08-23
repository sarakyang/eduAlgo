class Solution {
    public boolean solution(int x) {
        boolean answer;
        int a =0;
        int b = x;
        // 자릿수를 구하는 공식 +1을 해주는 것이 포인트임 
        int size = (int)(Math.log10(x)+1);
        for (int i = 0; i < size ; i++) {
            if (x <=10) {
                a= a+b;
                break;
            }
            // 자릿수의 합
            a = a+ b%10;
            // 숫자를 한 자리씩 자름 
            b = b/10;
        }
        // 나눠지는지 못하는 지 정하는 부분 
        double A = a;
        double X = x;
        if (X % A == 0) {
            answer = true;
        } else {
            answer = false;
        }
        return answer;
    }
}