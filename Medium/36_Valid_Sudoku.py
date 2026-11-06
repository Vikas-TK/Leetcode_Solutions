class Solution {
    public boolean isValidSudoku(char[][] a) {
        Set set=new HashSet();
        for(int i=0;i<9;i++){
            for(int j=0;j<9;j++){
                if(a[i][j]!='.'){
                    String b="("+a[i][j]+")";
                    if(!set.add(b+i)||!set.add(j+b)||!set.add(i/3+b+j/3)){
                        return false;
                    }
                }
            }
        }
        return true;
    }
}
