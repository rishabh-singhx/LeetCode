class Solution {
    public boolean isPerfectSquare(int num) {
        long sq,mid,lb=1,ub=num;
        while(lb<=ub)
        {
            mid=lb+(ub-lb)/2;
            sq=mid*mid;
            if(sq==num)
                return true;
            else if(sq>num)
                ub=mid-1;
            else if(sq<num)
                lb=mid+1;
        }
         return false;      
    }
}