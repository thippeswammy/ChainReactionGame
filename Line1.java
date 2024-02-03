import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Line1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Line1 extends Actor
{
    /**
     * Act - do whatever the Line1 wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   
    static int a=1;
    public void Change(int e)
    {
        a=e;
    }

    public void addedToWorld(World world)
    {
        int d=2;
        int size=0;
        if(a==2)
            size=getWorld().getWidth();
        if(a==1)
            size=getWorld().getHeight();
        if(a==21)
            size=getWorld().getWidth()-35;
        if(a==12)
            size=getWorld().getHeight()-35;
        if(a==3)
            size=33;
        if(a==4)
            size=35;
        GreenfootImage image =new GreenfootImage(size-10,d);
        image.setColor(Color.BLUE);
        image.fill();
        setImage(image);
    }
}
