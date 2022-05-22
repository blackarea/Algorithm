package algorithm.programmers.level1;

public class 시저암호 {

    public static void main(String[] args) {
        solution("a B z", 4);
    }

    public static String solution(String s, int n) {
        StringBuilder answer = new StringBuilder();
        for (int i = 0; i < s.length(); i++) {
            char charAt = s.charAt(i);
            if(Character.isLowerCase(charAt)){
                char c = (char) ((charAt - 'a' + n) % 26 + 'a');
                answer.append(c);
            }else if(Character.isUpperCase(charAt)){
                char c = (char) ((charAt - 'A' + n) % 26 + 'A');
                answer.append(c);
            }else {
                answer.append(charAt);
            }
        }
        System.out.println(answer);
        return answer.toString();
    }
}
