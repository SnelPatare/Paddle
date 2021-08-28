package Paddle_Final;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Set;


public class Paddle_f1 {
    public static void main(String[]args){
        Paddle_2 p = new Paddle_2();
        JFrame JF = new JFrame();
        JF.setSize(600,600);
        JF.setResizable(false);
        JF.setVisible(true);
        JF.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        JF.add(p);
    }

//import javax.swing.*;
//        import java.awt.*;
//        import java.awt.event.ActionEvent;
//        import java.awt.event.ActionListener;
//        import java.awt.event.KeyEvent;
//import java.awt.event.KeyListener;
//public class Paddle implements Observer {

   // @Override
   // public void update(int location) {

  //  }

   // @Override
   // public void update() {

    //}

    /*public class paddle_f1 extends JPanel implements KeyListener, ActionListener

    {

        int Loc_X = 250;
        int Loc_Y = 250;

        @Override
        public void setFocusTraversalKeysEnabled(boolean focusTraversalKeysEnabled) {
            super.setFocusTraversalKeysEnabled(false);
        }

        @Override
        public synchronized void addKeyListener(KeyListener l) {
            super.addKeyListener(l);
        }

        public void paint(Graphics g){
            g.setColor(Color.blue);
            g.fillRect(Loc_X,Loc_Y,100,10);
        }


        @Override
        public void actionPerformed(ActionEvent e) {

        }

        @Override
        public void keyTyped(KeyEvent e) {

        }

        @Override
        public void keyPressed(KeyEvent e) {
            int Key=e.getKeyCode();
            if (Key == KeyEvent.VK_RIGHT) {
                Loc_X--;
            }

            if (Key == KeyEvent.VK_LEFT){
                Loc_X++;
            }
            repaint();
        }

        @Override
        public void keyReleased(KeyEvent e) {

        }
    }*/
}
