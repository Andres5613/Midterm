import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Zelda1{

private JFrame win;
private GraphicsPanel gp;
public Zelda1(){
 win=new JFrame("Zelda1");
 gp=new GraphicsPanel();
 win.add(gp);
 win.setSize(450,500);
 win.setVisible(true);
}

public void keyPressed(KeyEvent e) {
	// TODO Auto-generated method stub
	System.out.println("K"+e.getKeyCode());
	
	if(e.getKeyCode()==37){gp.processAction("left");}
	else if(e.getKeyCode()==40){gp.processAction("down");}
	else if(e.getKeyCode()==39){gp.processAction("right");}
	else if(e.getKeyCode()==38){gp.processAction("up");}
	else if(e.getKeyCode()==10){gp.processAction("attack");}
	else if(e.getKeyCode()==32){gp.processAction("block");}

	gp.repaint();
}


public static void main(String arg[]){
 new Zelda1();
}
}