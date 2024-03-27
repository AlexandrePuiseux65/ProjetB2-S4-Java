package module;

import javax.swing.JButton;
import java.awt.Dimension;

public class button extends JButton {
    public button(String label, int width, int height) {
        super(label);
        setPreferredSize(new Dimension(width, height));
    }

    @Override
    public String getLabel() {
        return super.getLabel();
    }
}
