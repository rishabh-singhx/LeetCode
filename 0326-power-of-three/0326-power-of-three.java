class Solution {
    public boolean isPowerOfThree(int n) {
        // long temp = n;
        // int i=0;
        // while(true){
        //     if(temp == (long)Math.pow(3,i))
        //         return true;
        //     else if(temp < (long)Math.pow(3,i))
        //         break;
        //     i++;
        // }
        // return false; 


        // Largest power of three in 32-bit int is 3^19 = 1162261467
        return n > 0 && 1162261467 % n == 0;  
    }
}