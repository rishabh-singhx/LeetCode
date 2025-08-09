class Solution {
    public boolean isPowerOfTwo(int n) {
         return n > 0 && (n & (n - 1)) == 0;
        // for(int i=0;i<=30;i++){
        //     if(Math.pow(2,i)==n)
        //         return true;
        // }
        // return false;


    }
}