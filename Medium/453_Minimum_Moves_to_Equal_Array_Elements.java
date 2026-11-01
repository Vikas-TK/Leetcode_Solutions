class Solution {
    public int minMoves(int[] a) {
        int l=Arrays.stream(a).min().getAsInt(), m=0;
        for(int x : a) m+=x-l;
        return m;
    }
}
