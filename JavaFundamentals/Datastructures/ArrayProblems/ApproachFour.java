package JavaFundamentals.Datastructures.ArrayProblems;

import java.util.ArrayDeque;
import java.util.Deque;

public class ApproachFour {
    public static void main(String[] args) {
        int[] inpput = {1,2,3,4,5,6,7};
        int display = 2;

        Deque<Integer> deq = new ArrayDeque<>();
        for (int i : inpput) {
            deq.add(i);
        }

        for (int i = 0; i < display; i++) {
            int temp = deq.remove();
            deq.addLast(temp);
        }

        System.out.print(deq + " ");
    }
}
