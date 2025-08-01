import java.util.Arrays;

public class Q4MINIMUMnum {
    public static void main(String[] args) {
        int []arr = {4,55,2,6,7,1};
        System.out.println(Arrays.toString(arr));
        int min = arr[0];
        for (int i = 0; i<arr.length; i++){
            if (arr[i]<min){
                min = arr[i];
            }

        }
        System.out.println("the minimal number is : " + min);

    }
}
