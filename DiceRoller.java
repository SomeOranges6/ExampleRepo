package playground;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.Box;
import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class DiceRoller implements ActionListener{
	
	JFrame frame;
	DicePanel dicePanel;
	JPanel buttonPanel;
	JButton roll;
	Random rand = new Random();
	int value = 0;

	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {	
			@Override
			public void run() {
				new DiceRoller();
			}
		});		

	}
	
	public DiceRoller() {
		frame = new JFrame("Roll The Dice");
		frame.setSize(400, 400);
		
		dicePanel = this.new DicePanel();
		dicePanel.setPreferredSize(new Dimension(500,500));
		
		//dicePanel.setLayout();
		
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setLocationRelativeTo(null);
		
		roll = new JButton("Roll");
		
		roll.addActionListener(this);
		roll.setActionCommand("Roll");
		//dicePanel.add(Box.createRigidArea(new Dimension(300, 300)));
		dicePanel.add(roll);
		
		frame.setContentPane(dicePanel);

		frame.pack();
		frame.setVisible(true);

	}
	
	@SuppressWarnings("serial")
	private class DicePanel extends JPanel{
		public DicePanel() {
			// TODO Auto-generated constructor stub
		}
		@Override
		protected void paintComponent(Graphics g) {
			g.clearRect(this.getHeight()/2, this.getHeight()/2, WIDTH, HEIGHT);
			g.setColor(Color.WHITE);
			g.fillRect(this.getWidth()/2 - 150, this.getHeight()/2 - 150, 300, 300);
			g.setColor(Color.black);
			g.drawRect(this.getWidth()/2 - 150, this.getHeight()/2- 150, 300, 300);
			
			g.setFont(new Font("Arial", Font.BOLD, 200));
			
			g.drawString(value + "", this.getWidth()/2, this.getHeight()/2);
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getActionCommand().equals("Roll")) {
			value = rand.nextInt(1,7);
			dicePanel.repaint();
		}
		
	}


}
