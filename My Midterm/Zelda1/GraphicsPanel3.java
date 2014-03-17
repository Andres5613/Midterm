import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GraphicsPanel3 extends JPanel{

private Screen3 s;
private Link hero;

public GraphicsPanel3(){
 s=new Screen3();
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