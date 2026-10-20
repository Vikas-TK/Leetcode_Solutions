class Solution {
    public int[] findErrorNums(int[] a) {
        int n=a.length;
        int[] m=new int[n+1];
        int ab=-1,b=-1;
        for(int i=0;i<n;i++){
            m[a[i]]++;
        }
        for(int i=1;i<m.length;i++){
            if(m[i]==2){
                ab=i;
            }
            if(m[i]==0){
                b=i;
            }
        }
        return new int[]{ab,b};
    }
}
