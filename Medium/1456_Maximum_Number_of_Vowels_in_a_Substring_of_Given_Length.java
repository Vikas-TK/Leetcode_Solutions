class Solution {
    public boolean vowel(char c){
        if(c=='a'||c=='e'||c=='i'||c=='o'||c=='u'){
            return true;
        }
        return false;
    }
    public int maxVowels(String s, int k) {
        int n=s.length();
        int mx=Integer.MIN_VALUE;
        int c=0;
        for(int i=0;i<k;i++){
            if(vowel(s.charAt(i))){
                c++;
            }
        }
        mx=Math.max(c,mx);
        for(int i=k;i<n;i++){
            int j=i-k;
            if(vowel(s.charAt(j))){
                c--;
            }
            if(vowel(s.charAt(i))){
                c++;
            }
            mx=Math.max(c,mx);
        }
        return mx;
    }
}
