class Solution {
    public int scoreOfParentheses(String s) {
        int n=s.length();
        Stack<Integer> st=new Stack<>();
        st.push(0);
        for(char ch:s.toCharArray()){
            if(ch=='('){
                st.push(0);
            }else{
            int v=st.pop();
            int count=(v==0) ? 1 : 2*v;
            st.push(st.pop()+count);
        }
    }
        return st.peek();
    }
}
