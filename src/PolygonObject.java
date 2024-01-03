import java.awt.*;

public class PolygonObject {
    Polygon P;
    Color color;
    public PolygonObject(double[] x, double[] y, Color color) {
        Screen.NumberOfPolygons++;
        P = new Polygon();
        for ( int i  = 0; i < x.length; i++) {
            P.addPoint((int) x[i], (int) y[i]);
        }
        this.color = color;
    }

    void drawPolygon(Graphics g) {
        g.setColor(color);
        g.drawPolygon(P);
    }
}
