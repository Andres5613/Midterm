import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Zelda3{

private JFrame win;
private GraphicsPanel3 gp;

public Zelda3(){
 win=new JFrame("Zelda1");
 gp=new GraphicsPanel3();
 win.add(gp);
 win.setSize(475,485);
 win.setVisible(true);
}


public static void main(String arg[]){
 new Zelda3();
}



}
