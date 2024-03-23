package vue;
import module.*;
import controleur.*;

import javax.swing.*;
import java.awt.*;

public class ImageGrid extends JFrame {
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private JLabel[][] gridLabels = new JLabel[ROWS][COLS];
    private GameManager gameManager;

    public ImageGrid() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(1200, 1080);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(ROWS + 1, COLS)); // +1 for button row
        add(panel);

        // Initialize GameManager with the gridLabels for UI updates
        gameManager = new GameManager(gridLabels);

        // Adjusting for correct button placement and functionality
        // Add buttons for each column
        for (int col = 0; col < COLS; col++) {
            button button = new button(Integer.toString(col + 1), 112, 30);
            final int column = col;
            button.addActionListener(e -> {
                gameManager.updateGridImage(column); // Update grid for the current column
                gameManager.switchPlayer(); // Switch to the next player
            });
            panel.add(button);
        }

        // Initialize grid labels and add them to the panel

        for (int row = 0; row < ROWS; row++) {
            for (int col = 0; col < COLS; col++) {
                gridLabels[row][col] = new JLabel();
                ImageIcon icon = new ImageIcon("src/img/img_V.jpg"); // Use as default image
                gridLabels[row][col].setIcon(icon);
                panel.add(gridLabels[row][col]);
            }
        }



        // Make the window visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Run the GUI in the Swing event dispatch thread
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ImageGrid();
            }
        });
    }
}
