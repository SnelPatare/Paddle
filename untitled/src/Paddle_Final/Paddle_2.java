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
   // Timer tm;
    //Timer tm = new Timer(5, this);
    int Loc_X;
    int Loc_Y;
    public Paddle_2() {
        Loc_X = 100;
        Loc_Y = 500;
        Timer tm = new Timer(10, this);
        setFocusable(true);
        setFocusTraversalKeysEnabled(false);
        addKeyListener(this);
        tm.start();
    }

        public void paintComponent(Graphics g){
            super.paintComponent(g);
            this.setBackground(Color.GREEN);
            //g.setColor(Color.GREEN);
            g.setColor(Color.blue);
            g.fillRect(Loc_X,Loc_Y,100,10);
            //g.dispose();
        }


        @Override
        public void actionPerformed(ActionEvent e) {
            //tm.start();
            //addKeyListener(this);
            repaint();
        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            int Key=e.getKeyCode();
            if (Key == KeyEvent.VK_RIGHT) {
                if (Loc_X >= 475){
                    Loc_X = 475;
                }
                else {
                    //System.out.println(Loc_X+ ", after: "+ (Loc_X-1));
                    Loc_X = Loc_X + 20;
                }
                //repaint();
            }

            if (Key == KeyEvent.VK_LEFT){
                if (Loc_X <= 10){
                    Loc_X = 10;
                }
                else {
                    //System.out.println(Loc_X+ ", after: "+ (Loc_X-1));
                    Loc_X = Loc_X - 20;
                }
            }
            //repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {
        }
        public boolean isFocusTraversal(){ return true;}
    }
//}
