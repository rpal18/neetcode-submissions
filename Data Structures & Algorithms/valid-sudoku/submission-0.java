class Solution {
    public boolean isValidSudoku(char[][] board) {
        for (int i = 0; i < board.length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    return false;
                }
                set.add(board[i][j]);
            }
        }

        // for col

        for (int i = 0; i < board.length; i++) {
            Set<Character> set = new HashSet<>();
            for (int j = 0; j < board[0].length; j++) {
                if (board[j][i] == '.') {
                    continue;
                }
                if (set.contains(board[j][i])) {
                    return false;
                }
                set.add(board[j][i]);
            }
        }

        // now check for boxes
        int startRow = 0;
        for (int i = 0; i < 3; i++) {
            int startCol = 0;
            for (int j = 0; j < 3; j++) {
                // 0 -> 2 -> 5 -> 8

                if (!validateGrid(board, startRow, startCol)) {
                    return false;
                }

                startCol += 3;
            }
            startRow += 3;
        }
        return true;
    }

    boolean validateGrid(char[][] board, int startRow, int startCol) {
        Set<Character> set = new HashSet<>();
        for (int i = startRow; i < 3 + startRow; i++) {
            for (int j = startCol; j < 3 + startCol; j++) {
                if (board[i][j] == '.') {
                    continue;
                }
                if (set.contains(board[i][j])) {
                    return false;
                }
                set.add(board[i][j]);
            }
        }
        return true;
    }
}
