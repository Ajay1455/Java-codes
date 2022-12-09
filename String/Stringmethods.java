import java.util.*;

public class Stringmethods {
    public static void main(String[] args) {
        // String
        Scanner sc = new Scanner(System.in);

        // take character as input from user
        String find = "StringQuestion";
        // char a=sc.next().charAt(0);
        // // System.out.println();
        // int count =0;
        // for(int i=0; i<find.length(); i++){
        // if(a==find.charAt(i)){
        // count++;
        // if(count==2){
        // System.out.println(i);
        // return;
        // }
        // }
        // }

        // System.out.println(find.indexOf("es"));

        // String str=sc.nextLine();
        String s1 = "Hello.World";
        // System.out.println(s1.substring(3, 7));

        // find substring from user input without pre-built method
        // String original = sc.next();
        // String sub = sc.next();
        // int len = sub.length();
        // System.out.println(len);
        // System.out.println(original.contains(sub)); // check if sub is substring of original
        // for (int i = 0; i < original.length() - len + 1; i++) { // i have to iterate i=0 to i=7
        //     if (sub.equals(original.substring(i, i + len))) {
        //         System.out.println("Sub String present.");
        //     }
        // }

        // s1 = s1.toUpperCase();
        // System.out.println("After changing tp Upper case : " + s1);
        // s1 = s1.toLowerCase();
        // System.out.println("After changing tp Lower case : " + s1);

        String email = sc.next();
        String domain = "@gmail.com";
        int len1=domain.length();
        for (int i = 4; i < email.length() - len1 + 1; i++) { // i have to iterate i=0 to i=7
            if (domain.equals(email.substring(i, i + len1))) {
                System.out.println("Valid Email Adress.");
            }
        }
    }
}