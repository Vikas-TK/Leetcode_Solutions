class Solution {
    public int maximumCount(int[] nums) {
        int pc=0;
        int nc=0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]>0){
                pc++;
            }else if(nums[i]<0){
                nc++;
            }
        }
        int m=Math.max(pc,nc);
        return m;
    }
}