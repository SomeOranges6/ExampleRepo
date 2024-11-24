package playground;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Sunflower implements ActionListener {

    static JFrame frame;
    static JPanel panel;
    static String english = "sunflower", latin = "helianthus";
    static JLabel sunflower;
    static JButton englishButton, latinButton;

    public static void main(String[] args) {
		javax.swing.SwingUtilities.invokeLater(Sunflower::new);
	}
    public Sunflower(){
        frame = new JFrame("sunflower");
        frame.setLocationRelativeTo(null);

        panel = new JPanel();

        panel.setPreferredSize(new Dimension(100,100));
        panel.setLayout(new BoxLayout(panel, BoxLayout.PAGE_AXIS));
        panel.setBorder(BorderFactory.createEmptyBorder(10,10,10,10));

        sunflower = new JLabel();
        sunflower.setText(english);
        panel.add(sunflower);

        englishButton = new JButton("English");
        englishButton.addActionListener(this);
        englishButton.setActionCommand("english");
        latinButton = new JButton("Latin");
        latinButton.addActionListener(this);
        latinButton.setActionCommand("latin");

        panel.add(englishButton);
        panel.add(latinButton);
        panel.setAlignmentX(Component.CENTER_ALIGNMENT);

        frame.add(panel);
        frame.pack();
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setVisible(true);
    }

	@Override
	public void actionPerformed(ActionEvent e) {
		String eventName = e.getActionCommand();
        if(eventName.equals("latin")){
            sunflower.setText(latin);
        } else if (eventName.equals("english")) {
            sunflower.setText(english);
        }
    }
}
