package playground;

import java.awt.Dimension;

import javax.swing.JButton;

public class GoodButton extends JButton {
	public GoodButton(String string) {
		super(string);
		setSize(new Dimension(50, 50));
	}
}
