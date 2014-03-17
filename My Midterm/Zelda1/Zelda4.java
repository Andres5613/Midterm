import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Zelda4{

private JFrame win;
private GraphicsPanel4 gp;

public Zelda4(){
 win=new JFrame("Zelda1");
 gp=new GraphicsPanel4();
 win.add(gp);
 win.setSize(475,485);
 win.setVisible(true);
}


public static void main(String arg[]){
 new Zelda4();
}



}
