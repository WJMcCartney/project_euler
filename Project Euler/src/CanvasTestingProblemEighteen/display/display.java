package CanvasTestingProblemEighteen.display;

import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;

import javax.swing.JFrame;

public class display implements MouseListener, MouseMotionListener {

	private JFrame frame;
	private Canvas canvas;

	private String title;
	private int width, height;

	public display(String title, int width, int height) {
		this.title = title;
		this.width = width;
		this.height = height;

		createDisplay();
	}

	private void createDisplay() {
		frame = new JFrame(title);
		frame.setSize(width, height);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setResizable(false);
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);

		canvas = new Canvas();
		canvas.setPreferredSize(new Dimension(width, height));
		canvas.setMaximumSize(new Dimension(width, height));
		canvas.setMinimumSize(new Dimension(width, height));
		canvas.addMouseListener(this);
		
		frame.add(canvas);
		frame.pack();

	}
	
	public Canvas getCanvas() {
		return canvas;
	}
	
	public void mouseDragged(MouseEvent a) {
		// TODO Auto-generated method stub
		
	}

	public void mouseMoved(MouseEvent a) {
		// TODO Auto-generated method stub
		
	}

	public void mousePressed(MouseEvent a) {
		g.drawLine(10, 10, 1010, 1010);
	}

	public void mouseReleased(MouseEvent a) {
		// TODO Auto-generated method stub
		
	}

	public void mouseEntered(MouseEvent a) {
		// TODO Auto-generated method stub
		
	}

	public void mouseExited(MouseEvent a) {
		// TODO Auto-generated method stub
		
	}

	public void mouseClicked(MouseEvent a) {
		// TODO Auto-generated method stub
		
	}	
}
