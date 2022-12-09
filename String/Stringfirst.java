import java.util.*;

public class Stringfirst {
    public static void main(String[] args) {
        String s = new String("Abc");
        String s1 = new String("Abc");
        // System.out.println(s==s1);

        String s4 = "xyz";
        String s5 = "xyz";
        // System.out.println(s4==s5);

        Scanner sc = new Scanner(System.in);
        // String s6=sc.next();
        // sc.next();
        // String s7=sc.nextLine();

        // System.out.println(s6==s7);

        String str = "AJAY";

        String str1 = " ";
        char c;
        int i=0;

        for ( i = 0; i < str.length(); i++) {
            // swap(str.charAt(i), str.charAt(str.length()-i));st
            // char a = str.charAt(i); 
            // char b = (str.charAt(str.length() - i-1));
            // System.out.println(a);
            // System.out.println(b);
            // char temp = a;
            // a = b;
            // b = temp;
            // System.out.println("After swap : "+a);
            // System.out.println("After swap : "+b);


            // 2nd Method
            c=str.charAt(str.length()-i-1);
            str1=str1+c;
            
            // 3rd Method
            // c=str.charAt(i);
            // str1=c+str1;
        }
        
        System.out.println(str1);
        // System.out.println(str);

    }
}
