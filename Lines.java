import greenfoot.*; 
public class Lines extends Actor
{ 
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
        image.setColor(Color.RED);
        image.fill();
        setImage(image);
    }

}
