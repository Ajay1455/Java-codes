public class PatternsForLoop {
    public static void main(String args[]) {
        int n = 5;
        int i, j;

        // 3. Pyramid
        // int count =0;
        // for (i = 1; i <= n; i++) {
        // for (j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (j = 1; j <= i * 2 - 1; j++) {
        // if (i == n || i == 1 || j==n-i) {
        // System.out.print("*");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // System.out.println();
        // }

        // 3. Hollow Pyramid
        // int count =0;
        // for (i = 1; i <= n; i++) {
        // for (j = 1; j <= n - i; j++) {
        // System.out.print(" ");
        // }
        // for (j = 1; j <= i +count; j++) {
        // if (j == 1 || j == i+count ) {
        // System.out.print("*");
        // }else{
        // System.out.print(" ");
        // }
        // }
        // count++;
        // System.out.println();
        // }
        // for(j=1; j<n+1; j++ ){
        // System.out.print("* ");
        // }


        // 4. hollow pyramid
        // for (i = 1; i <= n; i++) {
        //     for (j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //         for (j = 1; j <= i * 2 - 1; j++) {
        //             if (i == 1 || i == n || j == 1 || j == i * 2 - 1){
        //             System.out.print("*");
        //             }else{
        //                 System.out.print(" ");
        //             }
        //         }
        //     System.out.println();
        // }



        // Diamond
        // for(i=0; i<n; i++){
        //     for(j=0; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(j=0; j<2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
        // for(i=n; i>=0; i--){
        //     for(j=0; j<=n-i; j++){
        //         System.out.print(" ");
        //     }
        //     for(j=0; j<2*i-1; j++){
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }



        // hollow diamond
        // Upper part of hollow diamond
        // for (i = 1; i <= n; i++) {
        //     for (j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (j = 1; j <= 2 * i - 1; j++) {
        //         if (i == 1 || j == 1 || j == 2 * i - 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }
        // lower part of diamond
        // for (i = n; i >= 1; i--) {
        //     for (j = 1; j <= n - i; j++) {
        //         System.out.print(" ");
        //     }
        //     for (j = 1; j <= 2 * i - 1; j++) {
        //         if (i == 1 || j == 1 || j == 2 * i - 1) {
        //             System.out.print("*");
        //         } else {
        //             System.out.print(" ");
        //         }
        //     }
        //     System.out.println();
        // }


    
        }
}
