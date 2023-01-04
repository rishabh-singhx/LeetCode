class Solution {
    public int[] createTargetArray(int[] nums, int[] index) {
        ArrayList<Integer> list = new ArrayList<>();
        for(int i=0;i<nums.length;i++)
        {
         list.add(index[i],nums[i]);   
        }
        int a[]=new int[list.size()];
        int c=0;
        for (int v : list)
        {
            a[c]=v;
            c++;
        }
        return a;
    }
}