package simulation.bronze;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2884 : 알람 시계
public class AlarmClock {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        int H = Integer.parseInt(st.nextToken());
        int M = Integer.parseInt(st.nextToken());

        M -= 45;

        if (M < 0) {
            M += 60;
            H -= 1;
            if (H < 0) {
                H += 24;
            }
        }

        System.out.println(H + " " + M);

    }
}
