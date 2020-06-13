import java.util.*;

public class MinConflicts {
    public Node solve(Node csp) {
        Node current = csp;

        for (int i = 0; i < Integer.MAX_VALUE; i++) {
            if (current.getValue() == 0)
                break;
            int var;

            do {
                Random random = new Random();
                var = random.nextInt(25);
            } while (current.getConflicts().get(var).size() == 0);

            int value = getMinimumConflict(current, var);
            int[] newState = current.getState().clone();
            newState[var] = value;
            current = new Node(newState);
            printState(current);
            System.out.print(current.getValue() + "\n");
        }
         return current;
    }

    private int getMinimumConflict(Node node, int queen) {
        int minimum_conflict = Integer.MAX_VALUE;
        int minimum_queen = 0;
        for (int i = 0; i < 25; i++) {
            int[] newState = node.getState().clone();
            newState[queen] = i;
            Node current = new Node(newState);
            if (minimum_conflict > current.getConflicts().get(i).size()) {
                minimum_conflict = current.getConflicts().get(i).size();
                minimum_queen = i;
            }
        }

        return minimum_queen;
    }

    private static void printState(Node node) {
        System.out.print("[");
        for (int i = 0; i < node.getState().length; i++) {
            System.out.print(node.getState()[i]);
            if (i < node.getState().length -1)
                System.out.print(", ");
        }
        System.out.print("]\n");
    }
}
