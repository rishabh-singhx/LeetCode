class Solution {
    public List<Integer> maxScoreIndices(int[] nums) {
        int left[]=new int[nums.length+1];
        int right[]=new int[nums.length+1];
        List<Integer> ll=new ArrayList<>();
        left[0]=0;
        right[right.length-1]=0;
        for(int i=1;i<left.length;i++)
        {
            if(nums[i-1]==0)
                left[i]=left[i-1]+1;
            else
                left[i]=left[i-1];
        }
        for(int i=right.length-2;i>=0;i--)
        {
            if(nums[i]==1)
                right[i]=right[i+1]+1;
            else
                right[i]=right[i+1];
        }
        for(int i=0;i<left.length;i++)
            left[i]=left[i]+right[i];
        int max=left[0];
        for(int i=1;i<left.length;i++)
        {
            if(left[i]>max)
                max=left[i];
        }
        for(int i=0;i<left.length;i++)
        {
            if(left[i]==max)
                ll.add(i);
        }
        return ll;
    }
}