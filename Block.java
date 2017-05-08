import java.awt.Graphics;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;


public class Block {
	

	int x;
	int y;
	int ter_posX;
	int ter_posY;
	int identity;
	
	
	BufferedImage terrain;
	
	public Block(int myX, int myY, int identity)
	{
		
		x = myX;
		y = myY;
		
		if (identity <= 3) {ter_posX = identity; ter_posY = 0;}
		else {ter_posX = identity - 4; ter_posY = 1;}

		
		try {
			terrain = ImageIO.read(getClass().getResource("Terrain.png"));
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public void draw(Graphics g)
	{
		g.drawImage(terrain.getSubimage((ter_posX * 50), (ter_posY * 50), 50, 50), (x * 50), (y * 50), null);
		
	}
	
}
