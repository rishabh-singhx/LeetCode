class Solution {
    public boolean checkIfPangram(String sentence) {
        int f[]=new int[26];
        for(int i=0;i<sentence.length();i++){
           f[sentence.charAt(i)-97]++;   
        }
        for(int j=0;j<26;j++){
            if(f[j]==0)
                return false;
        }
        return true;
    }
}