package controleur;

import module.*;
import javax.swing.*;

public class GameManager {
    private boolean isGameOver;
    private int currentPlayer;
    private static int[][] gameBoard;
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private JLabel[][] gridLabels; // Assumed addition for UI integration

    public GameManager(JLabel[][] gridLabels) {
        this.isGameOver = false;
        this.currentPlayer = 1;
        this.gameBoard = new int[ROWS][COLS];
        this.gridLabels = gridLabels;
    }

    public void switchPlayer() {
        currentPlayer = (currentPlayer == 1) ? 2 : 1;
    }

    public static int[][] getGameBoard() {
        return gameBoard;
    }

    public void updateGridImage(int column) {
        for (int row = ROWS - 1; row >= 0; row--) {
            if (gameBoard[row][column] == 0) {
                gameBoard[row][column] = currentPlayer;
                JLabel cellLabel = gridLabels[row][column];

                String imagePath = (currentPlayer == 1) ? "src/img/img_J.jpg" : "src/img/img_R.jpg";
                ImageIcon newIcon = new ImageIcon(imagePath);
                cellLabel.setIcon(newIcon);

                break;
            }
        }
    }

}
