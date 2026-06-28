class Solution {
    public int numOfSubarrays(int[] arr, int k, int t) {
        int avg=0,sum=0,n=arr.length,c=0;
        for(int i=0;i<k;i++){
            sum+=arr[i];
        }
        avg=sum/k;
        if(avg>=t){
            c++;
        }
        for(int i=k;i<n;i++){
            int j=i-k;
            sum-=arr[j];
            sum+=arr[i];
            avg=sum/k;
            if(avg>=t){
                c++;
            }
        }
        return c;
    }
}
