class Solution {
    public List<List<Integer>> generate(int numRows) {
        int n=numRows;
        List<List<Integer>> x = new ArrayList<List<Integer>>();
		int row=0;
		int star=1;
		while(row<n)
		{
			int i=0;
			int val=1;
            List<Integer> rowss = new ArrayList();
			while(i<star) 
			{
				rowss.add(val);
				val=(row-i)*val/(i+1);
				i++;
			}
			star++;
			x.add(rowss);
            row++;
		}
        return x;
    }
}