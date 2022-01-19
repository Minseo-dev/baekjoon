package dynamic;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;

public class consecutiveSum2 {

  public static void main(String[] args)throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    String str = br.readLine();
    int n = Integer.parseInt(str);

    int[] a = new int[n];
    int[] dp = new int[n];

    String[] strings = br.readLine().split(" ");
    for (int i = 0; i < n; i++)
      a[i] = Integer.parseInt(strings[i]);

    dp[0] = a[0];

    for (int i = 0; i < n-1; i++)
      dp[i+1] = Math.max(dp[i] + a[i+1], a[i+1]);

    Arrays.sort(dp);
    System.out.println(dp[n-1]);

  }

}
