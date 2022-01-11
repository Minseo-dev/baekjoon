package LCS;

import java.util.Scanner;

public class MatrixMul {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("배열의 최소 곱셈 수 입력>>");
        int n = sc.nextInt();
        int[][] m = new int[501][501]; //최적 순서 출력을 위한 m행렬
        int[] d = new int[1001];       //알고리즘의 입력이 되는 d행렬

        for (int i = 0; i < n; i++) {  //입력받은 n만큼 dx를 입력 받음
            System.out.printf("A"+(i+1)+"=");
            d[i] = sc.nextInt();      //값을 적어줌
            d[i + 1] = sc.nextInt();
        }

        for (int len = 2; len <= n; len++) {        //len값이 1이면 주대각선의 바로 위에 있는 대각선을 의미
            for (int i = 1; i <= n - len + 1; i++) {
                int j = i + len - 1;
                m[i][j] = Integer.MAX_VALUE;
                //연속곱셈행렬의 알고리즘 for(k~~~)부분
                // M[i][j] = minimum(M[i][k] + M[k+1][j] + d[i-1] * d[k] * d[j]);
                //          i<= k <= j-1
                for (int k = i; k < j; k++) {
                    int cost = m[i][k] + m[k + 1][j] + d[i - 1] * d[k] * d[j];
                    m[i][j] = Math.min(m[i][j], cost);   //최소값을 구해주는 Math.min 라이브러리
                }
            }
        }
        System.out.println("최소 곱셈 수 = " + m[1][n]);
    }

}
