import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class WinImage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class WinImage extends Actor
{
    /**
     * Act - do whatever the WinImage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public WinImage(){
        getImage().scale(getImage().getWidth()/4, getImage().getHeight()/4); 
    }
}
