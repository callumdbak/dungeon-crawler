public class Item {
   private String itemType;
   private boolean isEquipped;
   private final String[] itemTypes = {
            "Rusty Sword",
            "Healing Potion",
            "Torch",
            "Ancient Scroll",
            "Leather Armor",
            "Silver Key",
            "Magic Amulet",
            "Goblin Dagger",
            "Spellbook of Fire",
            "Bag of Gold Coins",
            "Mysterious Rune Stone",
            "Skeleton Bone",
            "Cursed Ring",
            "Potion of Invisibility",
            "Iron Shield",
            "Dragon Egg",
            "Trap Disarming Kit",
            "Crystal Orb",
            "Venomous Dagger",
            "Tattered Map"
        };

   public Item() {
      // TODO: Pick a random item type from itemTypes
      int randomIndex = (int) (Math.random() * itemTypes.length);
      this.itemType = itemTypes[randomIndex];
   }
   
   public String getItemType() {
      return this.itemType;
   }
   
   public String toString() {
      // TODO: Build a descriptive String for use by other methods
      if (isEquipped == true)
      {
         return itemType + ": (Equipped)";
      }
      else
      {
         return itemType + ": (Not Equipped)";
      }
      
      
      
      
   }
   
}
