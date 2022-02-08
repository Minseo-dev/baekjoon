package backtracking;

import java.io.*;

public class NAndM3 {

  public static String[] arr;
  public static int N, M;
  public static BufferedWriter bw;

  public static void main(String... args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
    bw = new BufferedWriter(new OutputStreamWriter(System.out));

    String[] strings = br.readLine().split(" ");

    N = Integer.parseInt(strings[0]);
    M = Integer.parseInt(strings[1]);

    arr = new String[M];

    backtracking(0);
    bw.close();

  }

  public static void backtracking(int depth) throws IOException {
    if (depth == M) {
      for (int i = 0; i < M; i++) {
        bw.write(arr[i] + " ");
      }
      bw.newLine();
      return;
    }

    for (int i = 1; i <= N; i++) {
      arr[depth] = i + "";
      backtracking(depth + 1);
    }
  }

}
