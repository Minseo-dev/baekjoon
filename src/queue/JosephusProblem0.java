package queue;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class JosephusProblem0 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int n = input.nextInt();
        int k = input.nextInt();
        Queue<Integer> queue = new LinkedList<>();

        for (int i = 0; i < n; i++) {
            queue.add(i + 1);   //1~n까지 푸시
        }
        System.out.print("<");
        while (n-- > 0) { //큐 사이즈만큼 반복
            for (int i = 0; i < k; i++) {
                if (i == k - 1) {
                    if (n == 0)System.out.print(queue.poll()); //k번째 인덱스 디큐
                   else System.out.print(queue.poll()+ ", ");
                } else {
                    queue.add(queue.poll()); //k번째 인덱스 아니면 큐에 인큐
                }
            }
        }
        System.out.print(">");
    }
}



