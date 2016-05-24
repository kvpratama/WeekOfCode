import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 * Created by nv49c on 24/5/16.
 */
public class NonDivisibleSubset {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int len = in.nextInt();
        int k = in.nextInt();
        int a[] = new int[len];
        ArrayList<Integer> subset = new ArrayList<>();
        ArrayList<Integer> remove = new ArrayList<>();
        int subs[] = new int[len];
        int rem[] = new int[len];
        for (int i = 0; i < len; i++) {
            a[i] = in.nextInt();
        }

        for (int i = 0; i < len; i++) {
            for (int j = i+1; j < len; j++) {
                if ((a[i] + a[j]) % k != 0){
                    if (!subset.contains(a[i])){
                        subset.add(a[i]);
//                        System.out.println("put ai " + a[i]);
                    }
                    if (!subset.contains(a[j])){
                        subset.add(a[j]);
//                        System.out.println("put ai " + a[j]);
                    }
                }
            }
        }
        for (int i = 0; i < subset.size(); i++) {
            System.out.print(subset.get(i));
        }
        System.out.println(subset.size());
    }
}
