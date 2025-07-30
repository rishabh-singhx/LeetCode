class Solution {
    public int numDifferentIntegers(String word) {
        word = word.replaceAll("[a-z]", " ");
        String[] parts = word.trim().split("\\s+");
        Set<String> uniqueNums = new HashSet<>();
        
        for (String part : parts) {
            if (!part.isEmpty()) {
                // Remove leading zeros
                String num = part.replaceFirst("^0+", "");
                if (num.isEmpty()) num = "0";  // Case for "000" etc.
                uniqueNums.add(num);
            }
        }
        return uniqueNums.size();
    }
}