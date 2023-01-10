class Solution {
    public int reverse(int x) {
        int n=x;
        int r;
        long s=0;
        if(n>=0)
        {
            while(n>0)
            {
                r=n%10;
                s=s*10+r;
                n=n/10;
            }
        }
        else
        {
            n=n*-1;
            while(n>0)
            {
                r=n%10;
                s=s*10+r;
                n=n/10;
            }
            s=s*-1;
        }
        if(s>2147483647||s<-2147483648)
            return 0;
        else
            return (int)s;
    }
}