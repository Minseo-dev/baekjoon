package brute_force;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class ArithmeticSequence2 {
  public static void main(String[] args) throws IOException {

    BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

    System.out.print(arithmeticSequence(Integer.parseInt(br.readLine())));

  }

  public static int arithmeticSequence(int num) {

    if (num < 100) { //두자릿수까지 수열
      return num;
    } else if (num == 1000) {
      return findNumber(999);
    } else {
      return findNumber(num);
    }

  }

  public static int findNumber(int num) {

    int count = 99;

    for (int i = 100; i <= num; i++) {
      int hun = i / 100;
      int ten = (i / 10) % 10;
      int one = i % 10;

      if ((hun - ten) == (ten - one)) {
        count++;
      }
    }
    return count;
  }
}
