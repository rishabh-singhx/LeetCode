class Solution {
    public int countMatches(List<List<String>> items, String ruleKey, String ruleValue) {
        int n,c=0;
        if(ruleKey.equals("type"))
            n=0;
        else if(ruleKey.equals("color"))
            n=1;
        else 
            n=2;
        for(int i=0;i<items.size();i++){
            if(ruleValue.equals(items.get(i).get(n)))
                c++;
        }
        return c;
    }
}