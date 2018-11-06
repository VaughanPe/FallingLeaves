import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)


public class Leaf  extends Actor
{
        private GreenfootImage leaf0 = new GreenfootImage("cutoutleaf0.png");
        private GreenfootImage leaf1 = new GreenfootImage("cutoutleaf1.png");
        private GreenfootImage leaf2 = new GreenfootImage("cutoutleaf2.png");
        private GreenfootImage leaf3 = new GreenfootImage("cutoutleaf3.png");
    int x = Greenfoot.getRandomNumber(4);
    public Leaf()
    {
        /* Change the image of the leaf depending on whether the random
         * number is 0, 1, 2, or 3. 
         */ turn(90);
         
        if(x == 1)
        {
          setImage((leaf1));
        }
        else if(x == 4)
        {
          setImage((leaf0));
        }
        else if(x == 2)
        {
            setImage((leaf2));
        }
        else if(x == 3)
        {
            setImage((leaf3));
        }
    }

    public void act() 
    {    
           move(5);
        if(getY()>=getWorld().getHeight()-1)
        {
          getWorld().removeObject(this);
        }
    }   
}
