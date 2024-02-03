import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Looseimage here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Looseimage extends Actor
{
    /**
     * Act - do whatever the Looseimage wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public Looseimage(){
        getImage().scale(getImage().getWidth()/4, getImage().getHeight()/4); 
    }
}
