import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

class Solution {
        public String solution(int a, int b) {

        String answer = "";
        
        LocalDate date = LocalDate.of(2016,a, b);

        DayOfWeek day = date.getDayOfWeek();

        answer = day.getDisplayName(TextStyle.SHORT, Locale.ENGLISH).toUpperCase(Locale.ROOT);

        return answer;
    }
        
}