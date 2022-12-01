class Solution {
    public String smallestNumber(String pattern) {
        return(Smallest_Number(pattern));
    }
    public static String Smallest_Number(String str) {
		int ans[]=new int[str.length()+1];
		int count =1;
        String nayi="";
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
        for (int i = 0; i < ans.length; i++) {
			nayi=nayi+Integer.toString(ans[i]);
		}
        return nayi;
    }
}
