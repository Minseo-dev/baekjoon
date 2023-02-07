package simulation.silver;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class AntMoving {

    //개미 배열
    private static Ant[] antArr;

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        br.readLine();

        char[] group1 = br.readLine().toCharArray();
        char[] group2 = br.readLine().toCharArray();

        antArr = new Ant[group1.length + group2.length];

        //개미 그룹1 오른쪽 주시
        for (int i = 0; i < group1.length; i++) {
            antArr[group1.length - 1 - i] = new Ant(group1[i], false);
        }

        //개미 그룹2 왼쪽 주시
        for (int i = 0; i < group2.length; i++) {
            antArr[group1.length + i] = new Ant(group2[i], true);
        }

        //T
        int time = Integer.parseInt(br.readLine());
        for (int i = 0; i < time; i++) {

            jump();
        }

        for (int i = 0; i < antArr.length; i++) {
            System.out.print(antArr[i].id);
        }

    }

    private static void jump() {

        for (int i = 0; i < antArr.length - 1; i++) {
//            if(antArr[i].isLeft != antArr[i+1].isLeft){
            if (!antArr[i].isLeft && antArr[i].isLeft != antArr[i + 1].isLeft) {
                Ant tempAnt = antArr[i + 1];
                antArr[i + 1] = antArr[i];
                antArr[i] = tempAnt;
                i++;
            }
        }
    }

    private static class Ant {
        char id;
        boolean isLeft;

        Ant(char id, boolean isLeft) {
            this.id = id;
            this.isLeft = isLeft;
        }
    }
}
