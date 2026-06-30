class Solution {
    public int reverse(int x) {
        int rem=0;
        while(x!=0){
            int temp=x%10;
            int remm=rem*10+temp;
            if((remm-temp)/10!=rem){
                return 0;
            }
            rem=remm;
            x/=10;
        }
        return rem;
    }
}
