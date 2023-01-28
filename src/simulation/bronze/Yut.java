package simulation.bronze;

import java.io.BufferedReader;
import java.io.InputStreamReader;

//2490 : 윷놀이
public class Yut {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int[][] input = new int[3][4];

        for (int i = 0; i < 3; i++) {
            String line = br.readLine();
            String[] numberString = line.split(" ");

            int count = 0;

            for (String s : numberString) {
                if (s.equals("0")) {
                    count++;
                }
            }

            switch (count) {
                case 0:
                    System.out.println("E");
                    break;
                case 1:
                    System.out.println("A");
                    break;
                case 2:
                    System.out.println("B");
                    break;
                case 3:
                    System.out.println("C");
                    break;
                case 4:
                    System.out.println("D");
                    break;

            }

        }

    }
}
