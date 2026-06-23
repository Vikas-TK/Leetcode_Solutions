class Solution {
    public int findNumbers(int[] nums) {
        int sum=0;
        for(int num:nums){
            int c=String.valueOf(num).length();
            if (c%2==0){
                sum++;
            }
        }
        return sum;
    }
}