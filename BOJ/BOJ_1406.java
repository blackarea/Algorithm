package algorithm.BOJ;

import java.io.*;
import java.util.LinkedList;
import java.util.ListIterator;

public class BOJ_1406 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine();
        int M = Integer.parseInt(br.readLine());

        LinkedList<Character> list = new LinkedList<>();
        String temp;

        for (int i = 0; i < s.length(); i++) {
            list.add(s.charAt(i));
        }

        ListIterator<Character> iterator = list.listIterator();
        while (iterator.hasNext()) {    //커서를 맨뒤로
            iterator.next();
        }


        for (int i = 0; i < M; i++) {
            temp = br.readLine();

            switch (temp) {
                case "L":
                    if(iterator.hasPrevious()){
                        iterator.previous();
                    }
                    break;

                case "D":
                    if (iterator.hasNext()){
                        iterator.next();
                    }
                    break;

                case "B":
                    if(iterator.hasPrevious()){
                        iterator.previous();
                        iterator.remove();
                    }
                    break;

                default:
                    char c = temp.charAt(2);
                    iterator.add(c);
            }


        }

        for (Character li : list) {
            bw.write(li);
        }
        bw.flush();
        bw.close();
    }
}
