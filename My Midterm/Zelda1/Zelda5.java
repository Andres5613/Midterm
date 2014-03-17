import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Zelda5{

private JFrame win;
private GraphicsPanel5 gp;

public Zelda5(){
 win=new JFrame("Zelda1");
 gp=new GraphicsPanel5();
 win.add(gp);
 win.setSize(475,485);
 win.setVisible(true);
}


public static void main(String arg[]){
 new Zelda5();
}



}
