import greenfoot.*; 
import java.awt.Graphics2D;
import java.awt.BasicStroke;
/**
 * Write a description of class Player1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Player2 extends Actor
{
    public int delta=50;
   
    public void act() 
    {

    }  

    public void addedToWorld(World wold)
    {
        GreenfootImage image = new GreenfootImage(delta,delta);
        int d=25;
        Graphics2D g2=image.getAwtImage().createGraphics();      
        g2.setStroke(new BasicStroke(10));
        g2.setColor(java.awt.Color.RED);
        g2.drawArc(d,d,10,10,0,360);
        g2.dispose();
        setImage(image);
    }
}

