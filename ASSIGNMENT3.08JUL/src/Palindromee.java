import java.util.Arrays;

public class Palindromee {
    public static void main(String[] args) {
        int []arr = {1,2,4,2,4,2,1};
        boolean isPalindrome = true;
        int length = arr.length;
        for (int i = 0; i < length/2; i++ ){
            if(arr[i] != arr[length-i-1]){
                isPalindrome=false;
            }
        }

        System.out.println("is " + Arrays.toString(arr) + " palindrome ?");
        System.out.println(isPalindrome);
    }
}
