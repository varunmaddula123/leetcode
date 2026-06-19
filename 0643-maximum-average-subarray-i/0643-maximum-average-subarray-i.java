class Solution {
    public double findMaxAverage(int[] nums, int k) {
        double maxi=Double.MIN_VALUE,s=0;
        for(int i=0;i<k;i++){
            s=s+nums[i];
        }
        maxi=s/k;
        for(int i=0;i<nums.length-k;i++){
            s=s-nums[i]+nums[i+k];
            maxi=Math.max(maxi,s/k);
        }
        return maxi;
    }
}