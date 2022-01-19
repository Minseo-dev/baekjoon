package dynamic;

import java.util.Arrays;
import java.util.Scanner;


public class consecutiveSum {

  public static void main(String[] args) {

    Scanner scanner = new Scanner(System.in);
    int n = scanner.nextInt();

    int[] a = new int[n];
    int[] dp = new int[n];

    for (int i = 0; i < n; i++)
      a[i] = scanner.nextInt();

    dp[0] = a[0];

    for (int i = 0; i < n-1; i++)
      dp[i+1] = Math.max(dp[i] + a[i+1], a[i+1]);

    Arrays.sort(dp);
    System.out.println(dp[n-1]);

  }

}