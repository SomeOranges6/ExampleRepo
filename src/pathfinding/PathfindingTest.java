package playground.pathfinding;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;

public class PathfindingTest implements ActionListener {
	
	JFrame frame;

	PathfindingPanel buttonPanel;
	JButton roll;

	public static Tile[][] grid = new Tile[8][8];

	static {
		for(int i = 0; i < PathfindingTest.grid.length; i++){
			for(int j = 0; j < PathfindingTest.grid.length; j++){
				PathfindingTest.grid[i][j] = new Tile(i * 30, j * 30, 30,30);
			}
	}

	public static void main(String[] args) {
		SwingUtilities.invokeLater(PathfindingTest::new);
	}
	
	public PathfindingTest() {
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		
	}

}
