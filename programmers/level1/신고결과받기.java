package algorithm.programmers.level1;

import java.util.*;
import java.util.stream.Collectors;

public class 신고결과받기 {
    public static void main(String[] args) {

        solution(new String[]{"muzi", "frodo", "apeach", "neo"},
                new String[]{"muzi frodo", "apeach frodo", "frodo neo", "muzi neo", "apeach muzi"},
                2);
    }

    public static int[] solution(String[] idArray, String[] reportStringArray, int k) {
        int[] beReportedCount = new int[idArray.length];    //신고당한 횟수
        int[] reportCount = new int[idArray.length];        //신고한 횟수

        List<String> idList = new ArrayList<>(Arrays.asList(idArray));
        Set<String> reportSet = new HashSet<>(Arrays.asList(reportStringArray));
        for (String report : reportSet) {
            String[] reportSplit = report.split(" ");
            beReportedCount[idList.indexOf(reportSplit[1])]++;
        }

        for (String report : reportSet) {
            String[] reportSplit = report.split(" ");
            for (int i = 0; i < idArray.length; i++) {
                if (beReportedCount[i] >= k && reportSplit[1].equals(idList.get(i))) {
                    reportCount[idList.indexOf(reportSplit[0])]++;
                }
            }
        }
        System.out.println(Arrays.toString(reportCount));

        return reportCount;
    }
}
