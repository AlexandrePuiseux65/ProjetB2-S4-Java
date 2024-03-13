package vue;
import javax.swing.*;
import java.awt.*;

public class ImageGrid extends JFrame {
    private static final int ROWS = 6;
    private static final int COLS = 7;
    private static final String IMAGE_PATH = "src/img/img_V.jpg";

    public ImageGrid() {
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(800, 600);
        setLocationRelativeTo(null);

        JPanel panel = new JPanel(new GridLayout(ROWS, COLS));
        add(panel);

        ImageIcon icon = new ImageIcon(IMAGE_PATH);

        // Ajout des images au panel
        for (int i = 0; i < ROWS * COLS; i++) {
            // Redimensionnement de l'image pour qu'elle s'adapte à la cellule du tableau
            Image scaledImage = icon.getImage().getScaledInstance(112, 95, Image.SCALE_SMOOTH);
            ImageIcon scaledIcon = new ImageIcon(scaledImage);

            JLabel label = new JLabel(scaledIcon);
            panel.add(label);
        }

        // Rendre la fenêtre visible
        setVisible(true);
    }

    public static void main(String[] args) {
        // Exécution de l'interface graphique dans le fil d'exécution de Swing
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new ImageGrid();
            }
        });
    }
}