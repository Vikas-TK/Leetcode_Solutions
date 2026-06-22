class Solution {
    public boolean isHappy(int n) {
       int l=n;
       int r=n;
       while(true){
        l=square(l);
        r=square(square(r));
        if(l==r){
            break;
        }
       }
       return l==1;
    }
    public int square(int num){
        int m=0;
        while(num>0){
            int rem=num%10;
            m+=rem*rem;
            num=num/10;
        }
        return m;
    }
}