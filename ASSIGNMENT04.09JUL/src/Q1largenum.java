import java.util.Arrays;
public class Q1largenum {
    public static void main(String[] args) {
        int []arr = {0,5,9,8,2,1};
        System.out.println("the aray is :" + Arrays.toString(arr));
        int greatest_number = arr[0];
        for(int i=0; i<arr.length; i++){
            if(arr[i] > greatest_number){
                greatest_number = arr[i];


                }
            }
        System.out.println("the greatest number :" + greatest_number);
        }

    }

