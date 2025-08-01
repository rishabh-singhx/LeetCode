class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> ans = new ArrayList<>();
        List<Integer> first = new ArrayList<>();
        first.add(1);
        ans.add(first);
        if(numRows==1)
            return ans;
        List<Integer> second = new ArrayList<>();
        second.add(1);
        second.add(1);
        ans.add(second);
        if(numRows==2)
            return ans;
        for(int i=2;i<numRows;i++){
            List<Integer> x = new ArrayList<>();
            x.add(1);
            for(int j=0;j<ans.get(i-1).size()-1;j++){
                x.add(ans.get(i-1).get(j)+ans.get(i-1).get(j+1));
            }
            x.add(1);
            ans.add(x);
        }
        return ans;
    }
}