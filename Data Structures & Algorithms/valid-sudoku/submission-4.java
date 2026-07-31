class Solution {
    public boolean isValidSudoku(char[][] board) {
        Set<String> seen = new HashSet<>();
        for (int i = 0; i < 9; i++) {
            for(int j = 0; j < 9; j++) {
                char val = board[i][j];
                if (val == '.') continue;
                String rowKey = "r" + i + val;
                String colKey = "c" + j + val;
                String boxKey = "b" + (i/3) + "," + (j/3) + val;
                if (!seen.add(rowKey) || !seen.add(colKey) || !seen.add(boxKey)) {
                    return false;
                }
            }
        }
        return true;
    }
}
