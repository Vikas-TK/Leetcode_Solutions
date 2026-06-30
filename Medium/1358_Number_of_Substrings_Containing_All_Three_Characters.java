class Solution {
    public int numberOfSubstrings(String s) {
        int l=0,ans=0;
        int n=s.length();
        Map<Character,Integer> m1=new HashMap<>();
        for(int r=0;r<n;r++){
            m1.put(s.charAt(r),m1.getOrDefault(s.charAt(r),0)+1);
            while(m1.size()==3){
                ans+=(n-r);
                m1.put(s.charAt(l),m1.get(s.charAt(l))-1);
                if(m1.get(s.charAt(l))==0){
                    m1.remove(s.charAt(l));
                }
                l++;
            }
        }
        return ans;
    }
}
