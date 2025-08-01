import java.util.Arrays;

public class Q6add {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3,}, {2, 4, 6}, {4, 8, 12}};
        int[][] arr2 = {{1, 2, 3,}, {2, 4, 6}, {4, 8, 12}};
        int [][]sum = new int[3][3];

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                sum[i][j] = arr1[i][j] + arr2[i][j];
                System.out.print(sum[i][j]);

            }
        }

        System.out.println(Arrays.deepToString(sum));
    }
}
