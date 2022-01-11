package LCS;

import java.util.Scanner;

public class LCS {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Input Text A > ");
        String a = sc.nextLine();
        System.out.print("Input Text B > ");
        String b = sc.nextLine();

        int i = 0;
        int j = 0;

        int[][] lenArr = new int[a.length() + 1][b.length() + 1];
        for (i = 0; i < a.length() + 1; i++) {
            for (j = 0; j < b.length() + 1; j++) {
                if (i == 0 || j == 0) {
                    lenArr[i][j] = 0;
                } else if (a.toCharArray()[i - 1] == b.toCharArray()[j - 1]) {
                    lenArr[i][j] = lenArr[i - 1][j - 1] + 1;
                } else {
                    lenArr[i][j] = Math.max(lenArr[i][j - 1], lenArr[i - 1][j]);
                }
            }
        }
        //table 출력 과정
        System.out.print("    ");
        for (i = 0; i < a.length(); i++)
            System.out.print(a.charAt(i) + " ");
        System.out.println();

        for (i = 0; i < b.length() + 1; i++) {
            if (i == 0)
                System.out.print("  ");
            else System.out.format("%2c", b.charAt(i - 1));
            for (j = 0; j < a.length() + 1; j++) {
                System.out.print(lenArr[i][j] + " ");
            }
            System.out.println();
        }

        //LCS 출력
        trace(a, b, a.length(), b.length(), lenArr, "");  //LCS를 구하기 위해 추적 함수 호출
        System.out.println(" (Length :" + lenArr[a.length()][b.length()] + ")");
    }


    //추적 함수
   static void trace(String a, String b, int m, int n, int[][] data, String lcs) {

        if (m == 0 || n == 0) {
            System.out.print("LCS : \"");
            for (int i = lcs.length() - 1; i >= 0; i--)
                System.out.print(lcs.charAt(i));
            System.out.print("\"");
            return;
        }

        if (data[m][n] > data[m - 1][n] && data[m][n] > data[m][n - 1]) { //Case 1
            lcs = lcs + a.charAt(m - 1); //뒤에서부터 추적이므로 새로운 문자를 앞에 붙임
            trace(a, b, m - 1, n - 1, data, lcs); //왼쪽 위 셀로 이동
        } else {
            if (data[m][n] == data[m][n - 1])                            //Case 2
                trace(a, b, m, n - 1, data, lcs); //왼쪽(<-) 셀로 이동
            else                                                         //Case 3
                trace(a, b, m - 1, n, data, lcs); //위 셀로 이동
        }
    }
}
