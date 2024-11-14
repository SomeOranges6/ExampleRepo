package playground;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Testing {

	public static void main(String[] args) {
		JFrame jeffFrame = new JFrame("oi");
		jeffFrame.setSize(200, 100);
		jeffFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		jeffFrame.setLocationRelativeTo(null);
		
		JLabel jeromeLabel = new JLabel("eese", SwingConstants.LEFT);
		JPanel jonesPanel =  new JPanel();
		jonesPanel.add(new JButton("g"));
		jonesPanel.add(new JButton("g"));
		jonesPanel.add(new JButton("g"));
		jonesPanel.add(jeromeLabel);
	
		
		jeffFrame.add(jonesPanel);
		jeffFrame.setVisible(true);
	}

}
