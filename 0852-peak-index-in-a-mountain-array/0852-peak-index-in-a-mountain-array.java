class Solution {
    public int peakIndexInMountainArray(int[] arr) {
        int n=arr.length;
        int lb=0,ub=n-1;
        int mid=(ub+lb)/2;
        ub=n-2;
        lb=1;
        while(lb<=ub )
        {
            if(arr[mid]>arr[mid+1]&&arr[mid]>arr[mid-1])
            {
                return mid;
            }
            else if(arr[mid]>arr[mid+1])
            {
                ub=mid-1;
            }
            else if(arr[mid]>arr[mid-1])
            {
                lb=mid+1;
            }
             mid=(ub+lb)/2;
        }
        return mid;
    }
}

