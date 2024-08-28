import java.util.*;

class NQueens {

    public boolean isSafe(int row, int col, char[][] board) {
        for (int j = 0; j < board.length; j++) {
            if (board[row][j] == 'Q') {
                return false;
            }
        }
        for (int j = 0; j < board.length; j++) {
            if (board[j][col] == 'Q') {
                return false;
            }
        }
        int r = row;
        for (int c = col; c >= 0 && r >= 0; c--, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for (int c = col; c < board.length && r >= 0; c++, r--) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for (int c = col; c >= 0 && r < board.length; c--, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        r = row;
        for (int c = col; c < board.length && r < board.length; c++, r++) {
            if (board[r][c] == 'Q') {
                return false;
            }
        }
        return true;
    }

    public void saveBoard(char[][] board, List<List<String>> allBoards) {
        List<String> newBoard = new ArrayList<>();
        for (int i = 0; i < board.length; i++) {
            String row = "";
            for (int j = 0; j < board.length; j++) {
                if (board[i][j] == 'Q') {
                    row = row + "Q";
                } else {
                    row = row + ".";
                }
            }
            newBoard.add(row);
        }
        allBoards.add(newBoard);
    }

    public void helper(char[][] board, List<List<String>> allBoards, int col) {
        if (col == board.length) {
            saveBoard(board, allBoards);
            return;
        }
        for (int row = 0; row < board.length; row++) {
            if (isSafe(row, col, board)) {
                board[row][col] = 'Q';
                helper(board, allBoards, col + 1);
                board[row][col] = '.';
            }
        }
    }

    public List<List<String>> solveNQueens(int n) {
        List<List<String>> allBoards = new ArrayList<>();
        char[][] board = new char[n][n];
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.'); // Initialize with '.'
        }
        helper(board, allBoards, 0);
        return allBoards;
    }

    public static void main(String[] args) {
        NQueens nQueens = new NQueens();
        int n = 8; // Example for 4x4 board
        List<List<String>> result = nQueens.solveNQueens(n);

        // Print all solutions
        for (List<String> board : result) {
            for (String row : board) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
}
