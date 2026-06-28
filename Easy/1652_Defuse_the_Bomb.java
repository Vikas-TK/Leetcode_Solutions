class Solution {
    public int[] decrypt(int[] a, int k) {
        int n=a.length;
        int[] ans=new int[n];
        if(k==0){
            Arrays.fill(a,0);
            return a;
        }
        for(int i=0;i<n;i++){
            int sum=0;
            if(k>0){
                for(int j=1;j<=k;j++){
                    sum+=a[(i+j)%n];
                }
            }else{
                for(int j=1;j<=-k;j++){
                    sum+=a[(i-j+n)%n];
                }
            }
            ans[i]=sum;
        }
        return ans;
    }
}
