package Paddle_Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class Paddle_2 extends JPanel implements KeyListener, ActionListener {
   // public class paddle_f1 extends JPanel implements KeyListener, ActionListener

    //{
    Timer timer;


    //timer.start();

        int Loc_X = 100;
        int Loc_Y = 500;

    @Override
    public void setFocusable(boolean focusable) {
        super.setFocusable(true);
    }

    @Override
        public void setFocusTraversalKeysEnabled(boolean focusTraversalKeysEnabled) {
            super.setFocusTraversalKeysEnabled(false);
        }

        @Override
        public synchronized void addKeyListener(KeyListener l) {
            super.addKeyListener(this);
        }

        public void paint(Graphics g){
            g.setColor(Color.GREEN);
            g.setColor(Color.blue);
            g.fillRect(Loc_X,Loc_Y,100,10);
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            timer.start();
            repaint();
        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            int Key=e.getKeyCode();
            if (Key == KeyEvent.VK_RIGHT) {
                //System.out.println(Loc_X+ ", after: "+ (Loc_X-1));
                Loc_X = Loc_X - 20;
            }

            if (Key == KeyEvent.VK_LEFT){
               // System.out.println(Loc_X+ ", after: "+ (Loc_X+1));
                Loc_X = Loc_X + 20;
            }
            //repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }
//}
