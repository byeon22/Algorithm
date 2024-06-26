import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine(), " ");
        StringBuilder sb = new StringBuilder();

        int N = Integer.parseInt(st.nextToken());
        int x;
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());

        for (int i = 0; i < N; i++) {
            x = Integer.parseInt(br.readLine());

            if (x == 0) {
                if (queue.isEmpty()) sb.append(0).append("\n");
                else {
                    sb.append(queue.poll()).append("\n");
                }
            }
            else {
                queue.offer(x);
            }
        }
        System.out.println(sb);
    }
}