package algorithm.programmers.level1;

public class 신규아이디추천 {
    public static void main(String[] args) {
        System.out.println(solution("...!@BaT#*..y.abcdefghijklm"));
        System.out.println(solution("z-+.^."));
        System.out.println(solution("=.="));
        System.out.println(solution("123_.def"));
        System.out.println(solution("abcdefghijklmn.p"));
    }

    public static String solution(String new_id) {
        String answer = "";

        //1
        answer = new_id.toLowerCase();

        //2
        answer = answer.replaceAll("(?=\\D)(?=[^a-z])(?!\\.|-|_).", "");

        //3
        answer = answer.replaceAll("\\.+", ".");

        //4
        answer = answer.replaceAll("^[.]|[.]$", "");
        /*if (answer.charAt(0) == '.') {
            answer = answer.substring(1);
        }
        if (answer.length() >= 1 && answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }*/

        //5
        if (answer.isEmpty()) {
            answer = "a";
        }

        //6
        if (answer.length() >= 16) {
            answer = answer.substring(0, 15);
        }
        if (answer.charAt(answer.length() - 1) == '.') {
            answer = answer.substring(0, answer.length() - 1);
        }

        //7
        while (answer.length() <= 2){
            answer += answer.substring(answer.length() - 1);
        }

        return answer;
    }
}
