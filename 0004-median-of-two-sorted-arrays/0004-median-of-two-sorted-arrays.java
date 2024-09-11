class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {

        int n=nums1.length;
        int m=nums2.length;
        int[] arr=new int[n+m];
        System.arraycopy(nums1, 0, arr, 0, n);
        System.arraycopy(nums2, 0, arr, n, m);
        Arrays.sort(arr);
        int le=arr.length;
        double med;
        if(le %2==1){

            med=arr[le/2];

        }else{

            med=(arr[(le/2)-1] + arr[le/2] )/2.0;

        }
        return med;
        
    }
}