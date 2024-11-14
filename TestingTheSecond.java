package playground;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

public class TestingTheSecond {

	public static void main(String[] args) {
		JButton b1 = new GoodButton("aogh"),b2 = new GoodButton("guh"),b3 = new GoodButton("ergh"),b4 = new GoodButton("ough");
		JFrame frame = new JFrame("ouch");
		
		frame.setSize(400, 400);
		frame.setLocationRelativeTo(frame);
		
		TestingTheSecond test = new TestingTheSecond();
		DrawingPanel panel = test.new DrawingPanel();
		DrawingPanel panel2 = test.new DrawingPanel();
		
		frame.setLayout(new BorderLayout(0, 10));
		frame.add(panel, BorderLayout.PAGE_END);
		frame.add(panel2, BorderLayout.PAGE_START);
		frame.setVisible(true);
		
		panel.setLayout(new BorderLayout(5,5));
		panel.add(b1, BorderLayout.LINE_START);
		panel.add(b2, BorderLayout.LINE_END);
		panel.add(b3, BorderLayout.PAGE_END);
		panel.add(b4, BorderLayout.CENTER);
		
		panel2.setLayout(new BoxLayout(panel2, 0));

	}
	
	
	@SuppressWarnings("serial")
	private class DrawingPanel extends JPanel{
		public DrawingPanel() {
			setPreferredSize(new Dimension(300, 150));
		}
		@Override
		protected void paintComponent(Graphics g) {
			super.paintComponent(g);
			g.setColor(new Color(45,126, 67));
			g.fillRect(0, 0, 100, 100);
		}
		
	}

}
