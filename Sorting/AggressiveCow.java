import java.util.*;
public class AggressiveCow {

    public static Boolean isPossible(int arr[], int n, int k, int mid){
        int cowCount=1;
        int lastposition=arr[0];
        for(int i=0; i<n; i++){
            if(arr[i]-lastposition >=mid ){
                cowCount++;
                if(cowCount ==k){
                    return true;
                }
                lastposition=arr[i];
            }
        }
        return false;
    
    }

    public static int withBinary(int arr[], int n, int k){
        int s=0; 
        int maxi=0;
        for(int i=0; i<n; i++){
        //    maxi=max(maxi,arr[i]);
        }
        int e=maxi;
        int mid=s+(e-s)/2;int i=0;
        int ans=-1;
        while(s<e){
            if(isPossible(arr,n,k,mid)){
                ans=mid;
                s=mid+1;
            }else{
                e=mid-1;
            }
            mid=s+(e-s)/2;
        }
        return ans; 
    
    } 
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nos=sc.nextInt();
        int noc=sc.nextInt();
    }
}
