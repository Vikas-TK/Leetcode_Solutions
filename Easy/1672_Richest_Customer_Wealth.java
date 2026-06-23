class Solution {
    public int maximumWealth(int[][] accounts) {
        int r=accounts.length;
        int c=accounts[0].length;
        List<Integer> list=new ArrayList<>();
        for(int i=0;i<r;i++){
            int sum=0;
            for(int j=0;j<c;j++){
                sum+=accounts[i][j];
            }
            list.add(sum);
        }
        int mx=Collections.max(list);
        return mx;
    }
}