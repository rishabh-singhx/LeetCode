class Solution {
    
    public  boolean reorderedPowerOf2(int n) {
        Set<String> signatures = new HashSet<>();
        
        // Precompute all powers of two up to 1e9
        for (int i = 1; i <= 1_000_000_000; i <<= 1) {
            signatures.add(getDigitSignature(i));
        }
        
        // Compare digit signature of n with precomputed ones
        return signatures.contains(getDigitSignature(n));
    }

    public String getDigitSignature(int num) {
        int[] count = new int[10];
        while (num > 0) {
            count[num % 10]++;
            num /= 10;
        }
        return Arrays.toString(count); // unique representation
    }
}