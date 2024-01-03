import javax.swing.*;
import java.awt.*;

public class Screen extends JPanel {
    PolygonObject polygonObject;
    public Screen() {
        polygonObject = new PolygonObject(new int[]{10,200,10}, new int[]{10,200,400}, Color.BLACK);
    }
    public void paintComponent(Graphics g) {
        polygonObject.drawPolygon(g);
    }
}
