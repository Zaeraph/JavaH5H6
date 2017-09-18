import java.awt.*;
import java.applet.*;

public class Praktijk extends Applet{
            Color lijnkleur;
            int breedte;
            int hoogte;
    private Color setColor;

    public void init() {

        setColor = Color.MAGENTA;
        lijnkleur = Color.BLACK;
        breedte = 200;
        hoogte = 100;
        }

public void paint(Graphics g) {
        g.drawRect(100, 100, 50, 60);
        g.drawRoundRect(100, 225, 70, 60, 30, 30);
        g.setColor(Color.CYAN);
        g.fillRect(315, 100, 40, 40);
        g.setColor(Color.PINK);
        g.drawOval(315, 100, 40, 80);
        g.setColor(Color.DARK_GRAY);
        g.fillOval(315, 225, 90, 90);
        }

}
