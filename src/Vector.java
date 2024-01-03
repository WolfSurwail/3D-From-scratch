import java.awt.*;

public class Vector {
    double x,y,z;
    public Vector(double x, double y, double z) {
        double length = Math.sqrt(x*x + y*y + z*z);
        this.x = x/length;
        this.y = y/length;
        this.z = z/length;
    }

    Vector CrossProduct(Vector v) {
        Vector CrossVector = new Vector(
                y * v.z - z * v.y,
                z * v.x - x * v.z,
                x * v.y - y * v.x);
        return CrossVector;
    }
}
