public class pattern_upper_triangle {
    public static void main(String[] args) {

        System.out.println("*------------------UPPER TRIANGLE-----------------*");
        char ac = 'a';
        for (int i = 0; i < 6; i++){
            for (int j = 5;j > i; j--){
                System.out.print(" ");
            }

            for (int k = 0;k < i;k++){
                System.out.print(ac+" " );
            }
            ac++;
            System.out.println();

        }
    }
}
