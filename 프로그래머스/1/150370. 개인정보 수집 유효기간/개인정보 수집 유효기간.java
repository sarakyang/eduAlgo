import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.*;

class Solution {
    public List<Integer> solution(String today, String[] terms, String[] privacies) {
        List<Integer> answer = new ArrayList<>();

        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.ofPattern("yyyy.MM.dd");
        LocalDate date = LocalDate.parse(today,dateTimeFormatter);

        Map<String, Integer> termsMap = new HashMap<>();
        for (String term : terms) {
            String name = term.substring(0,1);
            int period = Integer.parseInt(term.substring(2));
            termsMap.put(name, period);
        }

        for (int i = 0; i < privacies.length; i++) {
            int endPoint = privacies[i].length();
            String name = privacies[i].substring(endPoint-1);

            LocalDate startDay = LocalDate.parse(privacies[i].substring(0,endPoint-2),dateTimeFormatter);
            int period = termsMap.get(name);
            LocalDate endDay = startDay.plusMonths(period);

            if(!endDay.isAfter(date)) answer.add(i+1);
        }
        return answer;
    }
}