class Solution {
    public List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        int mx=candies[0];
        for(int i=0;i<candies.length;i++)
        {
            mx=Math.max(candies[i],mx);
        }
        ArrayList<Boolean> lst=new ArrayList<>(candies.length);
        for(int i=0;i<candies.length;i++)
        {
            if((candies[i]+extraCandies)>=mx)
                lst.add(true);
            else
                lst.add(false);
        }
        return lst;
    }
}