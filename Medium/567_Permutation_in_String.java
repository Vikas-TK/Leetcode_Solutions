class Solution {
    public boolean checkInclusion(String s1, String s2) {
        HashMap<Character,Integer> m1=new HashMap<>();
        HashMap<Character,Integer> m2=new HashMap<>();
        int k=s1.length();
        int n=s2.length();
        if(k>n){
            return false;
        }
        for(int i=0;i<k;i++){
            m1.put(s1.charAt(i),m1.getOrDefault(s1.charAt(i),0)+1);
            m2.put(s2.charAt(i),m2.getOrDefault(s2.charAt(i),0)+1);
        }
        if(m1.equals(m2)){
            return true;
        }
        for(int i=k;i<n;i++){
            int j=i-k;
            m2.put(s2.charAt(i),m2.getOrDefault(s2.charAt(i),0)+1);
            if(m2.get(s2.charAt(j))==1){
                m2.remove(s2.charAt(j));
            }else{
                m2.put(s2.charAt(j),m2.get(s2.charAt(j))-1);
            }
            if(m1.equals(m2)){
                return true;
            }
        }
        return false;
    }
}
