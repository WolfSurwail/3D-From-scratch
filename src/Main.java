import javax.swing.*;
import java.awt.*;

public class Main extends JFrame {
    static JFrame F = new Main();
    Screen ScreenObject = new Screen();
    public Main() {
        add(ScreenObject);
        setUndecorated(true);
        setSize(Toolkit.getDefaultToolkit().getScreenSize());
        setVisible(true);
    }
    public static void main(String[] args) {

    }
}
