class Solution {
    public int divide(int dividend, int divisor) {
        long q=(long)dividend/divisor;
        if(q>2147483647)
            return 2147483647;
        else if(q<-2147483648)
            return -2147483648;
        else
            return (int)q;
    }
}