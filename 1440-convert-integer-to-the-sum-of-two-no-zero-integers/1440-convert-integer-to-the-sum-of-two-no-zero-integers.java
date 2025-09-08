class Solution {
    public int[] getNoZeroIntegers(int n) {
        for(int i=1;i<=10000;i++){
            if(!check(i) && !check(n-i)){
                return new int[]{i,n-i};
            }
        }
        return new int[]{};
    }
    public boolean check(int n){
        String s = ""+n;
        return s.contains("0");
    }
}