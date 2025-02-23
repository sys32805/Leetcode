class Solution {
    public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        int len = n1 + n2;
        int[] arr3 = new int[len];
        int i = 0, j = 0, k = 0;

        while (i < n1 && j < n2) {
            if (nums1[i] < nums2[j]) {
                arr3[k++] = nums1[i++];
            } else {
                arr3[k++] = nums2[j++];
            }
        }

        while (i < n1) {
            arr3[k++] = nums1[i++];
        }

        while (j < n2) {
            arr3[k++] = nums2[j++];
        }

        if (len % 2 == 1) {
            return arr3[len / 2];
        } else {
            int mid1 = len / 2;
            int mid2 = mid1 - 1;
            return (arr3[mid1] + arr3[mid2]) / 2.0;
        }
    }
}
