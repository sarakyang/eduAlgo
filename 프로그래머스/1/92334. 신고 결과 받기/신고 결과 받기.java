import java.util.*;
import java.util.stream.Collectors;


class Solution {
     public int[] solution(String[] id_list, String[] report, int k) {
        int[] answer = new int[id_list.length];
        Set<String> reportTable = new HashSet<>(List.of(report));
        Map<String,List<String>> reportedMap = new HashMap<>();

        for (String string : reportTable) {
            int a = string.indexOf(" ");

            List<String> list = new ArrayList<>();
            String didReportId = string.substring(0,a);
            String reportedId = string.substring(a+1);
            if ( reportedMap.get(reportedId) != null) list = reportedMap.get(reportedId);
            list.add(didReportId);
            reportedMap.put(reportedId, list);

        }

        for (List<String> value : reportedMap.values()) {
            if (value.size() >= k) {
                for (String s : value) {
                    int num = Arrays.stream(id_list).collect(Collectors.toList()).indexOf(s);
                    answer[num]++;
                }
            }
        }

        return answer;
    }
}