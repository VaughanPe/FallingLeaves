import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class FallWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class AutumnWorld  extends World
{

   /**
    * Constructor for objects of class FallWorld.
    * 
    */
   public AutumnWorld()
   {    
       
      // Create a new world with 20x20 cells with a cell size of 10x10 pixels.
      super(750, 500, 1); 
      //adds a Catcher actor t the world when the program is started
      addObject(new Catcher(),getWidth()/2, getHeight()/2+200);
   }
    
    /**
    * act - things you want to do each time around go in here
    * 
    */
    public void act()
    //creates a new leaf 1% of the time
    { if(Greenfoot.getRandomNumber(99) == 1)
        {
       addObject(new Leaf(),Greenfoot.getRandomNumber(500),0); 
    }
   }
}
