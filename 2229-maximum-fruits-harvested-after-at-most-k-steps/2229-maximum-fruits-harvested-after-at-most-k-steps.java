public class Solution {
    public int maxTotalFruits(int[][] fruits, int startPos, int k) {
        int maxFruits = 0;
        int total = 0;
        int i = 0;

        for (int j = 0; j < fruits.length; j++) {
            total += fruits[j][1];

            // Slide the window while the total steps exceed k
            while (i <= j && minSteps(fruits[i][0], fruits[j][0], startPos) > k) {
                total -= fruits[i][1];
                i++;
            }

            maxFruits = Math.max(maxFruits, total);
        }

        return maxFruits;
    }

    private int minSteps(int left, int right, int start) {
        // Going left first: start -> left -> right
        int goLeft = Math.abs(start - left) + (right - left);
        // Going right first: start -> right -> left
        int goRight = Math.abs(start - right) + (right - left);
        return Math.min(goLeft, goRight);
    }
}
