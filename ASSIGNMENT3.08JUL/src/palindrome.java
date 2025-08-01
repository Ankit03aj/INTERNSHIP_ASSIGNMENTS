public class palindrome {
    public static void main(String[] args) {
        int number = 12321; // You can change this number to test others

        // Step 1: Convert number to array of digits
        int temp = number;
        int digitCount = String.valueOf(number).length();
        int[] digits = new int[digitCount];

        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = temp % 10;
            temp /= 10;
        }

        // Step 2: Check for palindrome
        boolean isPalindrome = true;
        for (int i = 0; i < digitCount / 2; i++) {
            if (digits[i] != digits[digitCount - i - 1]) {
                isPalindrome = false;
                break;
            }
        }

        // Step 3: Print result
        if (isPalindrome) {
            System.out.println(number + " is a palindrome.");
        } else {
            System.out.println(number + " is not a palindrome.");
        }
    }
}
