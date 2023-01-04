class Solution {
    public boolean isStrictlyPalindromic(int n) {
        for(int i=2;i<=n-2;i++)
        {
            if(check(n,i))
            {
                
            }
            else
            {
                return false;
            }
        }
        return true;
    }
    public static boolean check(int n,int b)
    {
        int rem=0;
        int no=0;
        int c=0;
        while(n>0)
        {
            rem=n%b;
            no=no+rem*(int)Math.pow(10,c);
            n=n/b;
            c++;
        }
        if(reverse(no)==no)
            return true;
        else
            return false;
    }
    public static int reverse(int n)
    {
        int rem=0;
        int s=0;
        while(n>0)
        {
            rem=n%10;
            s=s*10+rem;
            n=n/10;    
        }
        return s;
    }
}