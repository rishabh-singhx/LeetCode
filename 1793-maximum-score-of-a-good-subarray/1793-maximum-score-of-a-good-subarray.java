class Solution {
    public int maximumScore(int[] nums, int k) {
        return Area(nums,k);
    }
    public static int Area(int []arr,int k) {
		int ans=0;
		Stack<Integer> st=new Stack<>();
		for (int i = 0; i < arr.length; i++) {	
			while(!st.isEmpty() && arr[i]<arr[st.peek()]) {
				int h=arr[st.pop()];
				int r=i;
				if(r-1>=k){
					if(st.isEmpty()) {
						int a=h*r;
						ans=Math.max(ans, a);
					}
					else {
						int l=st.peek();
						if(l+1<=k){
							int a=h*(r-l-1);
							ans=Math.max(ans, a);
						}
					}
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
				if(l+1<=k){
				int a=h*(r-l-1);
				ans=Math.max(ans, a);
				}
			}
		}
		return ans;
	}
}