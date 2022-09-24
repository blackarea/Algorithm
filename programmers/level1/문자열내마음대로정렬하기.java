package algorithm.programmers.level1;

import java.util.*;

public class 문자열내마음대로정렬하기 {
    public static void main(String[] args) {

        String[] solution = solution(new String[]{"abce", "ascd", "cdx"}, 2);
        System.out.println(Arrays.toString(solution));
    }

    public static String[] solution(String[] str, int n) {
        Map<String, String> map = new HashMap<>();

        for (String s : str) {
            map.put(s.substring(n), s.substring(0, n));
        }

        List<String> keySet = new ArrayList<>(map.keySet());
        Collections.sort(keySet);

        List<String> a = new ArrayList<>();

        for (int i = 0; i < str.length;) {
            List<String> temp = new ArrayList<>();
            char c = keySet.get(i).charAt(0);

            while (i < str.length && c == keySet.get(i).charAt(0)){
                temp.add(map.get(keySet.get(i)) + keySet.get(i));
                i++;
            }
            Collections.sort(temp);
            a.addAll(temp);
        }

        return a.toArray(new String[str.length]);
        /*
        Arrays.sort(strings);
        Arrays.sort(strings, Comparator.comparing((s) -> s.substring(n, n + 1)));
        return strings;
        * */
    }
}
