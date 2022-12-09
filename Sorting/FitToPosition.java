public class FitToPosition {

    static void printArray(int[] arr, int size) {
        for (int i = 0; i < size; i++)
            System.out.print(arr[i] + " ");

        System.out.println();
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    public static int[] index(int[] arr, int l, int h) {
        int x = arr[h];
        int ans = 0;
        for (int i = 0; i <= h; i++) {
            if (arr[i] <= x) {
                swap(arr, i, ans);
                ans++;
            }
        }
        swap(arr, ans, h);
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 5, 9, 1, 3, 4 };
        System.out.println("Before correct index : ");
        printArray(arr, arr.length);

        index(arr, 0, arr.length - 1);
        System.out.println("After correct index : ");
        printArray(arr, arr.length);

    }
}
