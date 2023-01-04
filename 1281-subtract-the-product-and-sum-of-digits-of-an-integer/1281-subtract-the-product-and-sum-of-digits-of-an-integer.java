class Solution {
    public int subtractProductAndSum(int n) {
        int s=0,p=1,rem;
        while(n>0)
        {
            rem=n%10;
            s=s+rem;
            p=p*rem;
            n=n/10;
        }
       return p-s;
    }
}