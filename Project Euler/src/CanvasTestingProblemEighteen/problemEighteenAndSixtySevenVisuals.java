package CanvasTestingProblemEighteen;

import java.awt.Color;
import java.awt.Graphics;
import java.awt.image.BufferStrategy;

import CanvasTestingProblemEighteen.display.display;

public class problemEighteenAndSixtySevenVisuals implements Runnable {

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
		//Clear Screen
		g.clearRect(0,  0, width, height);
		//DRAWING
		g.setColor(Color.black);
		g.fillRect(500,  400,  100,  70);
		g.setColor(Color.DARK_GRAY);
		g.fillRect(590,  470,  10,  40);
		g.fillRect(560,  470,  10,  40);
		g.fillRect(530,  470,  10,  40);
		g.fillRect(500,  470,  10,  40);
		
		g.fillRect(490,  390,  10,  10);
		g.fillRect(480,  380,  10,  10);
		g.fillRect(470,  370,  10,  10);
		
		g.fillRect(590,  360,  50,  50);
		
		g.fillRect(580,  350,  10,  10);
		g.fillRect(640,  350,  10,  10);
		g.setColor(Color.black);
		g.fillRect(600,  370,  10,  10);
		g.fillRect(620,  370,  10,  10);
		g.fillRect(600,  390,  30,  10);




		
		//END DRAWING
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
}
//when drawing, y axis is flipped so (0, 0) is at the top left and the y coords go down
// synchronized is used specifically with threads to make sure everything works
// correctly (look into how threads work)
//get good at using awt graphics (its how everything is drawn)