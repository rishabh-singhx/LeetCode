class Solution {
    public int minPatches(int[] nums, int n) {
        return CountMissing(nums,n);
    }
    public static int CountMissing(int [] arr,int n) {
		int count=0;
		long missing=1;
		int i=0;
		while(missing<=n) {
			if(i<arr.length && missing>=arr[i]) {
				missing+=arr[i];
				i++;
			}
			else {
				missing+=missing;
				count++;
			}
		}
		return count;
	}
}