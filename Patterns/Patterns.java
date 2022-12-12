public class Patterns {
    public static void main(String[] args) {
        int i, j;
        int n = 5;

        // Hollow Square
        // for (i = 1; i <= n; i++)
        // {
        // for (j = 1; j <= n; j++)
        // {
        // if (i == 1 || i == n ||
        // j == 1 || j == n)
        // System.out.print("*");
        // else
        // System.out.print(" ");
        // }
        // System.out.println();
        // }

        // triangle
        // for(i=1; i<=n; i++){
        // for(j=1; j<=i; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // Inverted triangle
        // for(i=1; i<=n; i++){
        // for(j=1; j<=n-i; j++){
        // System.out.print("*");
        // }
        // System.out.println("");
        // }

        // Hollow Triangle
        // for (i = 1; i <= n; i++) {
        // for (j = 1; j <= i; j++) {
        // // int col = i;
        // if (i == 1 || i == n ||j==1 || j == i ) {
        // System.out.print("*");
        // } else {
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // hollow diamond
        // Upper part of hollow diamond
        for (i = 1; i <= n; i++) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        // lower part of diamond
        for (i = n; i >= 1; i--) {
            for (j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }
            for (j = 1; j <= 2 * i - 1; j++) {
                if (i == 1 || j == 1 || j == 2 * i - 1) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }

        // Left right triangle
        // for (i = 1; i <= n; i++) {
        // for (j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (j = 1; j <= i; j++) {
        // System.out.print("*");
        // }
        // System.out.println();

        // }

        // Square Using While loop
        // i=1;
        // j=1;
        // while(i<=n){
        // j=1;
        // while(j<=n){
        // System.out.print("*");
        // j=j+1;
        // }
        // System.out.println();
        // i=i+1;
        // }

    }
}
