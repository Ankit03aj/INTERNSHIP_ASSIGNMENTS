public class sumnatural {
    public static void main(String[] args) {
        int sum = 0;
        for (int i = 1; i <=10; i++ ){

            if(i==10){
                continue;
            }
            System.out.print(i + "+");

        } for (int i = 1; i <=10; i++ ) {
            sum = sum + i;
        }
        System.out.print("10= "+ sum);
    }
}
