package TestStudy;

import java.security.MessageDigest;

public class Main {
    //    public static void main(String[] args) {
//        String str = makeItFunny("ssaddasdfaasfasf", 3);
//        System.out.println(str);
//        boolean zaza = hasChar("fsdfdsfdsfdfdfds", 'f');
//        System.out.println(zaza);
//        String str1 = encrypt("memo");
//        System.out.println(str1);
//    }
    public static void main(String[] args) throws Exception {
        MessageDigest md = MessageDigest.getInstance("MD5");
        byte[] digest = md.digest("abracadabra".getBytes("UTF-8"));
        for (byte b : digest) {
            System.out.printf("%02x", b);


//        public static String makeItFunny(String str, int n) {
//        int i = 0;
//        String mu = "";
//        while (i <= str.length() - 1) {
//            if ((i + 1) % n != 0) {
//                mu += str.charAt(i);
//            } else {
//                mu += str.toUpperCase().charAt(i);
//            }
//            i++;
//        }
//        return mu;
//    }
//    public static boolean hasChar(String str, char ch) {
//        // BEGIN (write your solution here)
//        int i = 0;
//        while (i < str.length()){
//            if (ch == str.charAt(i)){
//                return true;
//            }
//            i++;
//        }
//        return false;
//       // END
//    }
//    public static String encrypt(String str) {
//        // BEGIN (write your solution here)
//        String crypt = "";
//        for (int i = 0; i < str.length(); i++){
//            if ((i+1) %2 == 0){
//                crypt += str.charAt(i);
//            }
//            else {
//                crypt = str.charAt(i) + crypt;
//            }
//
//
//        }
//        return crypt;
//        // END
//    }
        }
    }
}
