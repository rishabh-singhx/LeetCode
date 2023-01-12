class Solution {
    public int addDigits(int num) {
        int n=num;
        int nn=num;
        int s=0;
        while(n>9)
        {
            num=n;
            s=0;
            while(num>0)
            {
                int rem=num%10;
                s=s+rem;
                num=num/10;
            }
            n=s;
        }
        if(nn<10)
            return nn;
        return s;
    }
}