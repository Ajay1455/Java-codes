public class MergeSort {

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    public static int[]  mergeArrays(int arr[], int n, int arr1[], int m, int arr2[]) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < n && j < m) {
            if (arr[i] > arr1[j]) {
                arr2[k++] = arr1[j++];
            } else {
                arr2[k++] = arr[i++];
            }
        }
        while (i < n) {
            arr2[k++] = arr[i++];
        }
        while (j < m) {
            arr2[k++] = arr1[j++];
        }
        return arr2;
    }

    public static int[] mergeSort(int arr[], int lower, int higher) {

        if(lower==higher){
            int x[]=new int[1];
            return x;
        }
        int mid=(lower+higher)/2;
        int[] n1=mergeSort(arr, lower, mid);
        printArray(n1, n1.length);
        int[] n2=mergeSort(arr, mid+1, higher);
        printArray(n2, n2.length);

        return mergeArrays(n1, n1.length, n2, n2.length, arr);
        // return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 8, 5, 3, 7, 6, 2, 1, 10, 9 };
        System.out.println("Before Merge Sort : ");
        printArray(arr, arr.length);
        mergeSort(arr, 0, arr.length);
        System.out.println("After Merge Sort : ");
        printArray(arr, arr.length);
    }
}
