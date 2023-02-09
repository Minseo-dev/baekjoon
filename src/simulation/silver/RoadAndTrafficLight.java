package simulation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

//2980 : 도로와 신호등
public class RoadAndTrafficLight {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        StringTokenizer st = new StringTokenizer(br.readLine());

        //N:신호등 개수, L:도로 길이
        int N = Integer.parseInt(st.nextToken());
        int L = Integer.parseInt(st.nextToken());

        //현재 위치와 현재 시간
        int currentLocation = 0;
        int currentTime = 0;

        for (int i = 0; i < N; i++) {
            st = new StringTokenizer(br.readLine());
            int D = Integer.parseInt(st.nextToken());
            int R = Integer.parseInt(st.nextToken());
            int G = Integer.parseInt(st.nextToken());

            currentTime += D - currentLocation;
            currentLocation = D;

            int gap = currentTime % (R + G);
            if (gap < R) currentTime += R - gap;
            System.out.println(currentTime);
        }

        currentTime += L - currentLocation;

        System.out.println(currentTime);

    }
}
