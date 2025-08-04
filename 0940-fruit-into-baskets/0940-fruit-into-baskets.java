public class Solution {
    public int totalFruit(int[] fruits) {
        Map<Integer, Integer> basket = new HashMap<>();
        int start = 0, maxFruits = 0;

        for (int end = 0; end < fruits.length; end++) {
            // Add current fruit to the basket
            basket.put(fruits[end], basket.getOrDefault(fruits[end], 0) + 1);

            // If we have more than 2 types, shrink the window
            while (basket.size() > 2) {
                basket.put(fruits[start], basket.get(fruits[start]) - 1);
                if (basket.get(fruits[start]) == 0) {
                    basket.remove(fruits[start]);
                }
                start++;
            }

            // Update the max length
            maxFruits = Math.max(maxFruits, end - start + 1);
        }

        return maxFruits;
    }
}
