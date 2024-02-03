import greenfoot.*; 
import java.awt.Graphics2D;
import java.awt.BasicStroke;
/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player1 extends Actor
{
    public int delta=50;
    int time=1;
    OneRedBall OneRedBall = new OneRedBall();
    TwoRedBall TwoRedBall=new TwoRedBall();
    ThreeRedBall ThreeRedBall =new ThreeRedBall();
    
    public void act() 
    {
        move(4);
        if(time==15)
        {
            //System.out.println("11111111111111111111111111111");
            if(isTouching(OneRedBall.class))
            {
                removeTouching(OneRedBall.class);
                getWorld().addObject(new TwoRedBall(),getX(),getY());
            }
            if(isTouching(TwoRedBall.class))
            {
                removeTouching(TwoRedBall.class);
                getWorld().addObject(new ThreeRedBall(),getX(),getY());
            }
            if(isTouching(ThreeRedBall.class))
            {
                removeTouching(ThreeRedBall.class);
                MyWorld  MyWorld = new MyWorld();
                MyWorld.addnn(getX(),getY());
            }
            this.getWorld().removeObject(this);
            time=1;
        }
        time++;
    }  

    public void addedToWorld(World wold)
    {
        GreenfootImage image = new GreenfootImage(delta,delta);
        int d=19;
        Graphics2D g2=image.getAwtImage().createGraphics();      
        g2.setStroke(new BasicStroke(8));
        g2.setColor(java.awt.Color.BLUE);
        g2.drawArc(d,d,7,7,0,360);
        g2.dispose();
        setImage(image);
    }

    public void moment()
    {

    }
}

