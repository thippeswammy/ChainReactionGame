import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class AllObject here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AllObject extends Actor
{
    /**
     * Act - do whatever the AllObject wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }    
    private int horizScaleDown,vertScaleDown;
    public void scaleDownImage(int x,int y)
    {
        horizScaleDown=x;
        vertScaleDown=y;
        getImage().scale(getImage().getWidth()/horizScaleDown, getImage().getHeight()/vertScaleDown); 
    }
}
