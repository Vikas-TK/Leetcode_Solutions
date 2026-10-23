class Solution {
    public int sortPermutation(int[] a) {
        int n=a.length;
        int ans=-1;
        for(int i=0;i<n;i++){
            if(a[i]!=i){
                if(ans==-1) ans=a[i];
                else ans&=a[i];
            }
        }
        return ans==-1 ? 0 : ans;
    }
}
