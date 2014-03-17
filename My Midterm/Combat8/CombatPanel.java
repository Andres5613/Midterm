import java.awt.Color;
import java.awt.Graphics;

import javax.swing.JPanel;

public class CombatPanel extends JPanel {

	private Tank t,t2;
	private Level l;
	
	public void Fire(int tank){
		Tank temp;
		if(tank==1)temp=t;
		else temp=t2;
		temp.fire();
	}
	

	public void update(){
		t.moveBullet();
		t2.moveBullet();
		
		Bullet b1,b2;
		b1=t.getBullet();
		b2=t2.getBullet();
	
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
				b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight())){
				  t.setX(300);t.setY(550);
				  t2.setX(1325);t2.setY(550);
				  b1.setisFired(false);    
				}
		
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
				b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight())){
				t.setX(300);t.setY(550);
				t2.setX(1325);t2.setY(550);
				b2.setisFired(false);    
				}
		
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				355,80,90,400)){
			b1.setisFired(false);
 		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				355,80,90,400)){
				  b2.setisFired(false);   
		}
		
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				350,380,30,350)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				350,380,30,350)){
				  b2.setisFired(false);   
		}
		

		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				300,690,50,40)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				300,690,50,40)){
				  b2.setisFired(false);   
		}

		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				1250,380,30,350)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				1250,380,30,350)){
				  b2.setisFired(false);   
		}
		
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				1270,690,50,40)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				1270,690,50,40)){
				  b2.setisFired(false);   
		}
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				 1100,250,70,30)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				 1100,250,70,30)){
				  b2.setisFired(false);   
		}
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				1150,250,30,60)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				1150,250,30,60)){
				  b2.setisFired(false);   
		}
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				1100,750,70,30)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				1100,750,70,30)){
				  b2.setisFired(false);   
		}
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				1100,720,30,60)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				1100,720,30,60)){
				  b2.setisFired(false);   
		}
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				395,250,70,30)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				395,250,70,30)){
				  b2.setisFired(false);   
		}
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				395,250,30,60)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				395,250,30,60)){
				  b2.setisFired(false);   
		}
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				395,750,70,30)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				395,750,70,30)){
				  b2.setisFired(false);   
		}
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				395,720,30,60)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				395,720,30,60)){
				  b2.setisFired(false);   
		}
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				750,800,100,200)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				750,800,100,200)){
				  b2.setisFired(false);   
		}
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				750,0,100,200)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				750,0,100,200)){
				  b2.setisFired(false);   
		}
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				1300,75,150,100)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				1300,75,150,100)){
				  b2.setisFired(false);   
		}
		if(bounding_box_collision(b1.getTopX(),b1.getTopY(),b1.getWidth(),b1.getHeight(),
				1000,425,100,150)){
				  b1.setisFired(false);   
		}
		if(bounding_box_collision(b2.getTopX(),b2.getTopY(),b2.getWidth(),b2.getHeight(),
				1000,425,100,150)){
				  b2.setisFired(false);   
		}
	}
	
	

	public void moveDir(char c,int tank){
		Tank temp;
		if(tank==1)temp=t;
		else temp=t2;
		temp.move(c);
		
	      System.out.println(t.getTopX()+","+t.getTopY());

		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight())){
		if(c=='u')temp.setY(temp.getY()+5);
		if(c=='d')temp.setY(temp.getY()-5);
		if(c=='l')temp.setX(temp.getX()+5);
		if(c=='r')temp.setX(temp.getX()-5);
		}

		//obs1  g.fillRect (300, 380, 50, 40);
	      System.out.println("ob1");

		if(bounding_box_collision(temp.getTopX(),temp.getTopY(),temp.getWidth(),temp.getHeight(),
		      300,380,50,40
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}
	//obs2
		if(bounding_box_collision(temp.getTopX(),temp.getTopY(),temp.getWidth(),temp.getHeight(),
		      l.geto2TopX(),l.geto2TopY(),l.geto2Width(),l.geto2Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}


	//obs3
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto3TopX(),l.geto3TopY(),l.geto3Width(),l.geto3Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}
	//obs4
		if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto4TopX(),l.geto4TopY(),l.geto4Width(),l.geto4Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs5
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto5TopX(),l.geto5TopY(),l.geto5Width(),l.geto5Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs6
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto6TopX(),l.geto6TopY(),l.geto6Width(),l.geto6Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs7
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto7TopX(),l.geto7TopY(),l.geto7Width(),l.geto7Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs8
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto8TopX(),l.geto8TopY(),l.geto8Width(),l.geto8Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}
			
	//obs9
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto9TopX(),l.geto9TopY(),l.geto9Width(),l.geto9Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs10
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto10TopX(),l.geto10TopY(),l.geto10Width(),l.geto10Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs11
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto11TopX(),l.geto11TopY(),l.geto11Width(),l.geto11Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs12
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto12TopX(),l.geto12TopY(),l.geto12Width(),l.geto12Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs13
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto13TopX(),l.geto13TopY(),l.geto13Width(),l.geto13Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs14
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto14TopX(),l.geto14TopY(),l.geto14Width(),l.geto14Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs15
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto15TopX(),l.geto15TopY(),l.geto15Width(),l.geto15Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs16
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto16TopX(),l.geto16TopY(),l.geto16Width(),l.geto16Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs17
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto17TopX(),l.geto17TopY(),l.geto17Width(),l.geto17Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs18
	if(bounding_box_collision(t.getTopX(),t.getTopY(),t.getWidth(),t.getHeight(),
		      l.geto18TopX(),l.geto18TopY(),l.geto18Width(),l.geto18Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs1
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto1TopX(),l.geto1TopY(),l.geto1Width(),l.geto1Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}
	//obs2
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto2TopX(),l.geto2TopY(),l.geto2Width(),l.geto2Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}


	//obs3
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto3TopX(),l.geto3TopY(),l.geto3Width(),l.geto3Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}
	//obs4
		if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto4TopX(),l.geto4TopY(),l.geto4Width(),l.geto4Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs5
	if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto5TopX(),l.geto5TopY(),l.geto5Width(),l.geto5Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs6
	if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto6TopX(),l.geto6TopY(),l.geto6Width(),l.geto6Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs7
	if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto7TopX(),l.geto7TopY(),l.geto7Width(),l.geto7Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs8
	if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto8TopX(),l.geto8TopY(),l.geto8Width(),l.geto8Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}
			
	//obs9
	if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto9TopX(),l.geto9TopY(),l.geto9Width(),l.geto9Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs10
	if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto10TopX(),l.geto10TopY(),l.geto10Width(),l.geto10Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs11
	if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto11TopX(),l.geto11TopY(),l.geto11Width(),l.geto11Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs12
	if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto12TopX(),l.geto12TopY(),l.geto12Width(),l.geto12Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs13
	if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto13TopX(),l.geto13TopY(),l.geto13Width(),l.geto13Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs14
	if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto14TopX(),l.geto14TopY(),l.geto14Width(),l.geto14Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs15
	if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto15TopX(),l.geto15TopY(),l.geto15Width(),l.geto15Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs16
	if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto16TopX(),l.geto16TopY(),l.geto16Width(),l.geto16Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs17
	if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto17TopX(),l.geto17TopY(),l.geto17Width(),l.geto17Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			}

	//obs18
	if(bounding_box_collision(t2.getTopX(),t2.getTopY(),t2.getWidth(),t2.getHeight(),
		      l.geto18TopX(),l.geto18TopY(),l.geto18Width(),l.geto18Height()
		      )
		    ){
			if(c=='u')temp.setY(temp.getY()+15);
			if(c=='d')temp.setY(temp.getY()-15);
			if(c=='l')temp.setX(temp.getX()+15);
			if(c=='r')temp.setX(temp.getX()-15);
			

		}
	}

	public CombatPanel(){

	   t=new Tank(300,550);
	   t2=new Tank(1325,550);
	   l=new Level();
	}

	boolean bounding_box_collision(int b1_x, int b1_y, int b1_w, int b1_h, int b2_x, int b2_y, int b2_w, int b2_h)
	{
	    if ((b1_x > b2_x + b2_w - 1) || // is b1 on the right side of b2?
	        (b1_y > b2_y + b2_h - 1) || // is b1 under b2?
	        (b2_x > b1_x + b1_w - 1) || // is b2 on the right side of b1?
	        (b2_y > b1_y + b1_h - 1))   // is b2 under b1?
	    {
	        // no collision
	        return false;
	    }

	    // collision
	    return true;
}

	public void paintComponent(Graphics g){
		g.setColor(Color.BLUE);
		g.fillRect(0, 0, 300, 400);
		g.setColor(Color.black);
		l.draw(g);
		t.draw(g);
		t2.draw(g);

	}

}
