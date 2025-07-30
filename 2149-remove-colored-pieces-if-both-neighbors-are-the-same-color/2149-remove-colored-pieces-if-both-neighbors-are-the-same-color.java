class Solution {
    public boolean winnerOfGame(String colors) {
        
        int c=0;
        int movesA=0;
        int movesB=0;
        for(char ch:colors.toCharArray()){
            if(ch=='A'){
                c++;
            }
            else{
                movesA += c>=3 ? c-2 : 0;
                c=0;
            }
        }
        if(c!=0){
            movesA += c>=3 ? c-2 : 0;
        }
        c=0;
        for(char ch:colors.toCharArray()){
            if(ch=='B'){
                c++;
            }
            else{
                movesB += c>=3 ? c-2 : 0;
                c=0;
            }
        }
        if(c!=0){
            movesB += c>=3 ? c-2 : 0;
        }
        // System.out.println(movesA+" "+movesB);
        if(movesA==0)
            return false;
        if(movesA<=movesB)
            return false;
        return true;
    }
}