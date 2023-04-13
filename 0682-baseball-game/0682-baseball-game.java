class Solution {
    public int calPoints(String[] operations) {
        String a[]=operations;
		Stack<Integer> st=new Stack<>();
			for(int j=0;j<a.length;j++)
			{
               
				if(a[j].charAt(0)=='C')
					st.pop();
				else if(a[j].charAt(0)=='D')
					st.push(st.peek()*2);
				else if(a[j].charAt(0)=='+')
				{
					int x=st.pop();
					int y=st.peek();
					st.push(x);
					st.push((x+y));	
				}
				else
					st.push(Integer.parseInt(a[j]));
                 System.out.print(st+" ");
			}
            
			int sum=0;
			while(st.size()>0)  		
				sum=sum+st.pop();
			return sum;
    }
}