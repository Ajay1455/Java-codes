import java.util.*;

class BubbleSort {

    public static void BubbleSort(int[] array) {
        {
            int temp;
            for (int i = 0; i < array.length - 1; i++) {
                for (int j = 0; j < array.length - 1 - i; j++) {
                    if (array[j - 1] > array[j]) {
                        temp = array[j - 1];
                        array[j - 1] = array[j];
                        array[j] = temp;
                    }
                }
            }
        }

    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        int arr[] = new int[] { 2, 6, 5, 7, 3, 1, 4 };
        BubbleSort(arr);

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i]+" ");
        }
    }
}