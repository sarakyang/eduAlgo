import java.util.*;

class Solution {
    public String[] solution(int n, int[] arr1, int[] arr2) {
        String[] answer = new String[arr2.length];

        String[] arr1_s = make_array(n,arr1);
        String[] arr2_s = make_array(n,arr2);

        System.out.println(Arrays.toString(arr1_s));
        System.out.println(Arrays.toString(arr2_s));

        for (int i = 0; i < arr1_s.length; i++) {
            String s1 = arr1_s[i];
            String s2 = arr2_s[i];
            String key = "";
            
            char[] s1_c = s1.toCharArray();
            char[] s2_c = s2.toCharArray();

            for (int j = 0; j < n; j++) {

                if(s1_c[j] == '0') s1_c[j] = s2_c[j];

                if (s1_c[j] == '0' ) key += " ";
                else if (s1_c[j] == '1') key += "#";
            }

            answer[i] = key;
        }

        return answer;
    }

    String[] make_array (int a , int[] arr) {
        String[] array = new String[arr.length];
        for (int i = 0; i < arr.length; i++) {
            int num = arr[i];
            String num_2 = "";

            while (num >0 ) {
                num_2 = (num %2) + num_2;
                num /= 2;
            }

            while (num_2.length() < a) {
                num_2 = "0" + num_2;
            }

            array[i] = num_2;
        }
        return array;
    }
}