
import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GraphicsPanel4 extends JPanel{

private Screen4 s;
private Link hero;

public GraphicsPanel4(){
 s=new Screen4();
 hero=new Link();
}

public void update(){
 hero.update();
// hero.repaint();

}

public void paint(Graphics g){
  s.draw(g);
  hero.draw(g);
}


}