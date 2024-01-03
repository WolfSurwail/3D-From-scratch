import java.awt.*;

public class a3DPolygon {
    Color color;
    double[] x,y,z;
    public a3DPolygon(double[] x, double[] y, double[] z, Color color) {
        this.x = x;
        this.y = y;
        this.z = z;
        this.color = color;
        createPolygon();
    }

    void createPolygon() {
        Screen.DrawablePolygons[Screen.NumberOfPolygons] = new PolygonObject(x,y,color);
    }
}
