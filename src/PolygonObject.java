import java.awt.*;

public class PolygonObject {
    Polygon P;
    Color color;
    public PolygonObject(int[] x, int[] y, Color color) {
        P = new Polygon();
        P.xpoints = x;
        P.ypoints = y;
        P.npoints = x.length;
        this.color = color;
    }

    void drawPolygon(Graphics g) {
        g.setColor(color);
        g.drawPolygon(P);
    }
}
