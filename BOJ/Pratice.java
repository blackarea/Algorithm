package algorithm.BOJ;

import java.util.LinkedList;
import java.util.ListIterator;

public class Pratice {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<Integer>();

        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);

        ListIterator<Integer> iter = list.listIterator();
        /*while (iter.hasNext()) {
            System.out.print(iter.next() + " ");
        }*/
        System.out.print(iter.next());
        System.out.print(iter.next());
        System.out.println(iter.previous());
        System.out.println(iter.previous());

        /*while (iter.hasPrevious()) {
            System.out.print(iter.previous() + " ");
        }*/
    }
}
