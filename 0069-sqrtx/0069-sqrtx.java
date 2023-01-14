class Solution {
    public int mySqrt(int x) {
        if(x==1)
            return 1;
        else if(x==0)
            return 0;
        long i = x;
	    while(i > x / i)  
        {
            i = (i + x / i) / 2;
        }
        return (int)i;
        
    }
}
