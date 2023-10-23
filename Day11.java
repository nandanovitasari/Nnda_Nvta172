package Day11;

import java.util.Arrays;

public class Day11 {

    public static void main(String[] args) {
        //array 1D
        int[] b = {2, 5, 7, 8};
        System.out.println(Arrays.toString(b));
        System.out.println("============================================");
        int[][] a = {{1, 2, 8, 5},
        {1, 2, 3, 4,}};
        for (int i = 0; i < a.length; i++) {
            System.out.print("[");
            for (int j = 0; j < a[i].length; j++) {
                if (j > 0) {
                    System.out.print(", ");
                }
                System.out.print(a[i][j]);
            }
            System.out.println("]");
        }
    }
}
