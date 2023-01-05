class Solution {
    public List<Integer> getRow(int rowIndex) {
        int i=0;
		long val=1;
        int row=rowIndex;
        List<Integer> rowss = new ArrayList();
		while(i<(rowIndex+1)) 
		{
				rowss.add((int)val);
				val=(row-i)*val/(i+1);
				i++;
		}
        return rowss;
    }
}