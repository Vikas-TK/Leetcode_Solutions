class Solution {
    public int minAddToMakeValid(String s) {
        int count=0;
        int res=0;
        for(char ch:s.toCharArray()){
            if(ch=='('){
                count++;
            }else{
                if(count>0){
                    count--;
                }else{
                    res++;
                }
            }
        }
        return count+res;
    }
}
