import javax.swing.*;
import java.awt.*;
import java.awt.image.*;
import java.awt.event.*;
import java.io.*;
import javax.imageio.*;

public class Link{

private int x,y;
private int xspeed,ypseed;
private BufferedImage img[];
private int currframe;
private int maxframe;
private String direction;
private int tick;
private final int maxtick=1;




public Link(){
	x=50;
	y=50;
	tick=0;
	//xspeed=2;
	//yspeed=0;
	currframe=0;
	maxframe=4;
	img =new BufferedImage[5];
  try{
  
     for(int i=0;i<5;i++){
     img[i] = ImageIO.read(new File("images/move_0"+(i+1)+".png"));
     }
     
 }catch (IOException e)
  {
   e.printStackTrace();
}

}



public void update(){
//    System.out.println("update"+tick+currframe);
	tick++;
	if(tick>maxtick){
		tick=0;
		currframe++;
		if(currframe>maxframe){
			currframe=0;
		}
	}
	    System.out.println("update"+tick+currframe);

}

public void draw(Graphics g){
	
    
	g.drawImage(img[currframe],x,y,null);
}

private String dir;
public void move(String dir){
	direction=dir;
	if(dir.equals("up"))moveUp();
	else if(dir.equals("down"))moveDown();
	else if(dir.equals("left"))moveLeft();
	else if(dir.equals("right"))moveRight();
	
}

public void moveUp(){
	y-=5;
}
public void moveDown(){
	y+=5;
}

public void moveLeft(){
	x-=5;
}

public void moveRight(){
	y+=5;
}







}