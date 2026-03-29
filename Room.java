import java.util.ArrayList;

public class Room {
   private ArrayList<Item> itemsInRoom;
   private ArrayList<Monster> monstersInRoom;
   private final int maxNumberOfMonsters = 2;
   private final int maxNumberOfItems = 2;
   
   public Room() {
      // TODO: Generate a random number of monsters and items between 1 and max (inclusive)
      int numItems = (int)(Math.random() * maxNumberOfItems) + 1;
      int numMonsters = (int)(Math.random() * maxNumberOfMonsters) + 1;
      
      // TODO: Create the ArrayLists to hold the Items and Monsters in the Room and populate them with Monsters and Items
      itemsInRoom = new ArrayList<Item>();
      monstersInRoom = new ArrayList<Monster>();
      
      for (int i = 0; i < numItems; i++) 
      {
         itemsInRoom.add(new Item());
      }
      
      for (int i = 0; i < numMonsters; i++) 
      {
         monstersInRoom.add(new Monster());
      }
      
   }
   
   public String toString() {
      String returnString = "Items in room:\n";

      // TODO: build a returnString that nicely formats the Monsters and Items in the Room
      // HINT: Use a for-each loop to go through the ArrayLists
      
      for (Item item : itemsInRoom) 
      {
         returnString += item + "\n";
      }
      
      returnString += "\nMonsters in room:\n";
      
      for (Monster monster : monstersInRoom) 
      {
         returnString += monster + "\n";
      }
      
      return returnString;   
      }

   }