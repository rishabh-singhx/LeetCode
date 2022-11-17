class Solution {
    public boolean isPalindrome(int x) {
     int r,rem,s=0,n=x,m=x;
        if(n>=0)
        {
            while(n>0)
            {
                r=n%10;
                s=s*10+r;
                n=n/10;
            }
            if(s==m)
                return true;
            else
                return false;
        }
        else
        {
            return false;
        }
        
    }
}