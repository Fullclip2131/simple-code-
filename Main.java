//Main class
public class Main {
    
    public static void main(String[] args) {
        // create an object of the Player class
        Player player1 = new Player("Hisoka", "Killua", "Gon", "Kurapika");
        Player2 p2 = new Player2("Mikasa", "Eren", "Armin", "Levi", "Annie", "Reiner", 25, "FULLCLIP", "Scout", 100);   
        
        //display the details
        player1.displayDetails();//output: Hisoka, Killua, Gon, Kurapika
        p2.displayDetails();//output: Mikasa, Eren, Armin, Levi, Annie, Reiner, 25, Eren, Scout, 100
    }
}