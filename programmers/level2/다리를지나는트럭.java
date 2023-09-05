package algorithm.programmers.level2;

import java.util.LinkedList;
import java.util.Queue;

public class 다리를지나는트럭 {
    public static void main(String[] args) {

        solution(2, 10, new int[]{7, 4, 5, 6});
    }

    public static int solution(int bridge_length, int weight, int[] truck_weights) {
        int answer = 0;

        Queue<Integer> crossingTruckTime = new LinkedList<>();
        Queue<Integer> crossingTruckWeight = new LinkedList<>();
        Queue<Integer> waitingTruck = new LinkedList<>();

        for (int truck_weight : truck_weights) {
            waitingTruck.add(truck_weight);
        }

        int currentWeight = 0;
        while (!waitingTruck.isEmpty()) {
            answer++;
            if (!crossingTruckTime.isEmpty() && crossingTruckTime.peek() + bridge_length == answer) {
                crossingTruckTime.poll();
                currentWeight -= crossingTruckWeight.poll();
            }
            if (currentWeight + waitingTruck.peek() <= weight) {
                currentWeight += waitingTruck.peek();
                crossingTruckTime.add(answer);
                crossingTruckWeight.add(waitingTruck.poll());
            }

            System.out.println(answer + " : crossingTruckWeight = " + crossingTruckWeight);
        }

        System.out.println("answer = " + (answer + bridge_length));

        return answer + bridge_length;
    }

}
