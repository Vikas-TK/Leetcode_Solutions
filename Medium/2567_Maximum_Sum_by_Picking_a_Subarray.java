class Solution {
    public int minimizeSum(int[] a) {
        Arrays.sort(a);
        int n=a.length;
        int one=a[n-1]-a[2];
        int two=a[n-2]-a[1];
        int three=a[n-3]-a[0];
        return Math.min(one,Math.min(two,three));
    }
}
