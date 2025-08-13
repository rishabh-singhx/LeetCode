class Solution {
    public boolean isPowerOfThree(int n) {
        long temp = n;
        int i=0;
        while(true){
            if(temp == (long)Math.pow(3,i))
                return true;
            else if(temp < (long)Math.pow(3,i))
                break;
            i++;
        }
        return false;   
    }
}