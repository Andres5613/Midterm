import java.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class GraphicsPanel2 extends JPanel{

private Screen2 s;

public GraphicsPanel2(){
 s=new Screen2();
}

public void paint(Graphics g){
  s.draw(g);
}


}