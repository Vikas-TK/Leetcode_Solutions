class Solution {
    public int sumOddLengthSubarrays(int[] a) {
        int n=a.length;
        int[] pre=new int[n+1];
        
        for(int i=0;i<n;i++){
            pre[i+1]=pre[i]+a[i];
        }
        int ans=0;
        for(int i=0;i<n;i++){
            for(int j=i;j<n;j+=2){
                ans+=pre[j+1]-pre[i];
            }
        }
        return ans;
    }
}
