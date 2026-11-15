class Solution {
    public int numOfSubarrays(int[] arr) {
        long e=1;
        long o=0;
        int pre=0;
        int mod = 1000000007;
        for(int a:arr){
            pre+=a;
            if(pre%2==0){
                e++;
            }else{
                o++;
            } 
            
        }
        return (int)((e*o)%mod);
    }
}
