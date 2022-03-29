package CanvasTestingProblemEighteen;

import java.awt.Graphics;
import java.awt.event.MouseEvent;
import java.awt.image.BufferStrategy;
import java.awt.image.BufferedImage;

import CanvasTestingProblemEighteen.display.display;
import CanvasTestingProblemEighteen.gfx.ImageLoader;
import CanvasTestingProblemEighteen.gfx.SpriteSheet;

public class problemEighteenAndSixtySevenVisuals implements Runnable{

	private display display;
	public String title;
	public int width, height;
	public int centerWidth;
	public int centerHeight;
	private boolean running = false;
	private Thread thread;
	private BufferStrategy bs;
	private Graphics g;

	
//object with parameters for our game window
	public problemEighteenAndSixtySevenVisuals(String title, int width, int height) {
		this.width = width;
		this.height = height;
		this.title = title;

	}

//runs once to initialize everything
	private void init() {
		display = new display(title, width, height);

	}

	private void tick() {

	}

//render the graphics
	private void render() {
		bs = display.getCanvas().getBufferStrategy();
		if (bs == null) {
			display.getCanvas().createBufferStrategy(3);
			return;
		}
		g = bs.getDrawGraphics();
		// Clear Screen
		g.clearRect(0, 0, width, height);
		// DRAWING
		
		// END DRAWING
		bs.show();
		g.dispose();
	}

//1. update variables/positions/objects, 2. render everything, 3. repeat
	public void run() {
		init();

		while (running) {
			tick();
			render();
		}
		stop();
	}

//start threads
	public synchronized void start() {
		if (running) {
			return;
		}
		running = true;
		thread = new Thread(this);
		thread.start();
	}

//stop threads
	public synchronized void stop() {
		if (!running) {
			return;
		}
		try {
			thread.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
	}

	public void mouseDragged(MouseEvent a) {
		// TODO Auto-generated method stub

	}

	public void mouseMoved(MouseEvent a) {
		// TODO Auto-generated method stub

	}

}
//* UPDATES 7 need to find a way to use events to create lines
// when drawing, y axis is flipped so (0, 0) is at the top left and the y coords go down
// synchronized is used specifically with threads to make sure everything works
// correctly (look into how threads work)
// get good at using awt graphics (its how everything is drawn)