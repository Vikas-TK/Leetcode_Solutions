class Solution {
    public int minStartValue(int[] a) {
        int n=a.length;
        int[] pre=new int[n];
        int mn=0;
        pre[0]=a[0];
        for(int i=1;i<n;i++){
            pre[i]=pre[i-1]+a[i];
        }
        for(int x:pre){
            if(x<=mn){
                mn=x;
            }
        }
        return 1-mn;
    }
}
