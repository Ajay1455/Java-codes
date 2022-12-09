public class SelectionSort {

    public static void SelectionSort(int[] arr) {
        int temp;
        for (int i = 0; i < arr.length - 1; i++) {
            int min = i;
            for (int j = i; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                    temp = arr[min];
                    arr[min] = arr[i];
                    arr[i] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int n=sc.nextInt();
        int arr[] = new int[] { 2, 6, 5, 7, 3, 1, 4 };
        SelectionSort(arr);

        
        





























        
    }
}
