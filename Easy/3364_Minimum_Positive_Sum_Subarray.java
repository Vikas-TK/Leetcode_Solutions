class Solution {
    public int minimumSumSubarray(List<Integer> nums, int l, int r) {
        int n=nums.size();
		int mn=Integer.MAX_VALUE;
		for(int i=0;i<n;i++){
		    int sum=0;
		    for(int j=i;j<n&&j<i+r;j++){
		        sum+=nums.get(j);
		        int len=j-i+1;
		        if(len>=l&&sum>0){
		            mn=Math.min(mn,sum);
		        }
		    }
		}
		return mn==Integer.MAX_VALUE ? -1 : mn;
    }
}
