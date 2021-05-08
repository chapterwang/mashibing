package src.com.mashibing.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame{
    private int x=50,y=50;
    Image offImage=null;


    public TankFrame(){
        setTitle("tank war I");
        setResizable(true);
        setVisible(true);
        setSize(800,600);
        //setBackground(Color.white);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing (WindowEvent e){
                System.exit(0);
            }
        });
        new Thread(new paintThread()).start();
    }
    @Override
    public void paint(Graphics g){
        g.setColor(Color.green);
        g.fillOval(x,y,50,50);
        //g.fillRect(x,y,50,50);

        y+=5;
    }

    public void update(Graphics g){
        if(offImage==null){
            offImage=this.createImage(800,600);
        }
        Graphics goffImage=offImage.getGraphics();
        //Color c=goffImage.getColor();
        //goffImage.setColor(Color.green);
        goffImage.fillRect(0,0,800,600);
        goffImage.setColor(Color.green);
        print(goffImage);
        g.drawImage(offImage,0,0,null);
    }

    public class paintThread implements Runnable{
        @Override
        public void run() {
            while (true){
                repaint();
                try {
                    Thread.sleep(200);
                }
                catch (InterruptedException e){
                    e.printStackTrace();
                }
            }
        }
    }

}
