import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
import java.io.*;
/**
 * Write a description of class Space here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Space extends AllObject
{
    /**
     * Act - do whatever the Space wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public Space()
    {
        scaleDownImage(2,2);
    }

    public void act()
    {
        rr();   
    }

    public void rr()
    {
        if(isTouching(OneRedBall.class))
        {
            removeTouching(OneRedBall.class);
        }  
        if(isTouching(TwoRedBall.class))
        {
            removeTouching(TwoRedBall.class);
        }  
        if(isTouching(ThreeRedBall.class))
        {
            removeTouching(ThreeRedBall.class);
        }  
        if(isTouching(OneBlueBall.class))
        {
            removeTouching(OneBlueBall.class);
        }  
        if(isTouching(TwoBlueBall.class))
        {
            removeTouching(TwoBlueBall.class);
        }  
        if(isTouching(ThreeBlueBall.class))
        {
            removeTouching(ThreeBlueBall.class);
        }  
        if(isTouching(Player1.class))
        {
            removeTouching(Player1.class);
        }  
        if(isTouching(Player2.class))
        {
            removeTouching(Player2.class);
        }  
        this.getWorld().removeObject(this);
    }
}
