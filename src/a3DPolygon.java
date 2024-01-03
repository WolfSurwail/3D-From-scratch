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
        double[] newX = new double[x.length];
        double[] newY = new double[x.length];
        for (int i = 0; i < newX.length; i++) {
            newX[i] = 200 * Calculator.CalculatePositionX(Screen.ViewFrom, Screen.ViewTo, x[i],y[i],z[i]);
            newY[i] = 200 * Calculator.CalculatePositionY(Screen.ViewFrom, Screen.ViewTo, x[i],y[i],z[i]);
        }
        Screen.DrawablePolygons[Screen.NumberOfPolygons] = new PolygonObject(newX,newY,color);
    }
}
