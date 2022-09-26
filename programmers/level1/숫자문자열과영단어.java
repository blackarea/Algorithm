package algorithm.programmers.level1;

public class 숫자문자열과영단어 {
    public static void main(String[] args) {

        solution("one4seveneight");
    }

    public static int solution(String s) {
        int answer = 0;
        String[] arr = new String[]{"zero", "one", "two", "three", "four",
                "five", "six", "seven", "eight", "nine"};
        String sb = "";

        String temp = "";
        for (int i = 0; i < s.length(); i++) {
            if(s.charAt(i) <= '9'){
                sb += s.charAt(i);
            }else {
                temp += s.charAt(i);
                for (int j = 0; j < arr.length; j++) {
                    if(temp.equals(arr[j])){
                        sb += j;
                        temp = "";
                    }
                }
            }
        }

        answer = Integer.parseInt(sb);
        return answer;
        /* replaceAll 쓰면 간단하게 해결 가능*/
    }
}
