//Class
public class Player {
    
    //fields
    private String warrior;
    private String marksman;
    private String mage;
    private String support;

    // constructor
    public Player(String warrior, String marksman, String mage, String support) {
        this.warrior = warrior;
        this.marksman = marksman;
        this.mage = mage;
        this.support = support;
    }

    // methods
    public void displayDetails() {
        System.out.println("Warrior: " + warrior);
        System.out.println("Marksman: " + marksman);
        System.out.println("Mage: " + mage);
        System.out.println("Support: " + support);
    }
}