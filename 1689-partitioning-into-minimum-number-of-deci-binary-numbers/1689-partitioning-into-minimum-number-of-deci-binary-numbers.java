class Solution {
    public int minPartitions(String n) {
        int max=0;
        for(int i=0;i<n.length();i++)
        {
            int x=Integer.parseInt(String.valueOf(n.charAt(i)));
            if(x>max)
            {
                max=x;
                if(max==9)
                    break;
            }
        }
        return max;
    }
}