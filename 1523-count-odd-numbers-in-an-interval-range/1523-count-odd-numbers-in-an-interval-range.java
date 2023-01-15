class Solution {
    public int countOdds(int low, int high) {
        int diff=high-low-1;
        if(low%2==1&&high%2==1)
        {
            if(low==high)
                return 1;
            else
                return diff/2 + 2 ;
        }
        else if(low%2==0&&high%2==0)
        {
            if(low==high)
                return 0;
            else
                return diff/2 + 1 ;
        }
        else if(low%2==0&&high%2==1)
            return diff/2 +1;
        else if(low%2==1&&high%2==0)
            return diff/2 +1;
        return -1;
    }
}