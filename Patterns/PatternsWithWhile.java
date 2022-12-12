public class PatternsWithWhile {
    public static void main(String[] args) {
        int n = 5;
        int i, j;
        i = 0;

        // 1. print left side right triangle
        // while(i<=n){
        // j=0;
        // while(j<=i){
        // System.out.print("*");
        // j++;
        // }
        // i++;
        // System.out.println();
        // }

        // 2. print right side Right triangle
        // while(i<=n){
        // int space=n-i;
        // while(space>0){
        // System.out.print(" ");
        // space--;
        // }
        // j=0;
        // while(j<=i){
        // System.out.print("*");
        // j++;
        // }
        // i++;
        // System.out.println();
        // }

        // 3. Pyramid
        while (i <= n) {
            int space = n - i;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }

            j = 0;
            while (j <= i) {
                System.out.print("*");
                j++;
            }

            j = 0;
            while (j <= i - 1) {
                System.out.print("*");
                j++;
            }

            i++;
            System.out.println();
        }

        // 4. hollow pyramid
        while (i <= n) {
            int space = n - i;
            while (space > 0) {
                System.out.print(" ");
                space--;
            }

            j = 0;
            if (i == n || i == 1 || j==n || j==i) {
                while (j <= i) {
                    System.out.print("*");
                    j++;
                }
            }else{
                System.out.print(" ");
            }

            j = 0;
            if (i == n || i == 1 || j==n || j==i ) {
                while (j <= i - 1) {
                    System.out.print("*");
                    j++;
                }
            } else {
                System.out.print(" ");
            }

            i++;
            System.out.println();
        }

    }

}
