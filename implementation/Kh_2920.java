package implementation;

import java.util.*;

public class Kh_2920 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] play = new int[8];

        for (int i = 0; i < 8; i++) {
            play[i] = sc.nextInt();
        }

        if (play[0] != 1 && play[0] != 8) {
            System.out.println("mixed");
            return;
        }

        boolean flag = true;
        int prevDiff = play[1] - play[0];

        for (int i = 2; i < 8; i++) {
            int diff = play[i] - play[i - 1];
            if (diff != prevDiff) {
                flag = false;
                break;
            }
            prevDiff = diff;
        }

        if (flag) {
            System.out.println(prevDiff == 1 ? "ascending" : "descending");
        } else {
            System.out.println("mixed");

        }

    }
}