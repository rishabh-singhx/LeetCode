class Solution {
    public int sumOddLengthSubarrays(int[] arr) {
        int s=0;
        
        int a[]=new int[arr.length];
        a[0]=arr[0];
        for(int i=1;i<arr.length;i++)
            a[i]=arr[i]+a[i-1];
        
        for(int i=1;i<=a.length;i=i+2)
        {
            int si=0;
            int ei=i-1;
            s=s+a[ei];
            ei++;
            while(ei<a.length)
            {
                s=s+a[ei]-a[si];
                ei++;
                si++;
            }
        }
        
        return s;
    }
}