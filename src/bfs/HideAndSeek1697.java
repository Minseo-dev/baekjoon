package bfs;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class HideAndSeek1697 {
  static int N;
  static int K;
  static int[] point = new int[100001];

  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
    N = sc.nextInt();
    K = sc.nextInt();

    if (N == K) {
      System.out.println(0);
    } else {
      bfs(N);
    }
  }

  static void bfs(int num) {

    Queue<Integer> queue = new LinkedList<>();
    queue.add(num);
    point[num] = 1;

    while (!queue.isEmpty()) {
      int next = queue.poll();

      int x1 = next + 1;
      int x2 = next - 1;
      int x3 = next * 2;

      if (x1 <= 100000 && point[x1] == 0) {
        point[x1] = point[next] + 1;
        queue.add(x1);
      }

      if (x2 >= 0 && point[x2] == 0) {
        point[x2] = point[next] + 1;
        queue.add(x2);
      }

      if (x3 <= 100000 && point[x3] == 0) {
        point[x3] = point[next] + 1;
        queue.add(x3);
      }

    }
    System.out.println(point[K] - 1);
  }

}
