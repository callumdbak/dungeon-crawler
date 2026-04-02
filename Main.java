public class Main {
   public static void main(String[] args) {
   
     Player p = new Player(100, "Hero", 0, 0);
     Map map = new Map(5, 6);
     System.out.println(p.look(map));
     p.moveTo(1, 2);
     System.out.println(p.look(map));
      
   } 
}
