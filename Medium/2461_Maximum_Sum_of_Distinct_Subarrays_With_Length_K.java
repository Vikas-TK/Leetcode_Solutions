class Solution {
    public long maximumSubarraySum(int[] nums, int k) {
        int n=nums.length;
        long sum=0,max=0;
        // if(n>=k){
        //     return 0;
        // }

        HashMap<Integer,Integer> m1=new HashMap<>();
        for(int i=0;i<k;i++){
            m1.put(nums[i],m1.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
        }
        if(m1.size()==k){
            max=Math.max(sum,max);
        }
        for(int i=k;i<n;i++){
            
            int j=i-k;
            if(m1.get(nums[j])>1){
                m1.put(nums[j],m1.get(nums[j])-1);
            }else{
                m1.remove(nums[j]);
            }
            sum-=nums[j];
            m1.put(nums[i],m1.getOrDefault(nums[i],0)+1);
            sum+=nums[i];
            
            if(m1.size()==k){
                max=Math.max(sum,max);
            }
        }
        return max;
    }
}
