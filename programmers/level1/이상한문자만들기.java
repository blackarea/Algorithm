package algorithm.programmers.level1;

public class 이상한문자만들기 {
    public static void main(String[] args) {

        System.out.println(solution("try hello world"));
    }

    //다른사람 코드
    public static String solution(String s) {
        String answer = "";
        String[] str = s.split("");

        int idx = 0;
        for(int i=0; i<str.length; i++) {
            if(str[i].equals(" ")) {
                idx = 0;
            } else if(idx % 2 == 0) {
                str[i] = str[i].toUpperCase();
                idx++;
            } else if(idx % 2 != 0) {
                str[i] = str[i].toLowerCase();
                idx++;
            }
            answer += str[i];
        }

        return answer;
    }
}
