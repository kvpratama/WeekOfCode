package WeekOfCode21;

import java.util.Scanner;

public class Kangaroo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int x1 = in.nextInt();
        int v1 = in.nextInt();
        int x2 = in.nextInt();
        int v2 = in.nextInt();

        if ((x1 > x2 && v1 > v2) || (x2 > x1 && v2 > v1)) {
            System.out.print("NO");
        } else {
            int i = 0, currentX1, currentX2;
            boolean run = true;
            while (run) {
                i++;
                currentX1 = x1 + v1 * i;
                currentX2 = x2 + v2 * i;

                if (currentX1 == currentX2) {
                    run = false;
                    System.out.println("YES");
                } else {
                    if ((x1 < x2) && (currentX1 > currentX2)) {
                        run = false;
                        System.out.println("NO");
                    } else if ((x2 < x1) && (currentX2 > currentX1)) {
                        run = false;
                        System.out.println("NO");
                    }
                }
            }

        }
    }
}
