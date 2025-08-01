import java.util.Arrays;

public class Q3revarr {
    public static void main(String[] args) {
        String []arr = {" ANKIT "," AAYUSH "," HIMANSHU "," MUDIT "," SAHROZ "};
        System.out.println("the array is :" + Arrays.toString(arr));
        System.out.println("the reverse array is :");

        for (int i = arr.length-1; i>=0; i--){

            System.out.print(arr[i]);

        }
    }
}
