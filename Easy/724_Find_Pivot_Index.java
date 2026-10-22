class Solution {
    public int pivotIndex(int[] a) {
        int n=a.length;
        int m=n-1;
        int[] pre=new int[n];
        int[] suf=new int[n];
        pre[0]=a[0];
        suf[m]=a[m];
        for(int i=1;i<n;i++){
            pre[i]=a[i]+pre[i-1];
        }
        for(int i=n-2;i>=0;i--){
            suf[i]=a[i]+suf[i+1];
        }
        for(int i=0;i<n;i++){
            if(pre[i]==suf[i]){
                return i;
            }
        }
        return -1;
    }
}
