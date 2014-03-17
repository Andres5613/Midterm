import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Zelda2{

private JFrame win;
private GraphicsPanel2 gp;
public Zelda2(){
 win=new JFrame("Zelda1");
 gp=new GraphicsPanel2();
 win.add(gp);
 win.setSize(475,485);
 win.setVisible(true);
}


public static void main(String arg[]){
 new Zelda2();
}
}