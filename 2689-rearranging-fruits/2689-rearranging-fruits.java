public class Solution {
    public long minCost(int[] basket1, int[] basket2) {
        Map<Integer, Integer> countMap = new HashMap<>();

        // Count total frequencies from both baskets
        for (int x : basket1)
            countMap.put(x, countMap.getOrDefault(x, 0) + 1);
        for (int x : basket2)
            countMap.put(x, countMap.getOrDefault(x, 0) + 1);

        // Check if each fruit has even total count
        for (int val : countMap.values()) {
            if (val % 2 != 0)
                return -1;
        }

        // Count individual frequencies
        Map<Integer, Integer> count1 = new HashMap<>();
        for (int x : basket1)
            count1.put(x, count1.getOrDefault(x, 0) + 1);

        Map<Integer, Integer> count2 = new HashMap<>();
        for (int x : basket2)
            count2.put(x, count2.getOrDefault(x, 0) + 1);

        List<Integer> toSwap1 = new ArrayList<>();
        List<Integer> toSwap2 = new ArrayList<>();

        for (int fruit : countMap.keySet()) {
            int total = countMap.get(fruit);
            int diff = count1.getOrDefault(fruit, 0) - total / 2;

            if (diff > 0) {
                for (int i = 0; i < diff; i++)
                    toSwap1.add(fruit);
            } else if (diff < 0) {
                for (int i = 0; i < -diff; i++)
                    toSwap2.add(fruit);
            }
        }

        Collections.sort(toSwap1); // ascending
        toSwap2.sort(Collections.reverseOrder()); // descending

        int minFruit = Integer.MAX_VALUE;
        for (int x : basket1)
            minFruit = Math.min(minFruit, x);
        for (int x : basket2)
            minFruit = Math.min(minFruit, x);

        long totalCost = 0;
        for (int i = 0; i < toSwap1.size(); i++) {
            int a = toSwap1.get(i);
            int b = toSwap2.get(i);
            totalCost += Math.min(Math.min(a, b), 2 * minFruit);
        }

        return totalCost;
    }
}
