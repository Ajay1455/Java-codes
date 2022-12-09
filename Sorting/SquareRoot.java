public class SquareRoot {

    public static int squareRootBS(int n){
        int s=0;
        int e=n/2;
        int ans=0;
        
        while(s<=e){
            int mid= s+ (e-s)/2;
            int square=mid*mid;
            if(square<=n){
                ans=mid;
                s=mid+1;
            }
            e=mid-1;
        }
        return ans;
    }
    public static void main(String[] args) {
        int result=squareRootBS(46);
        System.out.print(result);
    }
}
