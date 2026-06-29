class Solution {
    public int totalFruit(int[] a) {
        Map<Integer,Integer> m1=new HashMap<>();
        int l=0,max=0,r=0;
        int n=a.length;
        while(r<n){
            m1.put(a[r],m1.getOrDefault(a[r],0)+1);
            while(m1.size()>=3){
                m1.put(a[l],m1.get(a[l])-1);
                if(m1.get(a[l])==0){
                    m1.remove(a[l]);
                }
                l++;
            }
            int c=r-l+1;
            max=Math.max(c,max);
            r++;
        }
        return max;
    }
}
