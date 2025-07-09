class Solution {
    public int[] intersection(int[] nums1, int[] nums2) {
        HashSet<Integer> set = new HashSet<>();
        for(int i=0;i<nums1.length;i++){
            set.add(nums1[i]);
        }
        HashSet<Integer> set2 = new HashSet<>();
        for(int i=0;i<nums2.length;i++){
            if(set.contains(nums2[i]))
                set2.add(nums2[i]);
        }
        ArrayList<Integer> l = new ArrayList<>(set2);
        int arr[] = new int[l.size()];
        for(int i=0;i<arr.length;i++)
            arr[i] = l.get(i);
        return arr;
    }
}