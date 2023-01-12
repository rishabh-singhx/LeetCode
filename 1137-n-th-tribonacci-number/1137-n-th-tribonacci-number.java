class Solution {
    public int tribonacci(int n) {
        int a=0;
        int b=1;
        int c=1;
        if(n==0)
            return 0;
        else if(n==1)
            return 1;
        else if (n==2)
            return 1;
        int d=-1;
        for(int i=0;i<=n-3;i++)
        {
            d=a+b+c;
            a=b;
            b=c;
            c=d;
        }
        
        return d;
    }
}