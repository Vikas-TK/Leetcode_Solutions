class Solution {
    public List<Integer> findAnagrams(String s, String p) {
        int n=s.length();
        int k=p.length();
        Map<Character,Integer> m1=new HashMap<>();
        Map<Character,Integer> m2=new HashMap<>();
        List<Integer> list=new ArrayList<>();
        if(n<k){
            return list;
        }
        for(int i=0;i<k;i++){
            m1.put(p.charAt(i),m1.getOrDefault(p.charAt(i),0)+1);
            m2.put(s.charAt(i),m2.getOrDefault(s.charAt(i),0)+1);
        }
        if(m1.equals(m2)){
            list.add(0);
        }
        for(int i=k;i<n;i++){
            int j=i-k;
            m2.put(s.charAt(i),m2.getOrDefault(s.charAt(i),0)+1);
            if(m2.get(s.charAt(j))>1){
                m2.put(s.charAt(j),m2.get(s.charAt(j))-1);
            }else{
                m2.remove(s.charAt(j));
            }
            if(m1.equals(m2)){
                list.add(i-k+1);
            }
        }
        return list;
    }
}
