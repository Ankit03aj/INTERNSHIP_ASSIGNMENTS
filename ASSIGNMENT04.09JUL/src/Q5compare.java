public class Q5compare {
    public static void main(String[] args) {
        int[][] arr1 = {{1, 2, 3,}, {2, 4, 6}, {4, 8, 12}};
        int[][] arr2 = {{1, 2, 3,}, {2, 4, 6}, {4, 8, 12}};
        boolean same = true;

        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr1[i].length; j++) {
                if (arr1[i][j] != arr2[i][j]) {
                    same = false;
                    break;
                }
            }
            if (!same) break;

        }
        if(same){
            System.out.println("both array are equal");
        }
        else{
            System.out.println("both array are not equal");
        }
    }
}
