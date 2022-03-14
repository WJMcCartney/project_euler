import java.awt.Canvas;
import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;

import javax.swing.JFrame;

class canvas extends JFrame {

	canvas(int a, int b, int d, int e) {
		super("canvas");
		Canvas c = new Canvas() {
			public void paint(Graphics g) {
				g.setColor(Color.red);
				g.setFont(new Font("Bold", 1, 20));
				for (int i = 0; i < d; i++) {
					String iString = String.valueOf(i);
					g.drawString(iString, i * 20, 50);
				}
			}
		};
		c.setBackground(Color.black);

		add(c);
		setSize(2000, 2000);
		setVisible(true);
	}
}