 import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Catcher  extends Actor
{
    public void act() 
  {
      if(Greenfoot.isKeyDown("left") == true)
    {
     move(-5);  
    
    }
    else if(Greenfoot.isKeyDown("right") == true)
    {
        move(5);
    }
    else if(Greenfoot.isKeyDown("A") == true)
    {
        move(-5);
    }
    else if(Greenfoot.isKeyDown("D") == true)
    {
        move(5);
    }
    if(isTouching(Leaf.class) == true)
    {
        removeTouching(Leaf.class);
    }
  }
}
