class Solution {
    public int subarrayBitwiseORs(int[] arr) {
        
        Set<Integer> resultSet = new HashSet<>();
        Set<Integer> prev = new HashSet<>();

        for (int num : arr) {
            Set<Integer> curr = new HashSet<>();
            curr.add(num);
            for (int prevOr : prev) {
                curr.add(prevOr | num);
            }
            resultSet.addAll(curr);
            prev = curr;
        }
        return resultSet.size();
    }
}