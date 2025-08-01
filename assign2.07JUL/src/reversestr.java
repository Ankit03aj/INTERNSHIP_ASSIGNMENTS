public class reversestr {
    public static void main(String[] args) {
        StringBuffer str = new StringBuffer("iamankit");
        System.out.println("the string is : " + str);
      //reverse by for loop //
        int length = str.length();
        System.out.println("length of string : " + length);
       String revstr = "";
        for (int i = length-1; i>=0; i--){
           revstr = revstr + str.charAt(i);
        }
        System.out.println("reverse String : " + revstr);
        //ITERATE STRING //
        for (int i = 0; i<length; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }
}
