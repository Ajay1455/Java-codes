import java.util.*;
public class MergeArray {
    
    public static void mergeArrays(int arr[], int n, int arr1[], int m, int arr2[]){
        int i=0;
        int j=0;
        int k=0;
    
        while(i<n && j<m){
            if(arr[i]>arr1[j]){
                arr2[k++]=arr1[j++];
            }else{
                arr2[k++]=arr[i++];
            }
        }
        while(i<n){
            arr2[k++]=arr[i++];
        }
        while(j<m){
            arr2[k++]=arr1[j++];
        }
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int arr[]={5, 9, 15, 25 ,36, 41, 50};
        int arr1[]={3, 4, 5, 10, 19 ,47};
        int n=arr.length+arr1.length;
        int []finalArray=new int[n];

        mergeArrays(arr, arr.length, arr1, arr1.length, finalArray);
        System.out.println("The Final Merge Array :  ");
        for(int i=0; i<n; i++){
            System.out.print(finalArray[i]+" ");
        }
    }
}
