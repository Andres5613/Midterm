

import java.awt.Color;
import java.awt.Graphics;
import java.awt.*;
public class Level 
{
 
	public int geto1TopX(){return 300;}  
	public int geto1TopY(){return 380;}
	public int geto1Width(){ return 50;}
	public int geto1Height(){ return 40;}
	
	
	public int geto2TopX(){return 350;}
	public int geto2TopY(){return 380;}
	public int geto2Width(){ return 30;}
	public int geto2Height(){ return 350;}
	
	public int geto3TopX(){return 300;}
	public int geto3TopY(){return 690;}
	public int geto3Width(){ return 50;}
	public int geto3Height(){ return 40;} 

	public int geto4TopX(){return 1270;} 
	public int geto4TopY(){return 380;}
	public int geto4Width(){ return 50;}
	public int geto4Height(){ return 40;}
	
	public int geto5TopX(){return 1250;} 
	public int geto5TopY(){return 380;}
	public int geto5Width(){ return 30;}
	public int geto5Height(){ return 350;}

	public int geto6TopX(){return 1270;}
	public int geto6TopY(){return 690;}
	public int geto6Width(){ return 50;}
	public int geto6Height(){ return 40;}
	
	public int geto7TopX(){return 1100;}
	public int geto7TopY(){return 250;}
	public int geto7Width(){ return 70;}
	public int geto7Height(){ return 30;}
	
	public int geto8TopX(){return 1150;} 
	public int geto8TopY(){return 250;}
	public int geto8Width(){ return 30;}
	public int geto8Height(){ return 60;}
	
	public int geto9TopX(){return 1100;} 
	public int geto9TopY(){return 750;}
	public int geto9Width(){ return 70;}
	public int geto9Height(){ return 30;}
	
	public int geto10TopX(){return 1100;} 
	public int geto10TopY(){return 720;}
	public int geto10Width(){ return 30;}
	public int geto10Height(){ return 60;}
	
		
	public int geto11TopX(){return 395;} 
	public int geto11TopY(){return 250;}
	public int geto11Width(){ return 70;}
	public int geto11Height(){ return 30;}

		
	public int geto12TopX(){return 395;} 
	public int geto12TopY(){return 250;}
	public int geto12Width(){ return 30;}
	public int geto12Height(){ return 60;}

	public int geto13TopX(){return 395;} 
	public int geto13TopY(){return 750;}
	public int geto13Width(){ return 70;}
	public int geto13Height(){ return 30;}
	
	public int geto14TopX(){return 395;} 
	public int geto14TopY(){return 720;}
	public int geto14Width(){ return 30;}
	public int geto14Height(){ return 60;}
	
	public int geto15TopX(){return 750;}
	public int geto15TopY(){return 800;} 
	public int geto15Width(){ return 100;}
	public int geto15Height(){ return 200;}

	public int geto16TopX(){return 750;} 
	public int geto16TopY(){return 0;}
	public int geto16Width(){ return 100;}
	public int geto16Height(){ return 200;}
	
	public int geto17TopX(){return 1300;} 
	public int geto17TopY(){return 75;}
	public int geto17Width(){ return 150;}
	public int geto17Height(){ return 100;}

	public int geto18TopX(){return 1000;}
	public int geto18TopY(){return 425;} 
	public int geto18Width(){ return 100;}
	public int geto18Height(){ return 150;}



	
public void draw (Graphics g){
//background color
g.setColor(Color.green);
g.fillRect (0, 0, 1600, 1000);

  // Barrier Left
  g.setColor(Color.black);
  //top
   //center
  g.fillRect (350, 380, 30, 350);
  //bottom
  g.fillRect (300, 690, 50, 40);
  
  
  // Barrier Right
  g.setColor(Color.black);
  //top
  g.fillRect (1270, 380, 50, 40);
  //center
  g.fillRect (1250, 380, 30, 350);
  //bottom
  g.fillRect (1270, 690, 50, 40);
  
//leftsquaretop1
  g.setColor(Color.BLACK);
  g.fillRect(1100, 250, 70, 30);
  
	  //leftsquaretop2
  g.setColor(Color.BLACK);
  g.fillRect(1150, 250, 30, 60);
  
  //leftsquarebottom1
  g.setColor(Color.BLACK);
  g.fillRect(1100, 750, 70, 30);
  
  	  //leftsquarebottom2
  g.setColor(Color.BLACK);
  g.fillRect(1150, 720, 30, 60);
  
  //rightsquaretop1
  g.setColor(Color.BLACK);
  g.fillRect(395, 250, 70, 30);
  
  	  //rightsquaretop2
  g.setColor(Color.BLACK);
  g.fillRect(395, 250, 30, 60);
  
  //rightsquarebottom1
  g.setColor(Color.BLACK);
  g.fillRect(395, 750, 70, 30);
  
  //rightsquarebottom1
  g.setColor(Color.BLACK);
  g.fillRect(395, 720, 30, 60);

  
  
  
  //Obstacle bottom    
  g.setColor(Color.black);
  g.fillRect (750, 800, 100, 200);
  
  
  //Obstacle Top   
  g.setColor(Color.black);
  g.fillRect (750, 0, 100, 200);
  
   //Obstacle left
  g.setColor(Color.black);
  g.fillRect (1300, 75, 150, 100);
  
   //Obstacle right
  g.setColor(Color.black);
  g.fillRect (1000, 425, 100, 150);
  
  g.fillRect (200, 850, 150, 100);;
  g.fillRect (1300, 850, 150, 100);;
  g.fillRect (200, 75, 150, 100);
  g.fillRect (500, 425, 100, 150);
  
  


    
    
 
   
  //Background Effects
  // Random r=new Random();
  // for(int j=0;j<250;j++){
	 //  int x=r.nextInt(1000);
	 //   int y=r.nextInt(1000);
	 //   int size=r.nextInt(20);
  //	  int endX=0,endY=0;
    
	
 	//  for ( int i = 0; i<6; i++ ){
 	//	endX = x + (int)(size*Math.cos( (2*Math.PI/6)*i ));
 	//  endY = y - (int)(size*Math.sin( (2*Math.PI/6)*i ));
  	//  g.drawLine( x, y, endX, endY );
  	 
  	 

  	 

  	


	
}
  	  
}
 