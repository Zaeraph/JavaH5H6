import java.awt.*;
import java.applet.*;



public class Negative extends Applet {
    int a, result;



    public void init(){
        a = 1000000;
        result = a * a;
    }
    public void paint(Graphics g){
        g.drawString("negative: " + result, 20, 20);
    }
}
