class Solution {
    public String convertToBase7(int num) {
        if(num==0){
            return "0";
        }
        boolean n=num<0;
        num=Math.abs(num);
        StringBuilder res=new StringBuilder();
        while(num>0){
            res.append(num%7);
            num=num/7;
        }
        if(n){
            res.append('-');
        }
        return res.reverse().toString();
    }
}