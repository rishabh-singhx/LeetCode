class Solution {
    public String reverseOnlyLetters(String s) {
        char arr[] = s.toCharArray();
        int i = 0, j = arr.length - 1;
        while (i < j) {
            char c = arr[i];
            char d = arr[j];
            if (Character.isLetter(c) && Character.isLetter(d)) {
                char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
                j--;
            } else if (!Character.isLetter(c)) {
                i++;
            } else {
                j--;
            }
        }
        String str = new String(arr);
        return str;
    }
}