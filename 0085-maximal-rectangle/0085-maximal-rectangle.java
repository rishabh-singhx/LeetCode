class Solution {
    public int maximalRectangle(char[][] matrix) {
        int arr[]=new int [matrix[0].length];
		int n=matrix.length;
		int ans=0;
        for (int i = n-1; i >=0; i--) {
			for (int j = 0; j < arr.length; j++) {
				if(matrix[i][j]=='1') {
					arr[j]=arr[j]+1;
				}
				else {
					arr[j]=0;
				}
			}
			int area=Area(arr);
			ans=Math.max(ans, area);
		}
        return ans;
    }
    public static int Area(int []arr) {
		int ans=0;
		Stack<Integer> st=new Stack<>();
		for (int i = 0; i < arr.length; i++) {	
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int h=arr[st.pop()];
				int r=i;
				if(st.isEmpty()) {
					int a=h*r;
					ans=Math.max(ans, a);
				}
				else {
					int l=st.peek();
					int a=h*(r-l-1);
					ans=Math.max(ans, a);
				}
			}
			st.push(i);
		}
		int r=arr.length;
		while(!st.isEmpty()) {
			int h=arr[st.pop()];
			if(st.isEmpty()) {
				int a=h*r;
				ans=Math.max(ans, a);
			}
			else {
				int l=st.peek();
				int a=h*(r-l-1);
				ans=Math.max(ans, a);
			}
		}
		return ans;
	}
}