package WeekOfCode20;

import java.util.ArrayList;
import java.util.Scanner;

public class NonDivisibleSubset {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[len];
        ArrayList<Integer> subset = new ArrayList<>();
        for (int i = 0; i < len; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if ((a[i] + a[j]) % k != 0){
                    if (!subset.contains(a[i])){
                        subset.add(a[i]);
                    }
                    if (!subset.contains(a[j])){
                        subset.add(a[j]);
                    }
                }
            }
        }
        System.out.println(subset.size());
    }
}
