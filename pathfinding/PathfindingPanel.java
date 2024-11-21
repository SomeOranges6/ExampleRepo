package playground.pathfinding;

import java.awt.*;

import javax.swing.JPanel;

public class PathfindingPanel extends JPanel {
	
	@Override
	protected void paintComponent(Graphics g) {
		super.paintComponent(g);
		for(int i = 0; i < PathfindingTest.grid.length; i++){
			for(int j = 0; j < PathfindingTest.grid.length; j++){
				PathfindingTest.grid[i][j].render((Graphics2D) g);
			}
		}
	}

}
