class Solution {
    public int mySqrt(int x) {
	    
        // if(x==1)
	    // return 1;
	    // else if(x==0)
	    // return 0;
	    // long i = x;
	    // while(i > x / i)  
	    // {
	    // i = (i + x / i) / 2;
	    // }
	    // return (int)i;
        
        int lb=1,ub=x,mid;
        while(lb<=ub)
        {
            mid=(lb+ub)/2;
            if(x/mid==mid)
                return mid;
            else if(mid>x/mid)
                ub=mid-1;
            else
                lb=mid+1;
        }
        return ub;
    }
}
