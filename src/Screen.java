import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {
    double[] ViewFrom = new double[]{10,10,10};
    double[] ViewTo = new double[]{0,0,0};
    a3DPolygon a3DPolygon = new a3DPolygon(new int[]{2,4,2}, new int[]{2,4,6}, new int[]{5,5,5}, Color.BLACK);;
    public Screen() {

    }
    public void paintComponent(Graphics g) {

    }
}
