import java.awt.Color;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;


public class DoubleBuffer extends Frame implements Runnable {
    private static final long serialVersionUID = 1L;
    Image image;
    Thread thread;
    Graphics graphics = null;
    int loopIndex = 0;

    public static void main(String args[]) {
        DoubleBuffer db = new DoubleBuffer();
        db.setSize(200, 200);
        db.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                System.exit(0);
                super.windowClosing(e);
            }
        });
        db.setTitle("Double Buffer Example using Offscreen Buffer");
        db.setVisible(true);
        db.drawGraphics();
    }

    public void drawGraphics() {
        image = createImage(100, 100);
        // graphics is offscreen buffer
        graphics = image.getGraphics();
        thread = new Thread(this);
        thread.start();
    }
    @Override
    public void run() {
        while (true) {
            repaint();
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                System.err.println(e);
            }
        }
    }

    @Override
    public void paint(Graphics g) {
        if (graphics == null) {
            return;
        }
        loopIndex += 4;
        if (loopIndex >= 100) {
            loopIndex = 4;
        }
        graphics.setColor(new Color(255, 255, 255));
        graphics.fillRect(0, 0, 100, 100);
        graphics.setColor(new Color(2 * loopIndex, 0, 0));
        graphics.drawRect(0, 0, loopIndex, loopIndex);
        g.drawImage(image, 60, 60, this);
        super.paint(g);
    }
}
