package algorithm.programmers.level2;

import java.util.ArrayList;
import java.util.List;

public class 뉴스클러스터링 {
    public static void main(String[] args) {

        int solution = solution("FRANCE1", "french2");
        System.out.println(solution);
    }

    public static int solution(String str1, String str2) {
        int min = 0;
        int max;
        str1 = str1.toLowerCase();
        str2 = str2.toLowerCase();

        List<String> list1 = new ArrayList<>();
        List<String> list2 = new ArrayList<>();
        createList(str1, list1);
        createList(str2, list2);

        for (String str : list2) {
            if (list1.contains(str)) {
                min++;
                list1.remove(str);
            }
        }
        list1.addAll(list2);
        max = list1.size();

        double answer = (double) min / max;

        if(list1.size() == 0){
            return 65536;
        }
        return (int) (answer * 65536);
    }

    private static void createList(String str, List<String> list) {
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) >= 'a' && str.charAt(i) <= 'z' &&
                    str.charAt(i + 1) >= 'a' && str.charAt(i + 1) <= 'z') {
                list.add(str.substring(i, i + 2));
            }
        }
    }

}
