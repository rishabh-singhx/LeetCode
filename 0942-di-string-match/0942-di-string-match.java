class Solution {
    public int[] diStringMatch(String s) {
        return(Smallest_Number(s));
    }
    public static int[] Smallest_Number(String str) {
		int ans[]=new int[str.length()+1];
		int count =0;
        for (int i = 0; i <=str.length(); i++) {
			
			if(i==str.length()||str.charAt(i)=='I')
			{
				ans[i]=count;
				count++;
				for (int j = i-1; j>=0 && str.charAt(j)!='I'; j--) {
					ans[j]=count;
					count++;
				}
			}
		}
        return ans;
    }
}



