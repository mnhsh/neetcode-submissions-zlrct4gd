class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        for (int m = 0; m < matrix.length; m++) {
            int l = 0;
            int r = matrix[m].length - 1;
            while (l <= r) {
                int mid = (l+r)/2;
                if (target > matrix[m][mid]) {

                    l = mid + 1;
                } else if (target < matrix[m][mid]) {
                    r = mid - 1;
                } else {
                    return true;
                }
            }
        }
        return false;
    }
}
