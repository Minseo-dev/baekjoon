package heap;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.StringTokenizer;

public class NthBigNumber {

    public static void main(String [] args) throws IOException {  //예외처리 필수 <- 또는 try catch
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st;

        int n = Integer.parseInt(br.readLine());  //readLine 리턴 값 String 고정
        int[] arr = new int[n*n];
        int index =0;

        for(int i=0; i<n; i++) {
            st = new StringTokenizer(br.readLine());
            for(int j=0; j<n; j++) {
                arr[index++] = Integer.parseInt(st.nextToken());  //nextToken() = 공백 자리 땡겨 채우기
            }
        }

        Arrays.sort(arr);

        System.out.println(arr[n*n - n]);
    }

}
