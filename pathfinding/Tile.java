package playground.pathfinding;

import java.awt.*;

public class Tile extends Rectangle {

	Color color = Color.WHITE;
	int distFromStart = 0;
	public Tile(int x, int y, int width, int height) {
		super(x, y, width, height);
		
	}
	
	public void render(Graphics2D g) {
		g.setColor(color);
		g.fillRect(x, y, width, height);
		g.setColor(Color.BLACK);
		g.drawRect(x, y, width, height);
		g.drawString(String.valueOf(distFromStart), x + width/2, y - height/2);
	}

}
