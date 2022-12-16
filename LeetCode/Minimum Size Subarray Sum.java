class Solution {
    public int minSubArrayLen(int target, int[] nums) {
        int j=0;
        int sum=0;
        int ans=Integer.MAX_VALUE;
        for(int i=0; i<nums.length; i++){
            sum+=nums[i];
            while(sum >= target){
                ans=Math.min(ans,i-j+1);
                sum-=nums[j++];
            }
        }
        if(ans == Integer.MAX_VALUE){
            return 0;
        }else{
            return ans;
        }
    }
}