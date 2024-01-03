import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {
    double[] ViewFrom = new double[]{10,10,10};
    double[] ViewTo = new double[]{0,0,0};
    static int NumberOfPolygons = 0;
    static PolygonObject[] DrawablePolygons = new PolygonObject[100];
    a3DPolygon a3DPolygon = new a3DPolygon(new double[]{2,4,2}, new double[]{2,4,6}, new double[]{5,5,5}, Color.BLACK);;
    public Screen() {

    }
    public void paintComponent(Graphics g) {
        for (int i = 0; i < NumberOfPolygons; i++) {
            DrawablePolygons[i].drawPolygon(g);
        }
    }
}
