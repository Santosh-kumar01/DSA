package Queue;
import java.util.*;

public class Queue_using_Two_Stacks {
    static class Queue {
        static Stack<Integer> s1 = new Stack<>();
        static Stack<Integer> s2 = new Stack<>();

        public static boolean isEmpty() {
            return s1.isEmpty();
        }

        // Add
        public static void add(int data) {
            // Move all elements from s1 to s2
            while (!s1.isEmpty()) {
                s2.push(s1.pop());
            }
            // Push item into s1
            s1.push(data);
            // Push everything back to s1
            while (!s2.isEmpty()) {
                s1.push(s2.pop());
            }
        }

        // Remove
        public static int remove() {
            if (isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }
            return s1.pop();
        }

        // Peek
        public static int peek() {
            if (isEmpty()) {
                System.out.println("queue empty");
                return -1;
            }
            return s1.peek();
        }
    }

    public static void main(String[] args) {
        Queue q = new Queue();
        q.add(1);
        q.add(2);
        q.add(3);

        while (!q.isEmpty()) {
            System.out.println(q.peek());
            q.remove();
        }
    }
}