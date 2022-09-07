package algorithm.programmers.level1;

public class 문자열내림차순으로배치하기 {
    public static void main(String[] args) {

        solution("Zbcdefgazbb");
    }

    public static String solution(String s) {
        String answer = "";
        /*
        char[] chars = s.toCharArray();
        Arrays.sort(chars);
        return new StringBuilder(new String(chars)).reverse().toString();
        */

        int[] arr = new int[52];
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) >= 'a'){
                arr[s.charAt(i) - 'a']++;
            }else {
                arr[s.charAt(i) - 'A' + 26]++;
            }
        }

        for (int i = 25; i >= 0; i--) {
            for (int j = 0; j < arr[i]; j++) {
                answer += (char)(i + 'a');
            }
        }

        for (int i = 51; i >= 26; i--) {
            for (int j = 0; j < arr[i]; j++) {
                answer += (char)(i + 'A' - 26);
            }
        }

        System.out.println(answer);
        return answer;
    }
}
