class Solution {
    public double average(int[] salary) {
        Arrays.sort(salary);
        int s=0;
        for(int i=1;i<salary.length-1;i++)
            s=s+salary[i];
        double avg=(double)s/(salary.length-2);
        return avg;
    }
}