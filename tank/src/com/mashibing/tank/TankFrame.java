package src.com.mashibing.tank;

import java.awt.*;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class TankFrame extends Frame{
    public TankFrame(){
        setTitle("tank war I");
        setResizable(true);
        setVisible(true);
        setSize(800,600);
        addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing (WindowEvent e){
                System.exit(0);
            }
        });
    }
    @Override
    public void paint(Graphics g){
        g.fillRect(200,200,50,50);
    }
}
