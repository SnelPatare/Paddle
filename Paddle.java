import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
public class Paddle implements Observer {

	@Override
	public void update(int location) {

	}

	@Override
	public void update() {

	}

	public class paddle extends JPanel implements KeyListener, ActionListener

	{
		int Loc_X = 250;
		int Loc_Y = 250;
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
	}
}

