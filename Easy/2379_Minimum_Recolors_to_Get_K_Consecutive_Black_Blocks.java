class Solution {
    public int minimumRecolors(String b, int k) {
        int c=0;
        int n=b.length();
        int mn=0;
        for(int i=0;i<k;i++){
            if(b.charAt(i)=='W'){
                c++;
            }
        }
        mn=c;
        
        for(int i=k;i<n;i++){
            int j=i-k;
            if(b.charAt(j)=='W'){
                c--;
            }
            if(b.charAt(i)=='W'){
                c++;
            }
            mn=Math.min(c,mn);
            if(mn<=0){
                mn=0;
            }
        }
        return mn;
    }
}
