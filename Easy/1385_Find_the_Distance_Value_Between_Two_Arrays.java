class Solution {
    public int findTheDistanceValue(int[] a1, int[] a2, int d) {
        int n=a1.length;
        int m=a2.length;
        int count=0;
        for(int i=0;i<n;i++){
            boolean flag=true;
            for(int j=0;j<m;j++){
                if(Math.abs(a1[i]-a2[j])<=d){
                    flag=false;
                    break;
                }
            }
            if(flag==true){
                count++;
            }
        }
        return count;
    }
}
