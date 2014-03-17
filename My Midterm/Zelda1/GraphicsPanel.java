import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GraphicsPanel extends JPanel{

private Screen s;
private Link hero;

public GraphicsPanel(){
 s=new Screen();
}

public void paint(Graphics g){
  s.draw(g);
  hero.draw(g);
}


public void processAction(String line){
	if(line.equals("left") || line.equals("right") || line.equals("up") || line.equals("down")  ){
		hero.move(line);
	}
			
			
}

}