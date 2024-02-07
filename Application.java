import nl.saxion.app.SaxionApp;
import java.awt.Color;

public class Application implements Runnable {

    public static void main(String[] args) {
        SaxionApp.start(new Application(), 1024, 768);
    }

    public void run() {
        SaxionApp.print("starting x: ");
        int x = SaxionApp.readInt();
        SaxionApp.print("starting y: ");
        int y= SaxionApp.readInt();
        SaxionApp.print("enter width of house: ");
        int w = SaxionApp.readInt();
        SaxionApp.print("enter height of house: ");
        int h = SaxionApp.readInt();

        SaxionApp.drawLine(x,y ,x +w ,y);
        SaxionApp.drawLine(x,y ,x ,y-h);
        SaxionApp.drawLine(x,y-h,x+w,y-h);
        SaxionApp.drawLine(x+w,y-h,x+w,y);
        SaxionApp.drawLine(x,y-h, x+(w/2),(y-h)/2);
        SaxionApp.drawLine(x+(w/2),(y-h)/2,x+w, y-h );


    }

}
