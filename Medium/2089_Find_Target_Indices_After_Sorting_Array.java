class Solution {
    public List<Integer> targetIndices(int[] a, int t) {
        List<Integer> list=new ArrayList<>();
        Arrays.sort(a);
        for(int i=0;i<a.length;i++){
            if(a[i]==t){
                list.add(i);
            }
        }
        return list;
    }
}
