import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GraphicsPanel5 extends JPanel{

private Screen5 s;
private Link hero;

public GraphicsPanel5(){
 s=new Screen5();
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