public class factorial {
    public static void main(String[] args) {
        int fact=1, num=10;
        for (int i = 1; i < 10; i++){
            fact = fact*i;
        }
        System.out.println("factorial of " + num + "is :" + fact);
    }
}
