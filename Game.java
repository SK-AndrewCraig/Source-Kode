import java.awt.Toolkit;
import javax.swing.JApplet;


public class Game extends JApplet{
	
	public void init()
	{
		Toolkit toolkit = Toolkit.getDefaultToolkit();
		this.setSize(1600, 900);
		
		MapGen i = new MapGen();
		i.generateMap();
		add(i);
	}

}
