import java.awt.Graphics;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.Timer;

public class MethodPractice extends JPanel{
	
	// Practice calling methods with parameters
	// by drawing the required shapes/patterns from the document
	public void paint(Graphics g) {
		//g.fillOval(200, 200, 200, 200);
		
		g.fillRect(0, 0, 50, 50);
	
		//Methods:
		/*
		 * name( parameters )
		 * parameters - data for the method
		 */
		
		//Line:
		//g.drawLine(300, 600, 300, 0);
		//g.drawLine(0, 300, 600, 300);
		
		//Cube:
		g.drawRect(100, 100, 200, 200);
		g.drawRect(200, 200, 200, 200);
		//Top Lines
		g.drawLine(100, 100, 200, 200);
		g.drawLine(300, 100, 400, 200);
		//Bottom Lines
		g.drawLine(400, 400, 300, 300);
		g.drawLine(200, 400, 100, 300);
		
		//Sphere:
		//Vertical
		g.drawOval(500, 500, 400, 400);
		g.drawOval(550, 500, 300, 400);
		g.drawOval(600, 500, 200, 400);
		g.drawOval(650, 500, 100, 400);
		//Horizontal
		g.drawOval(500, 550, 400, 300);
		g.drawOval(500, 600, 400, 200);
		g.drawOval(500, 650, 400, 100);
		
		//APCS
		//A:
		g.drawRect(500, 200, 30, 130);
		g.fillRect(500, 200, 30, 130);
		g.drawRect(500, 170, 100, 30);
		g.fillRect(500, 170, 100, 30);
		g.drawRect(570, 200, 30, 130);
		g.fillRect(570, 200, 30, 130);
		g.drawRect(500, 230, 100, 30);
		g.fillRect(500, 230, 100, 30);
		//P:
		g.drawRect(630, 170, 30, 160);
		g.fillRect(630, 170, 30, 160);
		g.drawRect(630, 170, 100, 30);
		g.fillRect(630, 170, 100, 30);
		g.drawRect(700, 170, 30, 100);
		g.fillRect(700, 170, 30, 100);
		g.drawRect(630, 240, 100, 30);
		g.fillRect(630, 240, 100, 30);
		//C:
		g.drawRect(760, 170, 30, 160);
		g.fillRect(760, 170, 30, 160);
		g.drawRect(760, 170, 100, 30);
		g.fillRect(760, 170, 100, 30);
		g.drawRect(760, 300, 100, 30);
		g.fillRect(760, 300, 100, 30);
		//S:
		g.drawRect(890, 170, 30, 80);
		g.fillRect(890, 170, 30, 80);
		g.drawRect(890, 170, 100, 30);
		g.fillRect(890, 170, 100, 30);
		g.drawRect(890, 230, 100, 30);
		g.fillRect(890, 230, 100, 30);
		g.drawRect(960, 230, 30, 80);
		g.fillRect(960, 230, 30, 80);
		g.drawRect(890, 300, 100, 30);
		g.fillRect(890, 300, 100, 30);
		
		//Pacman
		//Circles
		g.drawArc(1200, 500, 100, 100, 220, 270);
		g.fillArc(1200, 500, 100, 100, 220, 270);
		g.drawArc(1340, 500, 100, 100, 410, 270);
		g.fillArc(1340, 500, 100, 100, 410, 270);
		g.drawArc(1270, 430, 100, 100, 495, 270);
		g.fillArc(1270, 430, 100, 100, 495, 270);
		g.drawArc(1270, 570, 100, 100, 675, 270);
		g.fillArc(1270, 570, 100, 100, 675, 270);
		
		//Smiley Face
		g.drawOval(1300, 100, 300, 300);
		g.fillOval(1300, 100, 300, 300);
		
		g.setColor(java.awt.Color.pink);
		g.drawOval(1500, 150, 50, 100);
		g.fillOval(1500, 150, 50, 100);
		
		g.setColor(java.awt.Color.yellow);
		g.drawOval(1350, 150, 50, 100);
		g.fillOval(1350, 150, 50, 100);
		
		g.setColor(java.awt.Color.pink);
		g.drawArc(1350, 230, 200, 100, 180, 180);
		g.fillArc(1350, 230, 200, 100, 180, 180);
		
	}
	
	
	
	
	
	
	
	
	
	public static void main(String[] arg) {
		MethodPractice m = new MethodPractice();
		int			   x = 7;
	}
	
	public MethodPractice() {
		JFrame f = new JFrame("Method Use");
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		f.setSize(600,600);
		f.add(this);
		f.setVisible(true);
		
	}
}
