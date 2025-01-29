//inheritance
public class Player2 extends Player {
    private String assassin;
    private String tank;
    private int totalLevel;
    private String playername;
    private String squad;
    private int playerlevel;

    public Player2(String warrior, String marksman, String mage, String support, String assassin, String tank, int level, String playername, String squad, int playerlevel) {
        super(warrior, marksman, mage, support);
        this.assassin = assassin;
        this.tank = tank;
        this.totalLevel = level;
        this.playername = playername;
        this.squad = squad;
        this.playerlevel = playerlevel;
    }

    //overriding
    @Override
    public void displayDetails() {
        super.displayDetails();
        System.out.println("Assassin: " + assassin);
        System.out.println("Tank: " + tank);
        System.out.println("Total Level: " + totalLevel);
        System.out.println("Player Name: " + playername);
        System.out.println("Squad: " + squad);
        System.out.println("Player Level: " + playerlevel);
    }
}
