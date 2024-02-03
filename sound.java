import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class sound here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class sound extends AllObject
{
    /**
     * Act - do whatever the sound wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }   

    public void PlaySound()
    {
        Greenfoot.playSound("chainaaa.wav");
        Greenfoot.delay(23);
    }
}
