public class BinarySearch {
    public static int binarySearch(int arr[],int k){
        int end=arr.length-1;
        int start=0;
        int mid=(start+end)/2;
        while(start<=end){
            if(arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                end=mid;
            }else if(arr[mid]<k){
                start=mid+1;
            }
            // mid=(start+end)/2;
            mid = start + (end-start)/2;
        }

        return -1;
    }

    public static int firstOccurence(int arr[],int k){
        int end=arr.length-1;
        int start=0;
        int mid=(start+end)/2;
        while(start<=end){
            if((mid==0 || k>arr[mid])&& arr[mid]==k){
                return mid;
            }
            else if(arr[mid]>k){
                end=mid;
            }else if(arr[mid]<k){
                start=mid+1;
            }
            // mid=(start+end)/2;
            mid = start + (end-start)/2;
        }

        return -1;
    }

    public static void main(String[] args) {
        int array[]=new int[]{2,5,7,12,12,16};
        // int result=binarySearch(array,12);
        int result=firstOccurence(array,12);

        System.out.println(result);
        if(result==-1){
            System.out.println("The number is not found in Array");
        }else{
            System.out.println("The number is found at index : "+result);
        }
    }
}
