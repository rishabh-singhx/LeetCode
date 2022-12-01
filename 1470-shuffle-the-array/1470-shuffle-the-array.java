class Solution {
    public int[] shuffle(int[] nums, int n) {
        int c=0,d=n;
        int a[]=new int[2*n];
        for(int i=0;i<(2*n);i=i+2)
        {
            a[i]=nums[c++];
            a[i+1]=nums[d++];
        }
        return a;
    }
}