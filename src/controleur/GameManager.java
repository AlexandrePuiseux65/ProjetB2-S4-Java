package controleur;

public class GameManager {
    private boolean isGameOver;
    private int currentPlayer;
    private int[][] gameBoard;
    private static final int ROWS = 6;
    private static final int COLS = 7;

    public GameManager() {
        this.isGameOver = false;
        this.currentPlayer = 1; // Player 1 starts
        this.gameBoard = new int[ROWS][COLS]; // 0 indicates empty, 1 for player 1, 2 for player 2
    }

    public boolean placeToken(int column) {
        for (int row = ROWS - 1; row >= 0; row--) {
            if (gameBoard[row][column] == 0) {
                gameBoard[row][column] = currentPlayer;
                return true;
            }
        }
        return false; // Column is full
    }

    public boolean checkWin() {
        // Horizontal, vertical, and diagonal win check
        return checkHorizontalWin() || checkVerticalWin() || checkDiagonalWin();
    }

    private boolean checkHorizontalWin() {
        // Implement horizontal win logic
        return false; // Placeholder
    }

    private boolean checkVerticalWin() {
        // Implement vertical win logic
        return false; // Placeholder
    }

    private boolean checkDiagonalWin() {
        // Implement diagonal win logic
        return false; // Placeholder
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 1) ? 2 : 1;
    }

    public boolean isGameOver() {
        return isGameOver;
    }

    public void setGameOver(boolean gameOver) {
        isGameOver = gameOver;
    }

    public int getCurrentPlayer() {
        return currentPlayer;
    }

    public int[][] getGameBoard() {
        return gameBoard;
    }
}
