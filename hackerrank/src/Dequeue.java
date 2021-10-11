import java.util.ArrayDeque;
import java.util.Deque;
import java.util.HashSet;
import java.util.Scanner;

public class Dequeue {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        Deque deque = new ArrayDeque<>();
        HashSet<Integer> s = new HashSet<Integer>();
        int max = 0;
        int n = in.nextInt();
        int m = in.nextInt();

        for (int i = 0; i < n; i++) {
            int num = in.nextInt();
            deque.add(num);
            s.add(num);
            if(deque.size() == m){
                max = Math.max(s.size(), max);
                int item = (int) deque.remove();
                if (!deque.contains(item)) {
                    s.remove(item);
                }
            }

        }
        System.out.println(max);
    }
}
