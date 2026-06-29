class Solution {
    public int longestOnes(int[] nums, int k) {
        int l=0;
        int max=0;
        int c=0;
        int n=nums.length;
        for(int r=0;r<n;r++){
            if(nums[r]==0){
                c++;
            }
            while(c>k){
                if(nums[l]==0){
                    c--;
                }
                l++;
            }
            int cc=r-l+1;
            max=Math.max(cc,max);
        }
        return max;
    }
}
